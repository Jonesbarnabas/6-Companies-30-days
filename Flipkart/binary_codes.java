package Flipkart;

import java.util.*;

public class binary_codes {
    public static boolean hasAllCodes(String s, int k) {
        HashSet<String> set=new HashSet<>();
      for(int i=0;i<s.length();i++){
          if(i+k<=s.length())
          set.add(s.substring(i,i+k));
      }  
      if(set.size()==(int)Math.pow(2,k)){
          return true;
      }
      return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(hasAllCodes(sc.next(),sc.nextInt()));
    }
}
