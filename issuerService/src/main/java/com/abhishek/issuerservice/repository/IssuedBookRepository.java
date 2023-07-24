package com.abhishek.issuerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.issuerservice.entity.IssuedBook;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Integer>{

}
