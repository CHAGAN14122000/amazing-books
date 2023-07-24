package com.abhishek.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.bookservice.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
