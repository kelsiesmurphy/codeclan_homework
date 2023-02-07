import java.util.ArrayList;

public class Borrower {

    public Borrower() {
        this.bookCollection = new ArrayList<>();
    }

    private ArrayList<Book> bookCollection;

    public ArrayList<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(ArrayList<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int collectionCount() {
        return this.bookCollection.size();
    }

    public void addBookFromLibrary(Library library, Book book) {
        library.removeBook(book);
        bookCollection.add(book);
    }
}
