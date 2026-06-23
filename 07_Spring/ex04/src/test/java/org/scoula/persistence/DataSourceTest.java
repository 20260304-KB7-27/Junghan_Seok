package org.scoula.persistence;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(SpringExtension.class) // JUnit 5용 스프링 연동 어노테이션
@ContextConfiguration(classes = {RootConfig.class}) // RootConfig 설정을 기반으로 컨텍스트 구동
@Log4j2
public class DataSourceTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() {
        // DataSource 빈이 성공적으로 주입되었는지 검증
        assertNotNull(dataSource, "DataSource 빈 주입 실패!");

        try (Connection con = dataSource.getConnection()) {

            log.info("==========> HikariCP 데이터소스 연결 성공: " + con);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}