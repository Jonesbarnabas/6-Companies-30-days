import java.util.*;
public class bulls_cows {
        public static String getHint(String secret, String guess) {
            int n=secret.length();
            int bulls=0,cows=0;
            int freq[]=new int[10];
            for(int i=0;i<n;i++){
                if(secret.charAt(i)==guess.charAt(i))bulls++;
                freq[secret.charAt(i)-48]++;
            }
            for(int i=0;i<n;i++){
                if(freq[guess.charAt(i)-48]!=0){
                    cows++;
                    freq[guess.charAt(i)-48]--;
                }
            }
            cows=cows-bulls;
            String res=bulls+"A"+cows+"B";
            return res;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println(getHint(sc.nextLine(),sc.nextLine()));
        }
    }


