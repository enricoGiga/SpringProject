package com.enrico.webapp.webbAppWithSpring.bootstrap;

import com.enrico.webapp.webbAppWithSpring.model.Author;
import com.enrico.webapp.webbAppWithSpring.model.Book;
import com.enrico.webapp.webbAppWithSpring.model.Publisher;
import com.enrico.webapp.webbAppWithSpring.repositories.AuthorRepository;
import com.enrico.webapp.webbAppWithSpring.repositories.BookRepository;
import com.enrico.webapp.webbAppWithSpring.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }
    //Mondadori





    private void initData(){

        Publisher mondadori = new Publisher("Mondadori","via muro padri 89");
        Publisher cornell = new Publisher("Cornell","via carlo cracco 1");
        publisherRepository.save(mondadori);
        publisherRepository.save(cornell);

        //Eric
        Author eric = new Author("eric", "evans");
        Book ddd = new Book("Domain driver design", "1234", mondadori);
        eric.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", cornell );
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);




    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
