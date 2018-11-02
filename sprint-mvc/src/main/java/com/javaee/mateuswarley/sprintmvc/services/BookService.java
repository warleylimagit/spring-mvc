package com.javaee.mateuswarley.sprintmvc.services;

import java.util.Set;

import com.javaee.mateuswarley.sprintmvc.domain.Book;

public interface BookService {

	Set<Book> getBooks();

    Book findById(Long id);

    Book saveBook(Book book);

    void deleteById(Long idToDelete);
}
