package org.scoula.ex04.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cart_view_cookie")
public class CartViewCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //MIME 타입 설정
        response.setContentType("text/html; charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();

        // html 작성
        out.println("<html><body>");
        out.println("장바구니 리스트<br>");

		Cookie [] cookies = request.getCookies();

		if( cookies != null){
			for (Cookie c : cookies){
				out.print(c.getName() + " : " + c.getValue() + "<br>");
			}
		} else{
			out.print("장바구니가 비었음<br>");
		}
		out.println("<a href='cookie_product.jsp'>상품 선택 페이지</a><br>");
		out.println("<a href='cart_view_cookie'>장바구니 보기</a>");
        out.println("</body></html>");
    }
}