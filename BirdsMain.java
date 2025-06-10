import java.util.Scanner;

public class BirdsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name to call (Parrot,kiwi,cocktail): ");
        String name = sc.next();
        if (name.equalsIgnoreCase("parrot")) {
            new Parrot();
        } else if (name.equalsIgnoreCase("kiwi")) {
            new Kiwi();
        } else if (name.equalsIgnoreCase("Cocktail")) {
            new Cocktail();
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}

class Birds {
    Birds() {
        System.out.println("Birds: ");
    }
}

class Parrot extends Birds {
    Parrot() {
        System.out.println("Grey Parrot");
    }
}

class Cocktail extends Parrot {
    Cocktail() {
        System.out.println("Grey Cocktail");
    }
}

class Kiwi extends Cocktail {
    Kiwi() {
        System.out.println("Grey kiwi");
    }
}
