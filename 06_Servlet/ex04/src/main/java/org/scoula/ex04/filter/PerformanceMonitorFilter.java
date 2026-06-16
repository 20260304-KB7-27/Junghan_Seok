package org.scoula.ex04.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PerformanceMonitorFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// HttpServletRequest로 캐스팅하여 URL 추출
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String requestURI = httpRequest.getRequestURI();

		// 1. 요청 접수 시간 및 시작 시간(ms) 기록
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String requestTimeStr = now.format(formatter);

		long startTime = System.currentTimeMillis(); // 수행 시간 계산용

		// 다음 필터 또는 서블릿으로 요청 전달
		chain.doFilter(request, response);

		// 2. 요청 처리 완료 후 수행 시간 계산
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;

		// 3. 로그 문자열 터미널 출력 (System.out 이용)
		// 형식: [<요청 접수 시간>] <요청 url> - <처리 수행 시간> 소요.
		System.out.println("[" + requestTimeStr + "] " + requestURI + " - " + executionTime + "ms 소요."); //
	}

	@Override
	public void destroy() {
	}
}