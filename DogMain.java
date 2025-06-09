import java.util.Scanner;

public class DogMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dog name: ");
        String name = sc.next();
        System.out.println("Enter the dog color: ");
        String color = sc.next();
        new Dog(name, color).display();
        sc.close();
    }
}

class Dog {
    String name, color;

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Dog Name: " + name + "\nDog Color: " + color);
    }
}
