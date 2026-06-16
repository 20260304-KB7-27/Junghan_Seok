package org.scoula.ex04.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart_save_cookie")
public class CartSaveCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //MIME 타입 설정
        response.setContentType("text/html; charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();

        String product = request.getParameter("product");

        // 기존 쿠키 얻기
        Cookie [] cookies = request.getCookies();
        Cookie c = null;
        if(cookies == null || cookies.length == 0){
            c = new Cookie("product", product);
        } else{
            c = new Cookie("product" + (cookies.length+1) , product);

        }

        // 쿠키 응답 처리
        // c.setMaxAge(60*60)
        response.addCookie(c);

        // html 작성
        out.println("<html><body>");
        out.println("Product 추가!!<br>");
        out.println("<a href='cookie_product.jsp'>상품 선택 페이지</a><br>");
        out.println("<a href='cart_view_cookie'>장바구니 보기</a>");
        out.println("</body></html>");
    }
}