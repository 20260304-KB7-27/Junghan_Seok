package org.scoula.ex04.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class DecoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 필터 초기화 시 필요한 로직이 있다면 작성합니다.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // HttpServletRequest로 캐스팅하여 URL 추출
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        // [요청 처리 전] <요청 url> =======> 출력
        System.out.println(requestURI + " =======>"); // [cite: 15]

        // 다음 필터 또는 서블릿으로 요청 전달
        chain.doFilter(request, response);

        // [요청 처리 후] <======= 출력
        System.out.println("<======="); //
    }

    @Override
    public void destroy() {
        // 필터 소멸 시 필요한 로직이 있다면 작성합니다.
    }
}