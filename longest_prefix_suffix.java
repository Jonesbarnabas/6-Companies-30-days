import java.util.*;
public class longest_prefix_suffix {
        public static String longestPrefix(String s) {
        int lps[]=new int[s.length()];
        int len=0,i=1;
        lps[0]=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0) len=lps[len-1];
                else{
                    lps[i]=0;
                    i++;
    
                }
            }
        }
        return s.substring(0,lps[s.length()-1]);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            System.out.println(longestPrefix(str));
        }
}
