package org.scoula.persistence;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.fail;

@Log4j2
public class JDBCTests {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        // 교재 2, 3페이지에 명시된 scoula_db와 scoula 계정으로 커넥션 테스트 진행
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/scoula_db?useSSL=false&serverTimezone=Asia/Seoul",
                "scoula",
                "1234")) {

            log.info("==========> 순수 JDBC 연결 성공: " + con);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}