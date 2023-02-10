import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;

    @Before
    public void before(){
        Book book1 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        Book book2 = new Book("Harry Potter", "JK Rowling", "Magic");

        ArrayList<Book> books = new ArrayList<>();
        library = new Library(new ArrayList<>(), 3);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void getBookCount() {
        assertEquals(2, library.getCount());
    }

    @Test
    public void addBookToLibrary() {
        Book book = new Book("The Great Gatsby", "F Scott Fitsgerald", "Tragedy");
        library.addBook(book);
        assertEquals(3, library.getCount());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void attemptToAddBookButCapacityIsFullSoExpects3Not4() {
        Book book1 = new Book("The Great Gatsby", "F Scott Fitsgerald", "Tragedy");
        Book book2 = new Book("The Great Gatsby", "F Scott Fitsgerald", "Tragedy");
        Book book3 = new Book("The Great Gatsby", "F Scott Fitsgerald", "Tragedy");
        Book book4 = new Book("The Great Gatsby", "F Scott Fitsgerald", "Tragedy");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.getCount());
    }

    @Test
    public void addsBookToBooksByGenreWhenAddingNewBook() {
        Book book1 = new Book("The Great Gatsby", "F Scott Fitsgerald", "Fantasy");
        library.addBook(book1);
        assertEquals(2, library.getBooksByGenreCount("Fantasy"));
    }
}
