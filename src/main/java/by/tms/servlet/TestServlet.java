package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result = req.getParameter("name");
        req.setAttribute("myResult", result);
        req.setAttribute("Flag", true);
        req.setAttribute("Flag1", false);

        List<String> list = new ArrayList<>();
        list.add("Hello 1");
        list.add("Hello 2");
        list.add("Hello 3");
        list.add("Hello 4");
        list.add("Hello 5");

        req.setAttribute("list", list);
        req.getRequestDispatcher("/pages/test.jsp").forward(req,resp);
    }
}
