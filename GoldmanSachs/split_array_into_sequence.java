package GoldmanSachs;
import java.util.*;
public class split_array_into_sequence {
        public static boolean isPossible(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<>();
            HashMap<Integer,Integer> map1=new HashMap<>();
            for(int i:nums){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])<=0) 
                     continue;
                else if(map1.getOrDefault(nums[i],0)>0)
                {
                    map.put(nums[i],map.getOrDefault(nums[i],0)-1);
    
                    map1.put(nums[i],map1.getOrDefault(nums[i],0)-1);
                    map1.put(nums[i]+1,map1.getOrDefault(nums[i]+1,0)+1);
                }
                else if(map.getOrDefault(nums[i],0)>0 && map.getOrDefault(nums[i]+1,0)>0 && map.getOrDefault(nums[i]+2,0)>0)
                {
                   map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                   map.put(nums[i]+1,map.getOrDefault(nums[i]+1,0)-1);
                   map.put(nums[i]+2,map.getOrDefault(nums[i]+2,0)-1);
                   
                   map1.put(nums[i]+3,map1.getOrDefault(nums[i]+3,0)+1); 
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isPossible(arr));
    }
}
