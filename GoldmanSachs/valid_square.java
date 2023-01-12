package GoldmanSachs;
import java.util.*;
public class valid_square {
        public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
            HashSet<Double> set=new HashSet<>();
            double a=Math.pow(p2[0]-p1[0],2)+Math.pow(p2[1]-p1[1],2);
            double b=Math.pow(p3[0]-p4[0],2)+Math.pow(p3[1]-p4[1],2);
            double c=Math.pow(p1[0]-p3[0],2)+Math.pow(p1[1]-p3[1],2);
            double d=Math.pow(p1[0]-p4[0],2)+Math.pow(p1[1]-p4[1],2);
            double e=Math.pow(p2[0]-p4[0],2)+Math.pow(p2[1]-p4[1],2);
             double f=Math.pow(p2[0]-p3[0],2)+Math.pow(p2[1]-p3[1],2);
            set.add(a);
            set.add(b);
            set.add(c);
            set.add(d);
            set.add(e);
            set.add(f);
            if(a!=0&&b!=0&&c!=0&&d!=0&&e!=0&&f!=0&&set.size()==2) return true;
            return false;
            
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int p1[]=new int[n];
            int p2[]=new int[n];
            int p3[]=new int[n];
            int p4[]=new int[n];
            for(int i=0;i<n;i++){
                p1[i]=sc.nextInt();
                p2[i]=sc.nextInt();
                p3[i]=sc.nextInt();
                p4[i]=sc.nextInt();
            }
            System.out.println(validSquare(p1,p2,p3,p4));
        }
}
