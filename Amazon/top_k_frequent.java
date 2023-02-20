package Amazon;
import java.util.*;;
public class top_k_frequent {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        ArrayList<Integer> val=new ArrayList<>(map.values());
        ArrayList<String> key=new ArrayList<>(map.keySet());
        ArrayList<String> res=new ArrayList<>();
        Collections.sort(val);
        Collections.reverse(val);
        for(int i=0;i<val.size();i++){
            ArrayList<String> temp=new ArrayList<>();
            for(int j=0;j<val.size();j++){
                if(map.get(key.get(j))==val.get(i)){
                    temp.add(key.get(j));
                    map.put(key.get(j),-1);
                }
            }
            Collections.sort(temp);
            res.addAll(temp);
        }
        key.clear();
        for(int i=0;i<k;i++){
            key.add(res.get(i));
        }
        return key;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println(topKFrequent(str,k));
    }
}
