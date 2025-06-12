public class printMain {
    public static void main(String[] args) {
        print p=new print();
        p.display(56);
        p.display("hello");
        p.display(false);
    }
}
class print{
    void display(int i){
        System.out.println(i);
    }
    void display(String i){
        System.out.println(i);
    }
    void display(boolean i){
        System.out.println(i);
    }
}
