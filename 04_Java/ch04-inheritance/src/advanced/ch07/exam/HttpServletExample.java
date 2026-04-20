package advanced.ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        //          o                       x
        // HttpServlet servlet; // = new HttpServlet();

        method(new LoginServlet());
        method(new FileDownloadServlet());

    }

    public static void method( HttpServlet servlet ) { // 매개변수의 다형성
        servlet.service(); // 동적바인딩
    }
}