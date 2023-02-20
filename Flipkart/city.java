package Flipkart;
import java.util.*;
public class city {
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] arr = new int[n][n];
        int res = 0, min = n;
        for (int[] row : arr)
            Arrays.fill(row, 10001);
        for (int[] e : edges)
            arr[e[0]][e[1]] = arr[e[1]][e[0]] = e[2];
        for (int i = 0; i < n; ++i)
            arr[i][i] = 0;
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; ++j)
                if (arr[i][j] <= distanceThreshold)
                    ++count;
            if (count <= min) {
                res = i;
                min = count;
            }
        }
        return res;
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
        System.out.println(findTheCity(sc.nextInt(), arr, sc.nextInt()));
    }
}
