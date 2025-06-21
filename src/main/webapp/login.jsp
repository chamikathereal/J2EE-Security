<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/19/2025
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login</h1>
<form method="POST" action="j_security_check">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="j_username" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="j_password" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login" /></td>
        </tr>
    </table>
</form>
</body>
</html>
