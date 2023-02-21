package Amazon;

import java.util.*;

public class max_subarray_minproduct {
    public static int maxSumMinProduct(int[] n) {
        Stack<Integer> st = new Stack<>();
        long dp[] = new long[n.length + 1], res = 0;
        for (int i = 0; i < n.length; ++i)
           dp[i + 1] = dp[i] + n[i];
        // System.out.println(Arrays.toString(dp));
        for (int i = 0; i <= n.length; ++i) {
            while (!st.empty() && (i == n.length || n[st.peek()] > n[i])) {
                int j = st.pop();
                res = Math.max(res, (dp[i] - dp[st.empty() ? 0 : st.peek() + 1]) * n[j]);
            }
            //(2*2)+(3*3)+(2*2)=14 input=[1,2,3,2]
            st.push(i);
        }
        return (int)(res % 1000000007);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
    }
        System.out.println(maxSumMinProduct(ar));
    }
}
