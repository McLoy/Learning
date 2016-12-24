package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.print("<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<meta charset='utf-8'>"
                    + "<title>Java Programming for Kids, Parents and Grandparents by Yakov Fain</title>"
                    + "<meta name='description' content=''>"
                    + "<meta name='viewport' content='width=device-width, initial-scale=1'>"
                    + "<link rel='stylesheet' href='assets/css/final-2.css'>"
                    + "</head>"
                    + "<body>"
                    + "<div class='container cleafix'>"
                    + "<header>"
                    + "<h1>Java Programming for Kids, Parents and Grandparents</h1>"
                    + "<span>by</span> <span class='author'>Yakov Fain</span>"
                    + "</header>"
                    + "<div class='covers cleafix'>"
                    + "<div class='main'>"
                    + "<div>"
                    + "<a href='http://myflex.org/books/java4kids/JavaKid811.pdf'>"
                    + "<img src='http://myflex.org/books/java4kids/images/cover1.JPG'>"
                    + "</a>"
                    + "</body>"
                    + "</html>");

        } finally {
            out.close();
        }
    }
}
