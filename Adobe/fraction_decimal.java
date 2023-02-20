package Adobe;
import java.util.*;
public class fraction_decimal {
        public static String fractionToDecimal(int a, int b) {
             long n=Math.abs((long)a);
             long d=Math.abs((long)b);
             StringBuilder str=new StringBuilder();
             if((a<0 && b>0) || (a>0 && b<0)){
                  str.append('-');
             }
             str.append(n/d);
             n=n%d;
             if(n>0) str.append('.');
             HashMap<Long,Integer> map=new HashMap<>();
             while(!map.containsKey(n))
             {
                 map.put(n,map.size());
                 n=n*10;
                 if(n>0) str.append(n/d);
                 n=n%d;
             }
             if(n>0)
             {
                 str.insert(str.length()-(map.size()-map.get(n)),'(');
                 str.append(')');
             }
             return str.toString();
        }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fractionToDecimal(sc.nextInt(),sc.nextInt()));
      }  
    
}
