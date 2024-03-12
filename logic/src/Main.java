import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       Scanner scanner = new Scanner(System.in);
       
       int choice = -1;

       while(choice != 0){
           choice = displayMenu(scanner);
           scanner.nextLine();

           switch (choice){
               case 1:
                   addBook(library, scanner);
                   break;
           }
       }
       
        
        
       
    }

    public static void addBook(Library library, Scanner scanner){
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.println("Enter publication Year: ");
        int publicationYear = scanner.nextInt();

        Book book = new Book(title, author, genre, publicationYear);
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