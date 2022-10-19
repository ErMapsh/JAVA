package _21Java8Features._1LambdaExpressions._3RealWorldExample;

import java.util.List;

public class _3BookService {
    public static void main(String[] args) {
        System.out.println(new _3BookService().GetBooksInSortedOrder());
    }

    List<_1Book> GetBooksInSortedOrder() {

        //_2BookApi when called, its also called _1Book because we add an objects in list
        List<_1Book> books = new _2BookApi().getBooks();

        
        //------- 1.for sorting using external class implementing interface------
        //books.sort(new myComparator());


        // ------ 2.using lambda method----
        /*
        books.sort(new Comparator<_1Book>() {
            @Override
            public int compare(_1Book o1, _1Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
         */

        //-----3.Using anonymous method---
        books.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }
}


//if i don't want to use this
/*

class myComparator implements Comparator<_1Book> {
    @Override
    public int compare(_1Book o1, _1Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class myComparatorDec implements Comparator<_1Book> {
    @Override
    public int compare(_1Book o1, _1Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
*/