import java.util.*;
public class minimum_deletions {
        static int gcd(int a,int b){
              
             if (a == 0)
                return b;
            return gcd(b % a, a);
            }
        public static int minOperations(int[] n, int[] nd) {
            int res=nd[0];
            for(int b:nd){
                res=gcd(res,b);
            }
            Arrays.sort(n);
            int count =0;
            for(int i=0;i<n.length;i++){
                if(res%n[i]!=0)
                count++;
                else{
                    break;
                }
                // return count;
            }
            //    return -1;
               if(count==0)return -1;
               else return count;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("minimum deletions:"+minOperations(arr1,arr2));
    }           
 }
    

