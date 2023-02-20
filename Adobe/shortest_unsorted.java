package Adobe;

import java.util.*;

public class shortest_unsorted {
    public static int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[n];
        nums1=nums.clone();
        Arrays.sort(nums1);
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums1[i]){
                a=i;
                break;
            }
        }
        
        for(int i=n-1;i>=0;i--){
            if(nums[i]!=nums1[i]){
                b=i;
                break;
            }
        }
        if(a==0&&b==0)return 0;
     return (b-a)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findUnsortedSubarray(arr));
    }
}
