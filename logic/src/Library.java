import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("The Book was added successfully");
    }

    public List<Book> searchBookByTitle(String title){
        List<Book> matchingBook = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                matchingBook.add(book);
            }
        }

        return matchingBook;
    }
}
