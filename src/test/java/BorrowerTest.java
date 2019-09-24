import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;


    @Before
    public void before(){
        borrower = new Borrower("John");
        book = new Book("JRR Tolkein ","Fellowship of the Ring","Fantasy");
        library = new Library(30)
    }
    @Test
    public void canBorrowBook(){
    borrower.borrow(book);
    assertEquals(1,borrower.borrowCount());}
}

    @Test

    public void canBorrowFromLibrary(){
        //given we have a borrower
        //And we have a library
        //And we have a book
        //when a borrower removes a book from the library
        this.library.bookCollection.remove(book);
        //then the book count goes down and the borrower collection goes up
        this.borrower.borrowerCollection.add(book);

    }






