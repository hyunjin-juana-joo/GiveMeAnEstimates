package com.juana.controller;


import com.juana.core.domain.Comment;
import com.juana.core.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 게시판 번호로 댓글 조회
     * @return
     */
    @GetMapping(value = "/{boardId}")
    public List<Comment> getCommentList() {
        // TODO: paging, commentFindParam
        return null;
    }

    /**
     * 댓글 생성
     * @param comment
     * @return
     */
    @PostMapping
    private Comment createComment(Comment comment) {
        return commentService.save(comment);
    }

    /**
     * 댓글 수정
     * @param id
     * @param comment
     * @return
     */
    @PutMapping
    public Comment updateComment(final Integer id, Comment comment) {
        return commentService.modify(id, comment);
    }

    /**
     * 댓글 삭제
     * @param id
     * @return
     */
    @DeleteMapping
    public Integer deleteComment(final Integer id) {
        return commentService.delete(id);
    }
}
