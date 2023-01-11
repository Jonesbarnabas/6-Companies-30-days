package microsoft;
import java.util.*;
public class Airplane_seat {
    public static double nthPersonGetsNthSeat(int n) {
        if(n==1)return 1;
        double res=1.0/2.0;
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nthPersonGetsNthSeat(n));
    }
}