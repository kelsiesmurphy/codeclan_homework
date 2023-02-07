import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private List<Book> books;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(List<Book> books, int capacity) {
        this.books = books;
        this.capacity = capacity;
        this.booksByGenre = new HashMap<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getCount() {
        return this.books.size();
    }

    public int getBooksByGenreCount(String genre){
        return this.booksByGenre.get(genre);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if(books.size() < this.capacity) {
            this.books.add(book);
            this.booksByGenre.merge(book.getGenre(), 1, Integer::sum);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
        this.booksByGenre.merge(book.getGenre(), -1, Integer::sum);
    }
}
