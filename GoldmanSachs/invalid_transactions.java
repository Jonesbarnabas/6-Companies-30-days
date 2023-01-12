package GoldmanSachs;
import java.util.*;
public class invalid_transactions {
        public static List<String> invalidTransactions(String[] tr) {
            ArrayList<String> str=new ArrayList<>();
          String name[]=new String[tr.length];
          int time[]=new int[tr.length];
          int amt[]=new int[tr.length];
          String city[]=new String[tr.length];
          int i=0;
          for(String st:tr){
              String temp[]=st.split(",");
              name[i]=temp[0];
              time[i]=Integer.parseInt(temp[1]);
              amt[i]=Integer.parseInt(temp[2]);
              city[i]=temp[3];
              i++;
          }
          int j=0;
          for(int amount:amt){
              if(amount>1000){
                  str.add(tr[j]);
              }
              j++;
          }
          for(int m=0;m<tr.length;m++){
              for(int n=0;n<tr.length;n++){
                  if(name[m].equals(name[n])&&!city[m].equals(city[n])){
                      if(Math.abs(time[m]-time[n])<=60){
                          if(amt[m]<=1000){
                              str.add(tr[m]);
                              break;
                          }
                      }
                  }
              }
          }
          return str;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String str[]=new String[n];
            for(int i=0;i<n;i++){
                str[i]=sc.next();
            }
            System.out.println(invalidTransactions(str));
        }
}
