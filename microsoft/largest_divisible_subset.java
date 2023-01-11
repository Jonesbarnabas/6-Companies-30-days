package microsoft;
import java.util.*;
public class largest_divisible_subset {
        public static List<Integer> largestDivisibleSubset(int[] nums) {
            var len=new int[nums.length];
            return constructlds(nums,len,ldssize(nums,len));
        }
        public static int ldssize(int num[],int len[]){
            Arrays.sort(num);
            Arrays.fill(len,1);
            int ldssize=1;
            for(int i=0;i<num.length;i++){
                for(int j=0;j<i;j++){
                    if(num[i]%num[j]==0){
                        len[i]=Math.max(len[i],len[j]+1);
                        ldssize=Math.max(ldssize,len[i]);
                    }
                }
    
            }
            return ldssize;
        }
        public static LinkedList<Integer> constructlds(int num[],int len[],int ldssize){
            int pre=-1;
            LinkedList<Integer> lds=new LinkedList<Integer>();
            for(int i=len.length-1;i>=0;i--){
                if(len[i]==ldssize&&(pre==-1||pre%num[i]==0)){
                    lds.addFirst(num[i]);
                    ldssize--;
                    pre=num[i];
                }
            }
        return lds;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(largestDivisibleSubset(arr));
        }
    
}
