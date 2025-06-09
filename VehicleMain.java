import java.util.Scanner;

class vehicle {
    protected String type;

    vehicle(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Type: " + type);
    }
}

class car extends vehicle {
    private String brand;

    car(String brand, String type) {
        super(type);
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car type: ");
        String type = sc.next();
        System.out.println("Enter the Car brand: ");
        String brand = sc.next();
        car n = new car(brand, type);
        n.displayType();
        n.displayBrand();
        sc.close();

    }
}
