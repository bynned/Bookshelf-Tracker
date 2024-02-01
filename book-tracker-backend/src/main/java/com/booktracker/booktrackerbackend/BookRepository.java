package com.booktracker.booktrackerbackend;

import com.booktracker.booktrackerbackend.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
