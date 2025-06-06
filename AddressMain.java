import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the address details:");
        System.out.println("Street name: ");
        String street = sc.next();
        System.out.println("City name: ");
        String city = sc.next();
        System.out.println("Pincode: ");
        String pin = sc.next();
        System.out.println("Country name: ");
        String country = sc.next();
        address obj = new address(street, city, pin, country);
        obj.displayAddress();
        sc.close();

    }
}

class address {
    String street, city, pincode, country;

    address(String street, String city, String pincode, String country) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
    }

    void displayAddress() {
        System.out.println("Street: " + street + "\n" + "City: " + city + "\n" + "Pincode: " + pincode + " \n"
                + "Country: " + country);
    }
}
