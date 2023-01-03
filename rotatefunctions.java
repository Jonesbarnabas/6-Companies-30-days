import java.util.*;
class rotatefunctions {
    public static int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sumofele=0;
        int sumofin=0;
        for(int i=0;i<n;i++){
            sumofele+=nums[i];
            sumofin+=i*nums[i];
        }
        int max=sumofin;
        for(int i=n-1;i>0;i--){
            sumofin=sumofin+sumofele-n*nums[i];
            if(max<sumofin){
                max=sumofin;
            }
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
        System.out.println(maxRotateFunction(arr));
    }
}