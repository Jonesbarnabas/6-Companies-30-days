package Amazon;

import java.util.*;

public class split_string {
    public static int maxUniqueSplit(String s) {
        HashSet<String> set = new HashSet<>();
        return dfs(set, 0, s);
    }
    
    public static int dfs(HashSet<String> set, int idx, String s) {
        if (idx >= s.length()) return 0;
        int res = -1;  
        for (int i = idx + 1; i <= s.length(); i++) {
            String sub = s.substring(idx, i);
            if (!set.add(sub)) 
                continue; 
            int next = dfs(set, i, s);
            if (next >= 0) 
                res = Math.max(res, next + 1);
            set.remove(sub);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(maxUniqueSplit(sc.next()));
    }
}
