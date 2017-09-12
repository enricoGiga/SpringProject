package com.enrico.webapp.webbAppWithSpring.repositories;

import com.enrico.webapp.webbAppWithSpring.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
