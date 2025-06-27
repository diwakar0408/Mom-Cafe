# ☕ MoM-Cafe

A Spring MVC-based online food ordering and menu management application. MoM-Cafe simulates a real-world restaurant where users can explore the menu, place orders, and interact with a dynamic web interface.

---

## 📌 Project Description

**MoM-Cafe** is a Java web application developed using **Spring MVC**. It is designed to mimic a café or restaurant ordering system where:
- Admins can add and manage food items.
- Users can browse food categories and order items.
- The app uses JSP pages for view rendering and Servlets/Spring Controllers for backend logic.

The project emphasizes the fundamentals of the MVC architecture, form data handling, request routing, and basic session control.

---

## 🛠️ Technologies Used

| Technology            | Purpose                                                 |
|-----------------------|----------------------------------------------------------|
| **Java**              | Backend programming language                             |
| **Spring MVC (4.0.1)**| MVC architecture, controllers, view resolvers            |
| **Apache Maven**      | Project and dependency management                        |
| **JSP**               | View layer (frontend rendering)                          |
| **Servlet API**       | Request/response handling behind Spring                  |
| **WAR Packaging**     | Deployable format for servlet containers like Tomcat     |
| **Eclipse IDE**       | Developed using Eclipse IDE                              |

---

## 📂 Project Structure

```
MoM-Cafe/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com.momcafe/
│       │       ├── controllers/
│       │       └── services/
│       └── webapp/
│           ├── views/ (JSP files)
│           ├── css/
│           ├── js/
│           └── WEB-INF/
│               └── web.xml
│
├── pom.xml
└── README.md
```

---

## ⚙️ Features

- 🍽️ Browse food menu and categories
- 🛒 Add food items to cart
- ✍️ Admin can manage menu items (Add/Edit/Delete)
- 🧾 Bill preview after order
- 📄 JSPs used for rendering forms and pages
- 🧹 MVC pattern implementation with Spring Controllers
- 🧭 Web deployment descriptor (`web.xml`) configured
- 🎯 Focused on real-time user interaction

---

## 🚀 How to Run

### Requirements:
- Java JDK 8+
- Apache Maven
- Tomcat 8/9
- Eclipse or IntelliJ IDEA (optional)

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/MoM-Cafe.git
   cd MoM-Cafe
   ```

2. Import into Eclipse/IntelliJ as a **Maven Web Project**.

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Deploy the generated `.war` file to Tomcat's `webapps` folder.

5. Start the server and open:
   ```
   http://localhost:8080/MoM-Cafe/
   ```

---

## 👨‍💻 Author

**Undalu Diwakar**  
Java Full Stack Developer  
[LinkedIn](#) | [GitHub](#)

---

## 📜 License

Licensed under the MIT License. Use it freely for learning and development purposes.

