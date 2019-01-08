package com.juana.repository;

import com.juana.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by juana on 2018. 12. 9..
 */
@Repository
public interface UserRepository extends JpaRepository<Board, Integer> {

}
