/**
 * @author melike
 * @version 1.0
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    /**
     *  @param title  The title of the book.
     *  @param author The author of the book.
     *  @param ISBN   The International Standard Book Number of the book.
     */

    public Book(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.isAvailable=true;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable=available;
    }

}

