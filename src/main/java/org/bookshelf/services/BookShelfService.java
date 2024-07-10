package org.bookshelf.services;

import lombok.RequiredArgsConstructor;
import org.bookshelf.domain.Book;
import org.bookshelf.exception.BookException;
import org.bookshelf.interfaces.repository.BookShelfJpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookShelfService {

    private final BookShelfJpaRepository bookShelfJpaRepository;
//    private final boolean status = true;

//    ArrayList<Book> books = new ArrayList<Book>();

    public List<Book> getBooks(){
//        if(status){
//            throw new BookException("testing error ");
//        }
//        books.add(new Book("Fabeltje"));
//        return books;

        return bookShelfJpaRepository.findAll();
    }

    public void saveBook(final Book book) {
        bookShelfJpaRepository.save(book);
    }

}
