import java.util.HashMap;
import java.util.Map;

public class Occurence {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 5, 4, 1, 2, 3, 6, 7, 8, 9 };
        System.out.println("Using only array: ");
        boolean[] flag=new boolean[arr.length];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(flag[i])continue;
            int count=0;
            for(int k=0;k<arr.length;k++){
                if(arr[i]==arr[k]){
                    count++;
                    flag[k]=true;
                }
            }
            // System.out.println(arr[i]+" - "+count);
            map.put(arr[i], count);
        }
        System.out.println(map);
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i, 0)+1);
        }
        System.out.println("Using map : \n"+mp);

    }
}
