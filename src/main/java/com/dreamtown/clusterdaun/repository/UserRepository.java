package com.dreamtown.clusterdaun.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.clusterdaun.entity.Role;
import com.dreamtown.clusterdaun.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findByRoleNot(Role role, Pageable pageable);
}
