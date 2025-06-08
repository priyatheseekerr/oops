import java.util.Scanner;

public class HallMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the booking details 1: ");
        String name=sc.next();
        String contactNumber=sc.next();
        double costPerDay=sc.nextDouble();
        String ownerName=sc.next();
        hall h1=new hall(name, contactNumber, costPerDay, ownerName);
        String name1=sc.next();
        String contactNumber1=sc.next();
        double costPerDay1=sc.nextDouble();
        String ownerName1=sc.next();
        hall h2=new hall(name1, contactNumber1, costPerDay1, ownerName1);
        if(h1.equals(h2)){
            System.out.println("Halls are same");
        }
        else{
            System.out.println("Halls arre not same");
        }
        sc.close();

    }
}
class hall{
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;
    hall(){

    }
    hall(String name,String contactNumber,double costPerDay,String  ownerName ){
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.ownerName=ownerName;
    }
    boolean equals(hall o){
        if(this==o)return true;
        if(o==null || getClass()!=o.getClass())return false;
        hall other=(hall)o;
        return this.name.equals(other.name)&& this.contactNumber.equals(other.contactNumber)
        && this.costPerDay.equals(other.costPerDay) && this.ownerName.equals(other.ownerName);
    }
}
