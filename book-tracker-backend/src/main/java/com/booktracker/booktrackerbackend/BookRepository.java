package com.booktracker.booktrackerbackend;

import com.booktracker.booktrackerbackend.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String> {
}
