import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     * @throws IllegalArgumentException If the book is null.
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null...");
        }
        books.add(book);
    }

    /**
     * Searches for books by title or author.
     * @param key The key string to search for.
     * @return A list of books matching the key.
     */
    public List<Book> searchBooks(String key) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(key) || book.getAuthor().contains(key)) {
                result.add(book);
            }

        }
               return result;

    }
    /**
     * Checks out a book to a borrower.
     * @param ISBN The ISBN of the book to be checked out.
     * @return true if the book was successfully checked out, false if the book is not available.
     */
    public boolean checkoutBook(String ISBN){
        for (Book book : books){
            if (book.getISBN().equals(ISBN) && book.isAvailable()){
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }
    /**
     * Returns a book to the library.
     * @param ISBN The ISBN of the book to be returned.
     * @return true if the book was successfully returned,false if the book does not belong to the library.
     */
    public boolean returnBook(String ISBN){
        for (Book book : books){
            if (book.getISBN().equals(ISBN)){
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }

}



