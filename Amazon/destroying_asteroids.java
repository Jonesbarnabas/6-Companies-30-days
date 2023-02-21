package Amazon;

import java.util.*;

public class destroying_asteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for (int i=0; i<asteroids.length; i++) {
            if (mass>=asteroids[i]) mass+=asteroids[i];
            else return false;
            if (mass>100000) return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(asteroidsDestroyed(m,arr));
    }
}
