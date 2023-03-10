package Amazon;

import java.util.*;

public class max_hourglass {
    public static int maxSum(int[][] grid) {
        int max = -1, m = grid.length, n = grid[0].length;
        for (int row = 0; row < m - 2; row++) {
            for (int col = 0; col < n - 2; col++) {
                int temp = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
                temp += grid[row + 1][col + 1];
                temp += grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2];
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
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
        System.out.println(maxSum(arr));
    }
}
