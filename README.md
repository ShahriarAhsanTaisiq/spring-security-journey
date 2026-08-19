# 🔐 Spring Security Journey

Welcome to my **Spring Security Journey** repository!

This repository is my personal **learning lab, sandbox, and documentation space** for exploring how to secure modern Spring Boot applications with Spring Security.

The project is organized as a progressive journey—from fundamental authentication concepts to more advanced topics such as **JWT, OAuth2, OpenID Connect, CSRF, CORS, and method-level authorization**.

The goal is not only to build working examples, but also to understand **why each security mechanism exists, how it works, and when it should be used**.

---

## 📌 Learning Roadmap

This checklist tracks my progress and will be updated as I learn and implement new concepts.

### 🔰 Fundamentals

* [ ] Setting up Spring Security in a Spring Boot application
* [ ] Understanding the Spring Security filter chain
* [ ] Understanding authentication vs. authorization
* [ ] Configuring `SecurityFilterChain`
* [ ] Securing and permitting HTTP endpoints

### 👤 Authentication

* [ ] In-Memory Authentication
* [ ] Creating users with roles and authorities
* [ ] Database Authentication
* [ ] Loading users with JPA/Hibernate
* [ ] Implementing `UserDetailsService`
* [ ] Custom `UserDetails`
* [ ] Custom authentication providers

### 🔑 Password Security

* [ ] Understanding password hashing
* [ ] BCrypt password encoding
* [ ] Password storage best practices
* [ ] Configuring `PasswordEncoder`

### 🛡️ Authorization

* [ ] Role-Based Access Control (RBAC)
* [ ] Authorities vs. roles
* [ ] URL-based authorization
* [ ] `@PreAuthorize`
* [ ] `@Secured`
* [ ] Method-level security
* [ ] Securing service-layer methods

### 🎫 JWT Authentication

* [ ] Understanding JSON Web Tokens
* [ ] Stateless authentication
* [ ] Creating JWTs
* [ ] Validating JWTs
* [ ] JWT authentication filters
* [ ] Access and refresh tokens
* [ ] Securing REST APIs with JWT

### 🌐 OAuth2 & OpenID Connect

* [ ] Understanding OAuth2
* [ ] Understanding OpenID Connect
* [ ] OAuth2 Login
* [ ] Google authentication
* [ ] GitHub authentication
* [ ] OAuth2 resource servers
* [ ] Working with external identity providers

### 🔒 Web Security

* [ ] Understanding CSRF
* [ ] CSRF protection
* [ ] Understanding CORS
* [ ] Configuring CORS
* [ ] Session management
* [ ] Stateless vs. stateful authentication
* [ ] Security headers

---

## 🛠️ Tech Stack

| Technology         | Purpose                          |
| ------------------ | -------------------------------- |
| ☕ Java 17+         | Programming language             |
| 🌱 Spring Boot 4.x | Application framework            |
| 🔐 Spring Security | Authentication & authorization   |
| 📦 Maven           | Dependency management            |
| 📮 Postman         | API testing                      |

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17 or later
* Maven (optional if using the Maven Wrapper)
* Git
* Postman, if you want to test REST APIs

You can verify your Java installation with:

```bash
java -version
```

---

### 1. Clone the Repository

```bash
git clone https://github.com/ShahriarAhsanTaisiq/spring-security-journey.git
```

### 2. Navigate to the Project

```bash
cd spring-security-journey
```

### 3. Run the Application

Using the Maven Wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

Or, if Maven is installed globally:

```bash
mvn spring-boot:run
```

---

## 🧪 Testing the Application

Once the application is running, it will normally be available at:

```text
http://localhost:8080
```

You can test secured endpoints using:

* **Postman**
* **cURL**
* **Browser** for endpoints that support browser-based access

For example:

```bash
curl http://localhost:8080/api/hello
```

Depending on the security configuration of the current example, the request may require authentication or specific roles.

---

## 📂 Project Structure (Expected)

The project structure will evolve as new Spring Security concepts are added.

```text
spring-security-journey/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── shahriar/
│   │   │           └── security/
│   │   │               ├── config/
│   │   │               │   └── # Security configurations
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── # REST/API controllers
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── # Entities, DTOs, etc.
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── # JPA repositories
│   │   │               │
│   │   │               └── service/
│   │   │                   └── # Business logic & security services
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── # Unit & integration tests
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## 🧩 Topics Covered

The repository will contain independent examples and experiments for different Spring Security concepts.

### 🔰 Basic Security

Learn how Spring Security works out of the box and how to customize endpoint access.

### 👤 Authentication

Explore different approaches to authenticating users, including:

* In-memory users
* Database-backed users
* Custom `UserDetailsService`
* Custom user models

### 🛡️ Authorization

Learn how to control access based on:

* Roles
* Authorities
* URL patterns
* Method-level security

### 🎫 JWT

Build stateless REST APIs using JSON Web Tokens and explore how authentication information can be securely transferred between clients and servers.

### 🌐 OAuth2 & OpenID Connect

Explore modern delegated authentication and identity management using providers such as Google and GitHub.

### 🔒 CSRF & CORS

Understand common browser security concerns and learn how Spring Security handles cross-site requests and CSRF protection.

---

## 🧠 Learning Philosophy

This repository is primarily focused on **learning by implementation**.

For each topic, I aim to:

1. Understand the underlying security concept.
2. Build a small working example.
3. Test the implementation.
4. Document important findings.
5. Refactor the example when necessary.
6. Move toward more advanced implementations.

The examples may intentionally start simple before gradually becoming more production-oriented.

---

## 🧪 Development & Testing

When experimenting with security configurations, I will primarily use:

```text
Browser
   │
   ▼
Spring Boot Application
   │
   ▼
Spring Security
   │
   ├── Authentication
   ├── Authorization
   ├── Filters
   └── Security Context
   │
   ▼
Controller / Service
   │
   ▼
Database
```

Postman will be used to test authentication flows and protected REST endpoints.

---

## ⚠️ Important Note

This repository is primarily a **learning project**.

Some examples may intentionally use simplified configurations, hardcoded credentials, H2 databases, or other approaches that are useful for understanding Spring Security but should **not automatically be copied into production applications**.

Before using any security configuration in a real application, review:

* Credential management
* Password storage
* Secret management
* Token expiration
* HTTPS
* CORS configuration
* CSRF protection
* Session management
* Database security
* Authentication provider configuration
* Authorization rules

---

## 📈 Progress

I will continue updating this repository as I progress through Spring Security.

The roadmap is intentionally incremental:

```text
Spring Security Basics
        ↓
Authentication
        ↓
Database Authentication
        ↓
Password Security
        ↓
Authorization
        ↓
Method-Level Security
        ↓
JWT
        ↓
OAuth2
        ↓
OpenID Connect
        ↓
Advanced Security Concepts
```

---

## 🤝 Contributions & Suggestions

This repository is primarily a personal learning project, but suggestions, corrections, and discussions are welcome.

If you notice an incorrect implementation or have a better approach, feel free to open an issue or submit a pull request.

---

## 📚 Resources

As the journey progresses, useful documentation and references will be added here.

* [Spring Security Documentation](https://docs.spring.io/spring-security/reference/)
* [Spring Boot Documentation](https://docs.spring.io/spring-boot/index.html)
* [Spring Guides](https://spring.io/guides)
* [OAuth 2.0](https://oauth.net/2/)
* [OpenID Connect](https://openid.net/developers/how-connect-works/)

---

## ⭐ Why This Repository?

> **Learn → Build → Break → Understand → Secure → Repeat**

This repository is a record of my journey toward understanding application security with **Spring Boot and Spring Security**, one concept at a time.

If you're also learning Spring Security, feel free to explore the examples and follow along. 🚀
