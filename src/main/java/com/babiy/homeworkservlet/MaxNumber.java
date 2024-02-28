package com.babiy.homeworkservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Max", value = "/Max")
public class MaxNumber extends HttpServlet {

    NumberProcessor numberProcessor = new NumberProcessor();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int number1 = Integer.parseInt(req.getParameter("number1"));
        int number2 = Integer.parseInt(req.getParameter("number2"));
        int number3 = Integer.parseInt(req.getParameter("number3"));

        double max = numberProcessor.max(number1, number2, number3);

        resp.getWriter().println(number1);
        resp.getWriter().println(number2);
        resp.getWriter().println(number3);
        resp.getWriter().println("Max number: " + max);

    }

}
