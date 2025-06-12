public class AnimalMain {
    public static void main(String[] args) {
        cat c = new cat();
        c.animal();
    }
}

class dog {
    void animal() {
        System.out.println("dog");
    }
}

class cat extends dog {
    void animal() {
        super.animal();
        System.out.println("Cat");
    }
}
