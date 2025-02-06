import java.util.ArrayList;

//program that add and remove book
class Book {
    
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

}

class BookService {
    private ArrayList<Book> arraylist = new ArrayList<Book>();

    // add method
    public void add(String title, String author, String ISBN) {
        Book book = new Book(title, author, ISBN);
        arraylist.add(book);  
        System.out.println("Book added successfully: " + title);
    }

    // remove method
    public void remove(String ISBN) {
        for (Book book : arraylist) {
            if (book.getISBN().equals(ISBN)) {
                arraylist.remove(book);
                System.out.println("Book removed with ISBN: " + ISBN);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " removed.");
    }
}
