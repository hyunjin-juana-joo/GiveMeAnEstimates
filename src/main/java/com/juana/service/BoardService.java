package com.juana.service;

import com.juana.domain.Board;
import com.juana.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by juana on 2018. 12. 9..
 */
@Slf4j
@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getBoardList() {
        List<Board> boardList = boardRepository.findAll();
        return boardList;
    }

    public Optional<Board> getBoard(int id) {
        // 인자값을 int인지 Integer인지
        return boardRepository.findById(id);
    }
}
