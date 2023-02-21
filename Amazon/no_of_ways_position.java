package Amazon;

import java.util.*;

public class no_of_ways_position {
    static int dp[][];
    public static int numberOfWays(int s, int e, int k) {
        dp=new int[4000][1002];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        return find(s,e,k);
    }
    public static int find(int s, int e, int k)
    {
        if(k==0)
        {
            if(s==e)
                return 1;
            return 0;
        }
        if(dp[s+1001][k]!=-1)
            return dp[s+1001][k];
        int a=find(s+1, e, k-1);
        int b= find(s-1, e, k-1);
        return dp[s+1001][k]=(a+b)%1000000007;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(numberOfWays(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }
}
