package GoldmanSachs;

import java.util.Scanner;

public class factorial_with_trailing_zeros {
        public static int trailingZeroes(int n) {
            int c=0;
        while(n>0){
            c+=n/5;
            n/=5;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(trailingZeroes(sc.nextInt()));
    }
}
