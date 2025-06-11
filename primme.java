public class primme {
     public static void main(String[] args) {
        int n=2;
        boolean flag=true;
        if(n<=1){
            flag=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
