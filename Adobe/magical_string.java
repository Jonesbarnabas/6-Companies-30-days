package Adobe;

import java.util.Scanner;

public class magical_string {
    public static int magicalString(int n) {
        int c=1;
        String str="";
        str+="122";
        int i=2;
        while(i<n && str.length()<n){
            if(str.charAt(i)=='1'){
                c++;
                if(str.charAt(str.length()-1)=='2') str+="1";
                else str+="2";
            }
            else{
                if(str.charAt(str.length()-1)=='2') str+="11";
                else str+="22";
            }
            i++;
        }
        while(i<n){
            if(str.charAt(i)=='1'){
                c++;
            }
            i++;
        }
        return c;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(magicalString(sc.nextInt()));
     }
}
