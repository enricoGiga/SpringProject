package com.enrico.webapp.webbAppWithSpring.repositories;

import com.enrico.webapp.webbAppWithSpring.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
