package Google;

import java.util.*;

public class max_coins {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
  int k=0;
    int max=0;
    int in= piles.length-2;
    while(k!= ((piles.length)/3) ){
        max=max+piles[in];
        in=in-2;
        k++;
    }
 return max;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(maxCoins(arr));
}
}
