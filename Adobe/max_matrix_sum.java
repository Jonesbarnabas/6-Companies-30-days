package Adobe;

import java.util.Scanner;

public class max_matrix_sum {
    public static long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        long negcount=0,sum=0,min=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]<0) negcount++;
                sum+=Math.abs(matrix[i][j]);
                min=Math.min(min,Math.abs(matrix[i][j]));
            }
        }
        return sum-(negcount%2==0?0:2*min);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxMatrixSum(arr));
    }
}
