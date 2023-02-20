package Flipkart;

import java.util.Scanner;

public class winner_game {
    public static int findTheWinner(int n, int k) {
        if(n==1)
        return 1;
        else
        return (findTheWinner(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(findTheWinner(sc.nextInt(),sc.nextInt()));
    }
}
