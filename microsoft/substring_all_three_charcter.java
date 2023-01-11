package microsoft;
import java.util.*;
    public class substring_all_three_charcter {
    public static int numberOfSubstrings(String s) {
        int freq[]=new int[3];
        int res=0,j=0;
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            freq[ch[i]-'a']++;
            while(freq[0]>0&&freq[1]>0&&freq[2]>0){
                freq[ch[j]-'a']--;
                j++;
            }
            res+=j;
        }
return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(numberOfSubstrings(sc.nextLine()) );
    }
}

