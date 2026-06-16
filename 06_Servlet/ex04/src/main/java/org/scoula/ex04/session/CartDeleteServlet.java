package org.scoula.ex04.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart-delete")
public class CartDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //MIME 타입 설정
        response.setContentType("text/html; charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();

        // html 작성
        out.println("<html><body>");
        out.println("장바구니 비웠음!!");

        // 세션객체 얻기
        HttpSession session = request.getSession(false);
        if( session != null){
            session.invalidate();
        } else{
            out.print("세션 없음" + "<br>");

        }
        out.println("<a href='session_product.jsp'>상품 선택 페이지</a><br>");
        out.println("</body></html>");
    }
}