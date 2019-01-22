package com.juana.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by juana on 2018. 12. 9..
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private BoardService boardService;
//
//    @GetMapping
//    public List<Board> getBoardList() {
//        // paging 처리 필요
//        return boardService.getBoardList();
//    }
//
//    public Optional<Board> getBoard(@PathVariable final int id) {
//        return boardService.getBoard(id);
//    }
}
