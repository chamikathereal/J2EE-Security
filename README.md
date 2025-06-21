# 🚀 J2EE-Security

## 📝 Project Overview

**J2EE-Security** is a simple yet comprehensive Java EE project that demonstrates role-based security, authentication, and authorization in enterprise web applications. The project uses EJBs, servlets, and declarative security in `web.xml` to provide protected admin and user areas, secure login/logout, and fine-grained access control at both the web and business logic layers. This project is ideal for learning how to implement robust security in Java EE applications using modern best practices.

---

## 📽️ Demo Video
[![J2EE-Interceptors Project Demo](https://github.com/chamikathereal/J2EE-Security/blob/main/J2EE-Security.png)](https://youtu.be/oISK2GQIXME)

---

## 🗂️ Project Structure

```
J2EE-Security/
├── src/
│   └── main/
│       ├── java/
│       │   └── lk.jlat.web/
│       │       ├── ejb/
│       │       │   ├── AdminSessionBean
│       │       │   └── UserSessionBean
│       │       ├── model/
│       │       └── servlet/
│       │           ├── Admin
│       │           ├── AutoLogin
│       │           ├── Logout
│       │           └── User
│       ├── resources/
│       └── webapp/
│           ├── admin/
│           │   └── index.jsp
│           ├── WEB-INF/
│           │   └── web.xml
│           ├── error.jsp
│           ├── index.jsp
│           └── login.jsp
├── pom.xml
```

## 📦 Module Details

#### 🟦 **ejb**
- **AdminSessionBean**  
  Stateless EJB for admin-specific business logic and operations.
  
- **UserSessionBean**  
  Stateless EJB with methods demonstrating role-based access using annotations like `@DenyAll`, `@PermitAll`, and `@RolesAllowed`.

##

#### 🟦 **servlet**
- **Admin**  
  Servlet for handling admin profile actions and access.
  
- **AutoLogin**  
  Servlet that demonstrates programmatic login for testing or automation.
  
- **Logout**  
  Servlet to securely invalidate sessions and handle user logout.
  
- **User**  
  Servlet for user-specific actions, invoking secured EJB methods.

##

#### 🟦 **webapp**
- **admin/index.jsp**  
  Admin dashboard, accessible only to users with the `admin` role.

  ##
  
- **WEB-INF/web.xml**  
  Security configuration, defining protected URL patterns, authentication methods, and role mappings.

  ##
  
- **login.jsp**  
  Custom login page for form-based authentication.
  
- **error.jsp**  
  Error page for failed login attempts.
  
- **index.jsp**  
  Public landing page.

---

## ⚙️ Key Features

- ✅ Role-based access control for admin and user areas
- ✅ EJB method-level security using `@DenyAll`, `@PermitAll`, and `@RolesAllowed`
- ✅ Secure login and logout with session management
- ✅ Declarative security configuration via `web.xml`
- ✅ Custom error and login pages for enhanced user experience

---

## 💡 How It Works

- **Authentication:**  
  Users log in via a form-based authentication mechanism. Credentials are validated and roles are assigned based on configuration.

- **Authorization:**  
  Access to servlets and EJB methods is controlled using both declarative (`web.xml`) and programmatic (EJB annotations) security.

- **Session Management:**  
  Secure session handling ensures users can log out safely, and unauthorized access is prevented.

- **Admin and User Separation:**  
  Admin and user functionalities are strictly separated, with dedicated servlets, EJBs, and protected JSPs.

---

## 🛠️ Technologies Used

- Java 11
- Jakarta EE 10 (EJB, Servlet, Security)
- Maven

---

## 📚 Learning Outcomes

- ✅ Understand Java EE security concepts and best practices
- ✅ Implement role-based access control in both web and EJB layers
- ✅ Configure authentication and authorization declaratively and programmatically
- ✅ Build secure, maintainable enterprise applications

---

## 🧑‍💻 Author

Chamika Gayashan  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: @chamikathereal  
Current date: Sunday, June 22, 2025, 1:30 AM +0530

[1] https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/71310210/c06fed9e-1a50-49f5-b825-3d3042eb353f/J2EE-Security.txt
