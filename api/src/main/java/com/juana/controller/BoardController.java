package com.juana.controller;

import com.juana.core.domain.Board;
import com.juana.core.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by juana on 2018. 12. 9..
 */

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    /**
     * 게시판 리스트 조회
     * @return
     */
    @GetMapping
    public List<Board> getBoardList() {
        // paging 처리 필요
        return boardService.getBoardList();
    }

    /**
     * 게시판 상세 조회
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Board getBoard(@PathVariable final Integer id) {
        return boardService.getBoard(id);
    }

    /**
     * 게시판 생성
     * @param board
     * @return
     */
    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardService.save(board);
    }

    /**
     * 게시판 수정
     * @param id
     * @param board
     * @return
     */
    @PutMapping
    public Board modifyBoard(@PathVariable final Integer id, @RequestBody Board board) {
        return boardService.modify(id, board);
    }

    /**
     * 게시판 삭제
     * @param id
     * @return
     */
    @DeleteMapping
    public Boolean deleteBoard(@PathVariable final Integer id) {
        return boardService.delete(id);
    }


}
