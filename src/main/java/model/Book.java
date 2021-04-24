package model;

import lombok.*;

import java.util.*;

@EqualsAndHashCode
//@Builder
@ToString
@Getter
@Setter
//@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private boolean state = false;
    private int serialNumber;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;


    }


}

//    public boolean getState() {
//        return state;
//    }
//
//    public void borrow(Book book) {
//        book.state = true;
//    }
//}
