package basic.ch18.sec06;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception{

        // 기본 스트림
        FileOutputStream fos = new FileOutputStream("resource/printStream.txt");

        // Print 스트림
        PrintStream ps = new PrintStream(fos);

        ps.println("Print 출력하는것처럼");
        ps.println("데이터를 입출력한다.");
        ps.printf("| %6d | %10s | \n", 1, "홍길동");
        ps.printf("| %6d | %10s | \n", 2, "김자바");

        ps.flush();
        ps.close();

    }
}
