package com.enrico.webapp.webbAppWithSpring.repositories;

import com.enrico.webapp.webbAppWithSpring.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
