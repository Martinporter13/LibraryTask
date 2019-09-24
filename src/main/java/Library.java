import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;


    public Library(int capacity) {
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;


    }

    public int bookCollectionCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (bookCollectionCount() < capacity) {
            this.bookCollection.add(book);
        }
    }

    public Book removeBook () {
        return this.bookCollection.remove(0);
    }
}
