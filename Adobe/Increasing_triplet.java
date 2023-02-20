package Adobe;

import java.util.Scanner;

public class Increasing_triplet {
        public static boolean increasingTriplet(int[] nums) {
            int left=Integer.MAX_VALUE;
            int mid=Integer.MAX_VALUE;
            for(int num:nums){
                if(num>mid){
                    return true;
                }
                else if(num>left && num<=mid){
                    mid=num;
                }
                else if(num<=left){
                    left=num;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(increasingTriplet(arr));
    }
}
