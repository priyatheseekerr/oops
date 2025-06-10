import java.util.Scanner;

public class PlayerDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name");
        String name = sc.next();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the game name: ");
        String game = sc.next();
        player p = new player();
        p.setName(name);
        p.setAge(age);
        p.setGame(game);
        p.display();
        sc.close();
    }
}

class player {
    private String name, game;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    void display() {
        System.out.println("Player name: " + getName() + "\nPlayer age: " + getAge() + "\nPlayer Game: " + getGame());
    }
}
