package GoldmanSachs;
import java.util.*;
public class minimum_cards_to_pick_up {
        public static int minimumCardPickup(int[] cards) {
          int n=cards.length;
          int min=Integer.MAX_VALUE;
          HashMap<Integer,Integer> map=new HashMap<>();
    
          for(int i=0;i<n;i++){
              if(!map.containsKey(cards[i])){
                  map.put(cards[i],i);
              }
              else{
                  if(i-map.get(cards[i])<min)
                  min=i-map.get(cards[i]);
                  map.put(cards[i],i);
              }
          }
         if(min==Integer.MAX_VALUE)return -1;
          return min+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimumCardPickup(arr));
    }
}
