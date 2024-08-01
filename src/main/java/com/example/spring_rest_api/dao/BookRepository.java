package com.example.spring_rest_api.dao;

import com.example.spring_rest_api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
