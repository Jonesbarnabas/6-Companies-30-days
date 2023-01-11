package microsoft;
import java.util.*;

public class combinations {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        com(k,n,1,new ArrayList<Integer>(),ans);
        return ans;
    }
    public static void com(int k,int n,int s,List<Integer> path,List<List<Integer>> ans){
        if(k==path.size() && n==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=s;i<=9;i++){
            path.add(i);
            com(k,n-i,i+1,path,ans);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(combinationSum3(k,n));
    }
}

