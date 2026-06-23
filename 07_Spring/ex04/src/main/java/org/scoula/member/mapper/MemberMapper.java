package org.scoula.member.mapper;

import org.scoula.member.domain.MemberVO;
import java.util.List;

public interface MemberMapper {

    // 회원 등록 (Create)
    public int create(MemberVO member);

    // 회원 단건 조회 (Read)
    public MemberVO read(Long no);

    // 회원 전체 목록 조회 (Read 목록)
    public List<MemberVO> getList();

    // 회원 정보 수정 (Update)
    public int update(MemberVO member);

    // 회원 삭제 (Delete)
    public int delete(Long no);
}