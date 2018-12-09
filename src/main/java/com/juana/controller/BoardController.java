package com.juana.controller;

import com.juana.domain.BoardEntity;
import com.juana.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by juana on 2018. 12. 9..
 */

@Slf4j
@RestController
public class BoardController {
    @Autowired
    private BoardService boardService;

    public List<BoardEntity> getBoardList() {
        // paging 처리 필요
        return boardService.getBoardList();
    }

    public Optional<BoardEntity> getBoard(@PathVariable int id) {
        return boardService.getBoard(id);
    }
}
