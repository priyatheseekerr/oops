import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book title: ");
        String title = sc.next();
        System.out.println("Enter the author name: ");
        String author = sc.next();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();
        new Book(title, author);
        new Book(title, author, price);
        sc.close();
    }
}

class Book {
    String name, author;
    int price;

    Book() {

    }

    Book(String name, String author) {
        System.out.println("Title: " + name);
        System.out.println("Author: " + author);
    }

    Book(String name, String author, int price) {
        System.out.println("Title: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
