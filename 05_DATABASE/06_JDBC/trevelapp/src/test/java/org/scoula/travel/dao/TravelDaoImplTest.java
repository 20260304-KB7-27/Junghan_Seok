package org.scoula.travel.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.scoula.travel.domain.TravelVO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelDaoImplTest {

    private TravelDao dao;

    @BeforeEach
    void setUp() {
        dao = new TravelDaoImpl();
    }

    @Test
    void getTravels() {

        List<TravelVO> travels = dao.getTravels();

        System.out.println(travels);

        assertNotNull(travels);
        assertFalse(travels.isEmpty(), "여행지 목록이 비면 안됨.");

    }


    // 여행지 지역별 조회 기능
    // Pass하게끔 만들어보세요
    @Test
    void getTravelsByDistrict() {
        // 1. 우선 사용 가능한 지역 목록을 가져옵니다.
        List<String> districts = dao.getDistricts();

        // 2. 지역 목록이 비어있지 않은지 먼저 확인합니다. (데이터가 없을 경우 에러 대신 테스트 실패 메시지 출력)
        assertNotNull(districts, "지역 목록 리스트가 null입니다.");
        assertFalse(districts.isEmpty(), "조회된 지역이 없습니다. DB에 데이터를 먼저 넣어주세요.");

        // 3. 첫 번째 지역을 선택합니다.
        String district = districts.get(0);

        // 4. 선택한 지역으로 조회를 수행합니다.
        List<TravelVO> travels = dao.getTravels(district);

        // 5. 조회된 리스트가 null이 아니고, 모든 데이터의 지역명이 일치하는지 검증합니다.
        assertNotNull(travels, district + " 지역의 조회 결과가 null입니다.");
        assertFalse(travels.isEmpty(), district + " 지역에 해당하는 데이터가 없습니다.");

        travels.forEach(t -> {
            assertEquals(district, t.getDistrict(), "조회된 데이터의 지역명이 일치하지 않습니다.");
        });

        // 콘솔 출력 (선택 사항)
        System.out.println("조회된 지역: " + district + " (" + travels.size() + "건)");
    }
}