package by.tms.servlet.lesson26;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/calc.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String type = req.getParameter("type");

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double result = n1+n2;
        req.setAttribute("result", result);
        req.getRequestDispatcher("/pages/calc.jsp").forward(req,resp);
    }
}
