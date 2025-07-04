# 🛒 E-commerce API - Java Spring Boot

Este projeto é uma **API RESTful de E-commerce** desenvolvida com **Java Spring Boot**. A aplicação simula um sistema de compras online com funcionalidades como cadastro de produtos, pedidos, categorias, usuários e pagamentos.

---

## 📌 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (para testes)
- PostgreSQL (opcional)

---

## 📐 Modelo de Domínio

O sistema foi modelado com base em um diagrama UML que define as seguintes entidades principais:

- **User:** Cliente que realiza pedidos.
- **Order:** Pedido de compra com status e momento da realização.
- **OrderItem:** Itens do pedido, com quantidade e preço.
- **Product:** Produto com descrição, imagem e preço.
- **Category:** Categoria dos produtos (um produto pode ter várias).
- **Payment:** Pagamento associado a um pedido.
- **OrderStatus:** Enum com os status possíveis do pedido (WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).

---

## 📦 Funcionalidades

- 🛍️ CRUD de produtos e categorias
- 📦 Criação de pedidos e associação de produtos
- 💳 Registro de pagamentos
- 📄 Cálculo automático de totais dos pedidos e itens

---

## 🛠️ Diagrama UML
![diagram](https://github.com/user-attachments/assets/c9a88a28-2721-4510-b6bd-21a4060f7750)
