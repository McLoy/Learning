package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Calc extends HttpServlet {

    private List<String> memorySession;

    private String calc(Integer a1, Integer a2, String operation) {
        String result = "";
        switch (operation) {
            case "add":
                result = "" + a1 + " + " + a2 + " = " + (a1 + a2);
                break;
            case "subtract":
                result = "" + a1 + " - " + a2 + " = " + (a1 - a2);
                break;
            case "multiply":
                result = "" + a1 + " * " + a2 + " = " + (a1 * a2);
                break;
            case "divide": {
                if (!a2.equals(0)) {
                    result = "" + a1 + " / " + a2 + " = " + (a1.doubleValue() / a2.doubleValue());
                } else {
                    result = "Division by zero";
                }
                break;
            }
            default:
                result = "Command '" + operation + "' not found.";
        }
        return result;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean filledParams = true;
        Integer param1 = null;
        Integer param2 = null;
        String operation = null;
        String res;
        if (request.getParameterNames().hasMoreElements()) {
            String input1 = request.getParameter("p1");
            String input2 = request.getParameter("p2");
            param1 = (input1 == null || (input1 != null && input1.isEmpty())) ? null : Integer.parseInt(input1);
            param2 = (input2 == null || (input2 != null && input2.isEmpty())) ? null : Integer.parseInt(input2);
            operation = request.getParameter("op");
        } else filledParams = false;

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.print("<html>");
            out.print("<head>");
            out.print("<link rel='stylesheet' href='/css/calc.css' />");
            out.print("<title>Simple calculator</title>");
            out.print("<body>");
            out.print("<h1>Calculator</h1>");
            if (!filledParams) {
                out.print("<h3>Try input parameters p1(first param), p2(second param), op(add, multiply, subtract or divide)</h3>");
            } else {
                if (param1 == null || param2 == null || operation == null || (operation != null && operation.isEmpty())) {
                    out.print("<h2>Wrong request parameters, try p1(first param), p2(second param), op(add, multiply, subtract or divide)</h2>");
                } else {
                    res = calc(param1, param2, operation);
                    if (request.getSession().isNew()) {
                        memorySession = new ArrayList<>();
                    } else {
                        memorySession = (ArrayList) request.getSession().getAttribute("memory");
                    }
                    if (memorySession instanceof ArrayList) {
                        memorySession.add(res);
                        request.getSession().setAttribute("memory", memorySession);
                    }
                }
            }
            for (String s : memorySession) {
                out.print("<h3>" + s + "</h3>");
            }
            out.print("</body>");
            out.print("</head>");
            out.print("</html>");
        } finally {
            out.close();
        }
    }
}
