package Flipkart;

import java.util.Scanner;

public class partition_sumsubset {
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%k !=0)
            return false;
        if(nums.length < k) return false;
        
        int target = sum/k;
        boolean[] visited = new boolean[nums.length];
        return partition(nums,visited,0,k,0,target);
    }
    public static boolean partition(int nums[],boolean visited[],int start, int k,int cursum,int target){
        if(k==0) return true;
        if(cursum>target) return false;
        if(cursum==target) {
            return partition(nums,visited,0,k-1,0,target);
        }
         for(int i=start;i<nums.length;i++){
             if(visited[i]) continue;
             visited[i]=true;
             if(partition(nums,visited,i+1,k,cursum+nums[i],target)) return true;
             visited[i]=false;
         }
         return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(canPartitionKSubsets(arr,k));
    }
}
