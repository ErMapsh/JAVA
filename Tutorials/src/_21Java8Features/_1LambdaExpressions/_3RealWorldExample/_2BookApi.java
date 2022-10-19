package _21Java8Features._1LambdaExpressions._3RealWorldExample;

import java.util.ArrayList;
import java.util.List;

public class _2BookApi {
    public List<_1Book> getBooks() {
        List<_1Book> books = new ArrayList<>();
        books.add(new _1Book(101, "Core java", 499));
        books.add(new _1Book(102, "Python", 4929));
        books.add(new _1Book(103, "Adv java", 199));
        books.add(new _1Book(104, "R", 310));
        return books;
    }
}

/*
    Let's talk about generics,
    here Book is generic, what is Book?
    books having three field:
     1. id
     2. name of book
     3. number of pages
*/