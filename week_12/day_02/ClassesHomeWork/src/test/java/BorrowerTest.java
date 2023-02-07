import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    private Library library;

    Book book1;
    Book book2;

    @Before
    public void before(){
        borrower = new Borrower();

        book1 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        book2 = new Book("Harry Potter", "JK Rowling", "Magic");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        library = new Library(books, 3);
    }

    @Test
    public void removesBookFromLibraryAndAddsToCollection() {
        borrower.addBookFromLibrary(library, book1);
        assertEquals(1, borrower.collectionCount());
    }
}
