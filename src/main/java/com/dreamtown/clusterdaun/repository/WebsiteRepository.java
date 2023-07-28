package com.dreamtown.clusterdaun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.clusterdaun.entity.Website;

public interface WebsiteRepository extends JpaRepository<Website, Integer>{
    
}
