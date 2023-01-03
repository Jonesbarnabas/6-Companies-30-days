import java.util.*;
class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
           if(tokens[i].equals("+")){
                int second=st.pop();
                int first=st.pop();
                int res=first+second;
                st.push(res);
                // System.out.println(res);
            }
              else if(tokens[i].equals("-")){
                int second=st.pop();
                int first=st.pop();
                int res=first-second;
                st.push(res);
            }
              else if(tokens[i].equals("*")){
                int second=st.pop();
                // System.out.println(second);
                int first=st.pop();
                //  System.out.println(first);
                int res=first*second;
                //  System.out.println(res);
                st.push(res);
            }
              else if(tokens[i].equals("/")){
                int second=st.pop();
                int first=st.pop();
                int res=first/second;
                st.push(res);
            }
              else{
                st.push(Integer.parseInt(tokens[i]));
                //  System.out.println(st);
            }

        }
        int res=st.peek();
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println(evalRPN(str));
    }
}