package org.scoula.ex05;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("username", "홍길동");
        request.setAttribute("useraddress", "서울");

        RequestDispatcher dis = request.getRequestDispatcher("/res.jsp");
        dis.forward(request, response);

    }
}