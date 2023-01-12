package GoldmanSachs;
import java.util.*;
public class nice_pairs_in_array {
    public static int countNicePairs(int[] nums) {
        int n=nums.length;
      HashMap<Integer,Integer> map=new HashMap<>();
      long count=0;
      for(int i=0;i<n;i++){
          StringBuffer str=new StringBuffer(nums[i]+"");
          str.reverse();
          int a=nums[i]-Integer.parseInt(str+"");
          if(map.containsKey(a)){
              count+=map.get(a);
            //   map.put(a,1);
          }
          map.put(a,map.getOrDefault(a,0)+1);

      }
      return (int)(count%1000000007);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countNicePairs(arr));
    }
}
