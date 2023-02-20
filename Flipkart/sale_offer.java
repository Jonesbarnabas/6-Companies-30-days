package Flipkart;

import java.util.ArrayList;
import java.util.*;

public class sale_offer {
    public static int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
    	return helper(price, special, needs, 0);
    }
    
    private static int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int in) {
    	int min = directPurchase(price, needs);
    	for (int i = in; i < special.size(); i++) {
    		List<Integer> offer = special.get(i);
    		List<Integer> temp = new ArrayList<Integer>();
        	for (int j= 0; j < needs.size(); j++) {
        		if (needs.get(j) < offer.get(j)) { 
        			temp =  null;
        			break;
        		}
        		temp.add(needs.get(j) - offer.get(j));
        	}
    		if (temp != null) { 
    			min = Math.min(min, offer.get(offer.size() - 1) + helper(price, special, temp, i)); 
    		}
    	}

    	return  min;
    }
    
    private static int directPurchase(List<Integer> price, List<Integer> needs) {
    	int total = 0;
    	for (int i = 0; i < needs.size(); i++) {
    		total += price.get(i) * needs.get(i);
    	}
    	
    	return total;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> price=new ArrayList<>();
        List<Integer> needs=new ArrayList<>();
        List<List<Integer>> sp = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            price.add(sc.nextInt(i));
            needs.add(sc.nextInt());  
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sp.get(i).add(sc.nextInt());
            }
        }
        System.out.println(shoppingOffers(price,sp,needs));
    }
}
