import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Library library;
    Book book;


    @Before

    public void setUp() {
        library = new Library(30);
        book = new Book("Brendon Burchard", "High Performance Habits", "Self Improvement");
    }

    @Test
    public void getBookCount() {
        assertEquals(0, library.bookCollectionCount());
    }

    @Test
    public void addBook() {
        library.addBook(book);
        assertEquals(1, library.bookCollectionCount());
    }

    @Test
    public void removeBook() {
       library.addBook(book);
       library.removeBook();

       assertEquals(0, library.bookCollectionCount());
    }
}






