package org.scoula.member.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor // 파라미터가 없는 기본 생성자 생성
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 생성
@Data // @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 일괄 적용
@Builder // 빌더 패턴을 이용한 객체 생성 지원
public class MemberVO {
    private Long no;
    private String username;
    private String password;
    private String email;
    private Integer birthYear;
    private Date regDate;
    private Date updatedDate;
}