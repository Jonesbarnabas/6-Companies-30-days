package Google;

import java.util.*;

public class Max_floors {
    public static int maxConsecutive(int bottom, int top, int[] special) {
        int max = Integer.MIN_VALUE;
        
        Arrays.sort(special);
        max = Math.max(max, special[0] - bottom);

        for(int i = 1; i < special.length; i++) {
            max = Math.max(max, special[i] - special[i - 1]  - 1);
        }
        
        max = Math.max(max, top - special[special.length - 1]);
        
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxConsecutive(b,t,arr));
    }
}
