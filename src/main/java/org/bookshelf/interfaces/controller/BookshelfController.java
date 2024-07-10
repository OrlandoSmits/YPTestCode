package org.bookshelf.interfaces.controller;

import lombok.RequiredArgsConstructor;
import org.bookshelf.domain.Book;
import org.bookshelf.services.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequiredArgsConstructor
public class BookshelfController {

    private final BookShelfService bookShelfService;

    @GetMapping("/books")
    public List<Book> returnBooks(){
        return bookShelfService.getBooks();
    }

//    @GetMapping("/saveBook")
//    public void saveBook() {
//        Book book = new Book();
//        book.setName("Book: " + Math.random());
//
//        bookShelfService.saveBook(book);
//    }

    @PostMapping("/book")
    public void saveBook(@RequestBody String name) {
        Book book = new Book();
        book.setName(name);
        bookShelfService.saveBook(book);
    }
}
