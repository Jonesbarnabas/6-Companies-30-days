package Flipkart;
import java.util.*;

public class distant_barcodes {
    public static int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : barcodes)
             map.put(i, map.getOrDefault(i, 0) + 1);

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int n = barcodes.length, i = 0;
        int[] res = new int[n];
        for (Map.Entry<Integer, Integer> e : list) {
            int fr = e.getValue();
            while (fr> 0) {
                res[i] = e.getKey();
                i += 2;
                fr--;
                if (i >= barcodes.length) i = 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(rearrangeBarcodes(arr));
    }
}
