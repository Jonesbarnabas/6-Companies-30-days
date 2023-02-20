package Adobe;

import java.util.Scanner;

public class people_secret {
    public static int peopleAwareOfSecret(int n, int delay, int forget) {
        long arr[]=new long[n+1];
        long res=0,mod=(long)1000000007;
        arr[1]=1;
        long share=0;
        for(int i=2;i<=n;i++){
            if(i-delay>=0){
                share=share+arr[i-delay];
            }
            if(i-forget>=0){
                share=share-arr[i-forget];
            }
            arr[i]=share%mod;
        }
        for(int i=n-forget+1;i<=n;i++){
            res=(res+arr[i])%mod;
        }
        return (int)res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(peopleAwareOfSecret(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }
}
