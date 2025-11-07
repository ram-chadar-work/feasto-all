package com.tka.feasto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.feasto.dto.PaymentDTO;
import com.tka.feasto.entity.Payment;
import com.tka.feasto.enums.PaymentStatus;
import com.tka.feasto.exception.ResourceNotFoundException;
import com.tka.feasto.mapper.CustomMapper;
import com.tka.feasto.repository.OrderRepository;
import com.tka.feasto.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private CustomMapper mapper;

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private OrderRepository orderRepository;

	public PaymentDTO processPayment(PaymentDTO dto) {
		orderRepository.findById(dto.getOrderId())
				.orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + dto.getOrderId()));
		Payment payment = mapper.toPayment(dto);
		payment.setPaymentStatus(PaymentStatus.COMPLETED); // Simulated processing
		Payment saved = paymentRepository.save(payment);
		return mapper.toPaymentDTO(saved);
	}

	public PaymentDTO getPaymentById(Long id) {
		Payment payment = paymentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Payment not found with id: " + id));
		return mapper.toPaymentDTO(payment);
	}
}