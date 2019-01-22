package com.juana.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by juana on 2018. 12. 9..
 */

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="Board", schema = "Estimate")
@Where(clause="isDeleted = 0")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String boardType;

    private Integer userId;

    @Column(nullable = true)
    private String userName;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToMany
    @JoinColumn(name = "boardId")
    private List<Comment> comments;

    @JsonIgnore
    private Boolean isDeleted;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
