package com.babiy.homeworkservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MiddleMaxMin", value = "/MiddleMaxMin")
public class MiddleMaxMin extends HttpServlet {

    ActionNumber actionNumber = new ActionNumber();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int number1 = Integer.parseInt(req.getParameter("number1"));
        int number2 = Integer.parseInt(req.getParameter("number2"));
        int number3 = Integer.parseInt(req.getParameter("number3"));

        String valueGet = req.getParameter("action");

        if (valueGet.equals("max")) {
            double radioMax = actionNumber.max(number1, number2, number3);
            resp.getWriter().println("Max number: " + radioMax);
        } else if (valueGet.equals("min")) {
            double radioMin = actionNumber.min(number1, number2, number3);
            resp.getWriter().println("Min number: " + radioMin);
        } else if (valueGet.equals("middle")) {
            double radioMiddle = actionNumber.middle(number1, number2, number3);
            resp.getWriter().println("Middle number: " + radioMiddle);
        } else {
            resp.getWriter().println("Fatal");
        }

    }

}
