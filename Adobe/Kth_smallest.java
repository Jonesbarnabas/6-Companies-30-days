package Adobe;

import java.util.Scanner;

public class Kth_smallest {
    public static int findKthNumber(int n, int k) {
        long cur=1;
        while(k>1){
            long len=length(cur,cur+1,n);
            if(len<=k-1){
                k-=len;
                cur=cur+1;
            }
            else{
                cur=cur*10;
                k--;
            }
        }
        return (int)cur;
    }
     private static long length(long a, long b, int n) {
        long gap = 0;
        while(a <= n) {
            gap += Math.min(n + 1, b) - a;
            a = a * 10;
            b = b * 10;
        }
        return gap;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(findKthNumber(n,k));
    }
}
