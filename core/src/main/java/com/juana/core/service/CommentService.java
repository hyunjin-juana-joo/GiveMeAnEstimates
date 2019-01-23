package com.juana.core.service;

import com.juana.core.domain.Comment;
import com.juana.core.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    /**
     * find comment list
     * @return
     */
    public List<Comment> getCommentList() {
        //TODO: paging, param
        return commentRepository.findAll();
    }

    /**
     * find one comment
     * @param id
     * @return
     */
    public Comment getComment(final Integer id) {
        Optional<Comment> comment = commentRepository.findById(id);
        if(!comment.isPresent()) {
            // TODO: exception handler...
            throw new RuntimeException("404 NOT FOUND ERROR");
        }
        return comment.get();
    }

    /**
     * create comment
     * @param comment
     * @return
     */
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    /**
     * update comment by id
     * @param id
     * @param newComment
     * @return
     */
    public Comment modify(final Integer id, Comment newComment) {
        // TODO: param 받아서 객체 맵핑시키기.
        Comment oldComment = this.getComment(id);
        return commentRepository.save(newComment);
    }

    /**
     * delete comment by id
     * @param id
     * @return
     */
    public Integer delete(final Integer id) {
        Comment comment = this.getComment(id);
        comment.setIsDeleted(true);
        // TODO: 되는지 확인필요 ㅋ
        return 1;
    }

}
