package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TestServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String param1 = request.getParameter("p1");

        Enumeration en = request.getParameterNames();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Simple my example</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Hello Vlad, you did it!</h1>");
            out.print("<h2>My cat</h2>");
            out.print("<img src='images/cat.jpeg'>");
            out.print("<br>");
            out.print("<h2>My dog</h2>");
            out.print("<img src='" + request.getContextPath() + "/images/dog.jpg'>");
            while (en.hasMoreElements()){
                String param = en.nextElement().toString();
                out.print("<h2>Param " + param + " = " + request.getParameter(param) + "</h2>");
            }
//            out.print("<h3>Parametr = " + param1 + "</h3>");
            out.print("<body>");
            out.print("</html>");

        } finally {
            out.close();
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println(config.getInitParameter("init1"));
    }
}
