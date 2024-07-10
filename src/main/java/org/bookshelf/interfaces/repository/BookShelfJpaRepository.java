package org.bookshelf.interfaces.repository;

import org.bookshelf.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShelfJpaRepository extends JpaRepository<Book, Long> {

}
