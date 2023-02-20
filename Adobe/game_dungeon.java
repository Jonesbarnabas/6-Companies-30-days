package Adobe;

import java.util.Scanner;

public class game_dungeon {
    public static int calculateMinimumHP(int[][] dun) {
        int r=dun.length;
        int c=dun[0].length;
        int dp[][]=new int[r][c];
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(i==r-1 && j==c-1){
                    dp[i][j]=(int)Math.min(0,dun[i][j]);
                }
                else if(i==r-1){
                    dp[i][j]=(int)Math.min(0,dun[i][j]+dp[i][j+1]);
                }
                else if(j==c-1){
                    dp[i][j]=(int)Math.min(0,dun[i][j]+dp[i+1][j]);
                }
                else{
                    dp[i][j]=(int)Math.min(0,dun[i][j]+(int)Math.max(dp[i][j+1],dp[i+1][j]));
                }
            }
        }
        return Math.abs(dp[0][0])+1;
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
        System.out.println(calculateMinimumHP(arr));
    }
}
