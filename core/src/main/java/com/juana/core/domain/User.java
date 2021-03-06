package com.juana.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="User", schema = "Estimate")
@Where(clause="isDeleted = 0")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String passwd;

    private String nickName;

    private String phoneNumber;

    private String emailAddress;

    @Nullable
    private LocalDateTime lastLoginedAt;

    @Nullable
    private LocalDateTime passwdExpiredAt;

    private Integer status;

//    @JsonIgnore
    private Boolean isDeleted;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
