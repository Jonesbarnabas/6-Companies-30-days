package Flipkart;
import java.util.*;
public class custom_sort {
    public static String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ch[]=s.toCharArray();
        char ch1[]=order.toCharArray();
        String str="";
        String res="";
        for(char c:ch){
            if(order.contains(c+"")){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else{
                str+=c;
            }
        }
        // System.out.println(map);
        // System.out.println(str);
        for(char c:ch1){
            if(s.contains(c+"")){
                int fr=map.get(c);
                String temp=(c+"").repeat(fr);
                res+=temp;
            }
        }
        res+=str;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(customSortString(sc.next(),sc.next()));
    }
}
