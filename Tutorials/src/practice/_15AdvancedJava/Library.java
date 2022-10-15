package practice._15AdvancedJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;


class OxfordLib {

    protected LinkedList<String> Users = new LinkedList<>();
    protected LinkedList<String> books = new LinkedList<>();

    protected HashMap<String, String> IssuedBook = new HashMap<>();

    String UserName = null;
    String Guest = "Guest";

    // --------------Library----------------
    OxfordLib(String message) {
        System.out.println("I m calling");
        books.add("the book");
        books.add("the book1");
        books.add("the book2");
        books.add("the book3");
        books.add("the book4");
    }

    //---------Date------
    public String currentDateTime() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy k:m:s a");
        return date.format(df);
    }

    public void showBooks() {
        if (books.size() > 0) {
            System.out.println(books.clone());
        } else {
            System.out.println("Books are Not Available");
        }
    }

    public void ReturnBookToLib(String BookName) {
        if (IssuedBook.containsKey(this.UserName) && Users.contains(this.UserName)) {
            IssuedBook.remove(this.UserName);
            books.add(BookName);
            System.out.println("Book Returned");
        } else {
            System.out.println("something went wrong");
        }
    }

    public void issueBook(String BookName) {
        if (books.contains(BookName) && Users.contains(UserName)) {
            String full = BookName + " ,Issued on " + currentDateTime();
            IssuedBook.put(UserName, full);
            System.out.printf("Book --> %s issued to %s\n", BookName, UserName);
        } else {
            System.out.println("Something went wrong, user is not register or book was not available in lib");
        }
    }

    public void GetIssueBookInfo() {
        System.out.println(IssuedBook);
    }

}

class User extends OxfordLib {

    User(String Guest) {
        super("I m calling");
        this.Guest = Guest;
        if (isUser(this.Guest)) {
            this.UserName = this.Guest;
            System.out.println("You are eligible to Perform the task");
        } else {
            System.out.println("You are not eligible to perform the task, Create account");
            createUser(this.Guest);
        }
    }

    // ----------------For User auth ----------------

    public Boolean isUser(String name) { // if any by chances, guest is user

        for (String user : Users) {
            if (Objects.equals(user, name)) {
                this.UserName = name;
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void createUser(String name) {
        try {
            if (!isUser(name)) {
                Users.add(name);
                this.UserName = name;
                System.out.println("User Registered, check out library....");
            }
        } catch (Exception e) {
            System.out.println("Something wrong, Try again");
        }
    }

}


public class Library {
    public static void main(String[] args) {
        /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */

        User ermapsh = new User("ErMapsh");
        ermapsh.showBooks();

        ermapsh.issueBook("the book");
        ermapsh.GetIssueBookInfo();
        ermapsh.ReturnBookToLib("the book");
        ermapsh.GetIssueBookInfo();
    }
}
