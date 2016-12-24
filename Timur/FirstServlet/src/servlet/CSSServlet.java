package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CSSServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.print("<head>"
        + "<link rel='stylesheet' href='/css/style.css' />"
                    + "</head>"
                    + "<body>"
                    + "<h2>Hello, this is my cat!</h2>"
                    + "<img src='/images/cat.jpeg'/>"
                    + "</body>");
        } finally {
            out.close();
        }

    }
}
