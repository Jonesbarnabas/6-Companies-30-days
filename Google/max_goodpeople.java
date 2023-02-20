package Google;

import java.util.Scanner;

public class max_goodpeople {
    public static int maximumGood(int[][] s) {
        int n=s.length;
        int maxgood=0;
        int comb=1<<n;
        int roles[]=new int[n];
         for(int m=1;m<comb;m++)
         {
             int curmax=apply(roles,m);
             if(valid(s,roles,n))
                maxgood=Math.max(maxgood,curmax);
         }
         return maxgood;
    }
    public static int apply(int roles[],int m)
    {
        int count=0;
        int n=roles.length;
        for(int i=0;i<n;i++)
        {
            roles[i] = m&1;
            count += roles[i];
            m>>=1; 
        }
        return count;
    }
    public static boolean valid(int s[][], int roles[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(roles[i]==0) continue;
            
            for(int j=0;j<n;j++)
            {
                if(s[i][j]==2) continue;
                if(s[i][j]!=roles[j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maximumGood(arr));
    }
}
