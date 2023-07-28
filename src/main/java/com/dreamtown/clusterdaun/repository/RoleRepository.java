package com.dreamtown.clusterdaun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.clusterdaun.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}
