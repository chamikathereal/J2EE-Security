package lk.jiat.web.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.web.ejb.UserSessionBean;

import java.io.IOException;

@WebServlet("/user")
public class User extends HttpServlet {

    @EJB
    private UserSessionBean userSessionBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userSessionBean.method4();
        response.getWriter().println("This Is User Servlet.");
    }
}
