package com.juana.core.service;

import com.juana.core.domain.Board;
import com.juana.core.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * get board list
     * @return
     */
    public List<Board> getBoardList() {
        List<Board> boardList = boardRepository.findAll();
        return boardList;
    }

    /**
     * get board one
     * @param id
     * @return
     */
    public Board getBoard(final Integer id) {
        // 인자값을 int인지 Integer인지
        Optional<Board> board = boardRepository.findById(id);

        if(!board.isPresent()) {
            throw new RuntimeException("404 Error");
        }

        return board.get();
    }

    /**
     * create board
     * @param board
     * @return
     */
    public Board save(Board board) {
        // TODO: board param이나 DTO로 변경해야함
        return boardRepository.save(board);
    }

    /**
     * update board by id
     * @param id
     * @param param
     * @return
     */
    public Board modify(final Integer id, Board param) {
        // TODO: board param이나 DTO로 변경해야함
        Board board = this.getBoard(id);

        if(param.getTitle() != null) {
            board.setTitle(param.getTitle());
        }
        if(param.getContent() != null) {
            board.setContent(param.getContent());
        }

        return board;
    }

    /**
     * delete board by id
     * @param id
     * @return
     */
    public Boolean delete(final Integer id) {
        Board board = this.getBoard(id);
        board.setIsDeleted(true);
        return true;
    }
}
