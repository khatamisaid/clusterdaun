package com.dreamtown.clusterdaun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.clusterdaun.entity.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {

}
