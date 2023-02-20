package Amazon;

import java.util.*;

public class no_of_match_subsequence {
    public static int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        char[] ch=s.toCharArray();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:map.keySet()){
            char[] temp=str.toCharArray();
            int i=0,j=0;
            while(i<ch.length && j<temp.length){
                if(ch[i]==temp[j]){
                    i++;
                    j++;
                }
                else i++;
            }
            if(j==temp.length){
                count+=map.get(str);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println(numMatchingSubseq(sc.next(),str));
    }
}
