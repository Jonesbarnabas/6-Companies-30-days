package Flipkart;
import java.util.*;
public class closet_prime {
    public static int[] closestPrimes(int l, int r) {
        boolean arr[]=new boolean[r+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=r;i++){
            if(arr[i]){
                for(int j=i;j*i<=r;j++){
                    arr[j*i]=false;
                }
            }
        }
        ArrayList<Integer> s=new ArrayList<>();
        for(int i=2;i<r+1;i++){
            if(arr[i]){
                s.add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        int res[]=new int[2];
        for(int i=0;i<s.size()-1;i++){
            if(s.get(i)>=l && s.get(i)<=r && s.get(i+1)>=l && s.get(i+1)<=r){
                int temp=s.get(i+1)-s.get(i);
                if(temp<min){
                    min=temp;
                    res[0]=s.get(i);
                    res[1]=s.get(i+1);
                }
            }
        }
        if(res[0]==0){
            res[0]=-1;
            res[1]=-1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(closestPrimes(l,r));
    }
}
