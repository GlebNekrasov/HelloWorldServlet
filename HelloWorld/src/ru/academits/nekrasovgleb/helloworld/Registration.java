package ru.academits.nekrasovgleb.helloworld;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        try (PrintWriter writer = resp.getWriter()) {
            req.setCharacterEncoding("UTF-8");
            String name = req.getParameter("name");
            String age = req.getParameter("age");
            String gender = req.getParameter("gender");
            writer.println("<p>Имя: " + name + "</p>");
            writer.println("<p>Возраст: " + age + "</p>");
            writer.println("<p>Пол: " + gender + "</p>");
        }
    }
}