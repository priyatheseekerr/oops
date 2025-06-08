public class overloadingMain {
    public static void main(String[] args) {
        new overloading().display();
        new overloading("newyork", 30).display();
        new overloading("australia", 52, " tomorrow").display();

    }
}

class overloading {
    String name, day;
    int temp;

    overloading() {
        this.name = "Argentina";
        this.day = "yesterday";
        this.temp = 29;
    }

    overloading(String name, int temp) {
        this.name = name;
        this.day = "today";
        this.temp = temp;
    }

    overloading(String name, int temp, String day) {
        this.name = name;
        this.day = day;
        this.temp = temp;
    }

    void display() {
        System.out.println(name + " " + day + " " + temp + "°");
    }

}
