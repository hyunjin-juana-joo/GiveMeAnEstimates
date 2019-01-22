package com.juana.core.repository;

import com.juana.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by juana on 2018. 12. 9..
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
