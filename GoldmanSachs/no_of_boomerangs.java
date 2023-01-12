package GoldmanSachs;

import java.util.*;

public class no_of_boomerangs {
        public static int numberOfBoomerangs(int[][] p) {
          int count=0;
          int n=p.length;
          for(int i=0;i<n;i++){
               HashMap<Integer,Integer> map=new HashMap<>();
              for(int j=0;j<n;j++){
                  int d=(int)Math.pow(Math.abs(p[i][0]-p[j][0]),2)+(int)Math.pow(Math.abs(p[i][1]-p[j][1]),2);
                  map.put(d,map.getOrDefault(d,0)+1);
              }
              for(int val:map.values()){
                  count+=val*(val-1);
              }
          }
          return count;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int arr[][]=new int[m][2];
            for(int i=0;i<m;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println(numberOfBoomerangs(arr));
        }
}
