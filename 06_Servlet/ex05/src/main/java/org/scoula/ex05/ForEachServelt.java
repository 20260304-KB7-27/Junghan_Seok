package org.scoula.ex05;

import org.scoula.ex05.domain.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("jstl2")
public class ForEachServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Member> members = new ArrayList<>();
        members.add(new Member("홍길동", "hong"));
        members.add(new Member("홍길동", "hong"));
        members.add(new Member("홍길동", "hong"));

        request.setAttribute("memberList", );
    }
}