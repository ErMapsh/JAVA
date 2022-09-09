package practice;

import java.util.*;
// You have to implement a Library using Java Class Library
// Methods: addBook, issueBook, returnBook, showAvai lableBooks
// Properties: Array to store the available books,
// Array to store the issued books

// there are special permission for library --> Addbook, issueBook, Available books

class Library {
    private String[] books = { "The Great Gatsby", "Invisible Man", "Don Quixote", "Beloved", "A smile in the mind",
            "The Power of Now", "Valorant" };
    private int numOfBooks = books.length;

    Dictionary dict = new Hashtable();

    Scanner sc = new Scanner(System.in);

    Library() {
        System.out.println(
                "---Operation in Library----\n1.Show Available Books\n2.Add Book\n3.Issue Book\n4.Return book");
    }

    private int AddBookByLibrary(String BookName) {
        numOfBooks++;
        books[numOfBooks] = BookName;
        return 1;
    }

    public int issueBook(String ownBy, String BookName) {
        if(!(dict.get(ownBy) == BookName)){
            dict.put(ownBy, BookName);
            return 1;
        }
        return 0;
    }

    public int ReturnBook(String Name, String bookName) {
        if (dict.get(Name) == bookName) {
            dict.remove(Name);
            return 1;
        }
        return 0;
    }

    public void showAvailableBooks() {
        System.out.println("\n----Available Books are---");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + "." + books[i]);
        }
    }

    public void WhoHaveBooks() {
        System.out.println(dict);
    }

}

class LibUser extends Library {
    private int id;
    private String name;

    LibUser() {
    }

    LibUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void Display() {
        System.out.printf("The User id is %d and Name is %s", id, name);
    }
}

public class _10Library {
    public static void main(String[] args) {
        // System.out.println("---Library---");

        // Library lib = new Library();
        // lib.showAvailableBooks();

        LibUser mahesh = new LibUser(73, "ErMapsh");
        mahesh.showAvailableBooks();
        System.out.println(mahesh.ReturnBook("Mahesh", "Valorant"));

    }
}
