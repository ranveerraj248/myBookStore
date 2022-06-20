package com.store.book.repository;

import com.store.book.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
    List<Book> findBookByTitle(String title);
}
