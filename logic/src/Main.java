import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       Scanner scanner = new Scanner(System.in);
       boolean run= false;


       while(!run){
           try {
               int choice = displayMenu(scanner);
               scanner.nextLine();

               switch (choice){
                  case 1:
                      addBook(library, scanner);
                  break;
                   case 0:
                       run = false;
                   break;
                }


           } catch (InputMismatchException e) {
               System.out.println("Invalid Choice!");
               scanner.nextLine();
           }



       }
       
        
        
       
    }

    public static void addBook(Library library, Scanner scanner){

        String title = "";
        String author = "";
        String genre = "";
        int publicationYear = 0;


        while (title.trim().isEmpty()){
            System.out.println("Enter title: ");
            title = scanner.nextLine().trim();

            if(title.isEmpty()){
                System.out.println("Title cannot be empty. Please try again.");
            }
        }

        while (author.trim().isEmpty()){
            System.out.println("Enter author: ");
            author = scanner.nextLine().trim();

            if(author.isEmpty()){
                System.out.println("Author cannot be empty. Please try again.");
            }
        }

        while (genre.trim().isEmpty()){
            System.out.println("Enter genre: ");
            genre = scanner.nextLine().trim();
            if(genre.isEmpty()){
                System.out.println("Genre cannot be empty. Please try again.");
            }
        }

        boolean invalidInput = false;
        while(!invalidInput){
            try {
                System.out.println("Enter publication year: ");
                publicationYear = scanner.nextInt();
                scanner.nextLine();
                invalidInput = true;
            } catch (Exception e){
                System.out.println("Invalid type data. Please try again.");
                scanner.nextLine();
            }
        }

        Book book = new Book(title, author, genre, publicationYear);
        library.addBook(book);
        
       
;
library.addBook(book);
    }

    public static int displayMenu(Scanner scanner){
        System.out.println("\nChoose an option: ");
        System.out.println("1: Add new Book");
        System.out.println("2: Search book for title");
        System.out.println("3: Search book for author");
        System.out.println("4: Borrow Books");
        System.out.println("5: Return Books");
        System.out.println("0: Exit");
        int choice = scanner.nextInt();
        return choice;
    }
}