
public class ChainingMain {
    public static void main(String[] args) {
        new chaining(105, "priya", 'h');
    }
}

class chaining {
    chaining() {
        this(0, "Default", 'c');
    }

    chaining(int id, String name, char ch) {
        System.out.println("ID: " + id + " NAME: " + name + " GRADE: " + ch);
    }
}
