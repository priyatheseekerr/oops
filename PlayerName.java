import java.util.Scanner;

public class PlayerName {
    public static void main(String[] args) {
        main obj = new main();
        System.out.println("Player Details: ");
        System.out.println("Player name: " + obj.name);
        System.out.println("Country Name: " + obj.country);
        System.out.println("Skill: " + obj.skill);

    }
}

class main {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String country = sc.nextLine();
    String skill = sc.nextLine();
}