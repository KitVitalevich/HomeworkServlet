package com.babiy.homeworkservlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "citation", value = "/citation")
public class Citation extends HttpServlet {
    private String citation;

    public void init() {
        citation = "Bad programmers worry about the code. Good programmers worry about data structures and their relationships";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + citation + "</h1>");
        out.println("</body></html>");
    }
}
