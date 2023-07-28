package com.dreamtown.clusterdaun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.clusterdaun.entity.ContactPerson;

public interface ContactPersonRepository extends JpaRepository<ContactPerson, Integer>{
    
}
