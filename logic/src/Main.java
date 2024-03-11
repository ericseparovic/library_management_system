import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
       Scanner scanner = new Scanner(System.in);
       
       int choice = -1;

       while(choice != 0){
           choice = displayMenu(scanner);
       }
       
        
        
       
    }

    public static int displayMenu(Scanner scanner){
        System.out.println("Choose an option: ");
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