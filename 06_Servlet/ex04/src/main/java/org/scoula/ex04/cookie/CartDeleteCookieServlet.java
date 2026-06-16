package org.scoula.ex04.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart_delete_cookie")
public class CartDeleteCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //MIME 타입 설정
        response.setContentType("text/html; charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // 기존 쿠키 얻기
        Cookie [] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c : cookies){
                c.setMaxAge(1);
                response.addCookie(c);
            }
        }
        // html 작성

        out.print("장바구니가 비었음<br>");
        out.println("<a href='cookie_product.jsp'>상품 선택 페이지</a><br>");
        out.println("</body></html>");
    }
}