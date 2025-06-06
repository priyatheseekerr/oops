
import java.util.Scanner;

public class DuplicateUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  user name ,username,email and mobile number details: ");
        String name = sc.next(), username = sc.next(), mail = sc.next(), mobile = sc.next();
        System.out.println("Enter Second  user name ,username,email and mobile number details: ");
        String name1 = sc.next(), username1 = sc.next(), mail1 = sc.next(), mobile1 = sc.next();
        duplicateChecker u1 = new duplicateChecker(name, username, mail, mobile);
        duplicateChecker u2 = new duplicateChecker(name1, username1, mail1, mobile1);
        if (u1.equals(u2))
            System.out.println("User 1 and User 2 are equal");
        else
            System.out.println("User 1 and User 2 are not equal");
        sc.close();

    }
}

class duplicateChecker {
    private String name, userName, email, PhNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return PhNo;
    }

    public void setPhNo(String PhNo) {
        this.PhNo = PhNo;
    }

    duplicateChecker(String name, String username, String email, String PhNo) {
        this.name = name;
        this.userName = username;
        this.email = email;
        this.PhNo = PhNo;

    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        duplicateChecker other = (duplicateChecker) obj;
        return this.PhNo.equals(other.PhNo);
    }
}
