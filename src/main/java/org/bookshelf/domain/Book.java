package org.bookshelf.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.ToString;

@Table(name = "BoekenKast")
@Entity
@Setter
@ToString
public class Book {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;
    
    
}
