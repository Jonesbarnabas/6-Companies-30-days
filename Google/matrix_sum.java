package Google;

import java.util.Scanner;

public class matrix_sum {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int res[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int r1= i-k<0 ? 0 : i-k;
                int r2= i+k>=n ? n-1 : i+k;
                int c1= j-k<0 ? 0 : j-k;
                int c2= j+k>=m ? m-1 : j+k;
                res[i][j]=sum(r1,c1,r2,c2,mat);
            }
        }
        return res;
    }
    public static int sum(int r1,int c1,int r2,int c2,int [][] mat){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(matrixBlockSum(arr,k));
    }
}
