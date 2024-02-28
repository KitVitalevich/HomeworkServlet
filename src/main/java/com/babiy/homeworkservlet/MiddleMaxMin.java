package com.babiy.homeworkservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MiddleMaxMin", value = "/MiddleMaxMin")
public class MiddleMaxMin extends HttpServlet {

    NumberProcessor numberProcessor = new NumberProcessor();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int number1 = Integer.parseInt(req.getParameter("number1"));
        int number2 = Integer.parseInt(req.getParameter("number2"));
        int number3 = Integer.parseInt(req.getParameter("number3"));

        String param = req.getParameter("action");

        if (param.equals("max")) {
            double radioMax = numberProcessor.max(number1, number2, number3);
            resp.getWriter().println("Max number: " + radioMax);
        } else if (param.equals("min")) {
            double radioMin = numberProcessor.min(number1, number2, number3);
            resp.getWriter().println("Min number: " + radioMin);
        } else if (param.equals("middle")) {
            double radioMiddle = numberProcessor.middle(number1, number2, number3);
            resp.getWriter().println("Average number: " + radioMiddle);
        } else {
            resp.getWriter().println("Fatal");
        }

    }

}
