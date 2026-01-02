# 🍔 Feasto – Full-Stack Food Delivery Platform

A **production-style food delivery platform** inspired by real food-tech systems.  
This project demonstrates **system design, backend architecture, and frontend integration** using **Spring Boot + React**.

Built with an interview-first mindset to showcase **real-world backend and full-stack engineering skills**.

---

## 🚀 Quick Highlights (Recruiter View)

- End-to-end food delivery workflow (Customer → Restaurant → Delivery Partner)
- Clean **Spring Boot + JPA** backend architecture
- Role-based workflows for multiple user types
- Interactive **analytics dashboards** and **map-based tracking**
- Cloud-based image handling using **Cloudinary**
- Designed using **real system design principles**, not toy examples

---

## 🧠 System Design Overview

### User Roles
- **Customers** – browse restaurants, place orders, track delivery
- **Restaurants** – manage menus, receive and process orders
- **Delivery Partners** – accept orders and complete deliveries
- **Admin / Business Users** – analytics and platform insights

### Core Workflows
- User registration & authentication
- Restaurant discovery & menu management
- Order placement & lifecycle tracking
- Delivery partner assignment
- Payments & feedback loop

---

## 🛠️ Tech Stack

### Backend
- Spring Boot
- Spring Data JPA (Hibernate)
- RESTful APIs
- MySQL
- Layered architecture (Controller → Service → Repository)

### Frontend
- React.js
- **React ApexCharts** – analytics & visual dashboards
- **React Leaflet** – map-based location and delivery visualization
- **Cloudinary** – image upload & management (restaurants, menu items)

---

## 🗂️ Backend Architecture


- Clear separation of concerns
- Proper JPA entity relationships
- APIs aligned with real business workflows (beyond CRUD)

---

## 📊 Key Features

- Restaurant discovery & menu listing
- Order lifecycle management  
  (PLACED → PREPARING → OUT_FOR_DELIVERY → DELIVERED)
- Analytics dashboards (orders, trends, insights)
- Map-based location visualization
- Cloud-based media storage
- Scalable entity and API design

---

## ⚙️ How to Run the Project

### Backend
```bash
cd Feasto-be
mvn clean install
mvn spring-boot:run

### Frontend
```bash
cd Feasto-fe
npm install
npm run dev
