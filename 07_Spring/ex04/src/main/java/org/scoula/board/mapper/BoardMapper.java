package org.scoula.board.mapper;

import org.scoula.board.domain.BoardVO;
import java.util.List;

public interface BoardMapper {

    // 게시글 목록 보기 (방금 넣은 테스트 데이터 5개를 가져올 메서드)
    public List<BoardVO> getList();

    // 게시글 상세 보기
    public BoardVO read(Long no);

    // 게시글 작성하기
    public int create(BoardVO board);

    // 게시글 수정하기
    public int update(BoardVO board);

    // 게시글 삭제하기
    public int delete(Long no);
}