package Google;

import java.util.Scanner;

public class island {
    public static int closedIsland(int[][] g) {
        for (int i = 0; i < g.length; ++i)
        {
           for (int j = 0; j < g[i].length; ++j)
           {
             if (i * j * (i - g.length + 1) * (j - g[i].length + 1) == 0)
               fill(g, i, j);
           }
        }
         int res = 0;
         for (int i = 0; i < g.length; ++i)
         {
           for (int j = 0; j < g[i].length; ++j)
           {
               res += fill(g, i, j) > 0 ? 1 : 0;
           }
         }
         return res;
           }
       
        public static int fill(int[][] g, int i, int j) {
         if (i < 0 || j < 0 || i >= g.length || j >= g[i].length || g[i][j] != 0)
           return 0;
         return (g[i][j] = 1) + fill(g, i + 1, j) + fill(g, i, j + 1)
           + fill(g, i - 1, j) + fill(g, i, j - 1);
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
            System.out.println(closedIsland(arr));
        }
}
