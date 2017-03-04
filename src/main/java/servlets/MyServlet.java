package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Администратор on 17.02.2017.
 */

@WebServlet("/s")
public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse responce)
        throws ServletException, IOException{
        responce.setContentType("text/html");

        String varTextA = "Hello Word!";
        request.setAttribute("textA", varTextA);
        String varTextB = "It JSP.";
        request.setAttribute("textB", varTextB);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp"); //С помощью RequestDispatcher мы отправляем наш response request клиенту.
        dispatcher.forward(request, responce);
        PrintWriter out = responce.getWriter();

        out.println("Hello World");
    }
}
