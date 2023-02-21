package Amazon;

import java.util.Scanner;

public class last_moment {
    public static int getLastMoment(int n, int[] left, int[] right) {
        int LeftMax =0,RightMin=0;
        if(left.length!=0){
              LeftMax = left[0];
        }
        if(right.length!=0){
            RightMin = right[0];
        }
         
        for(int i=0;i<left.length;i++){
            if(left[i]>LeftMax){
                LeftMax = left[i];
            }
        }    
        for(int j=0;j<right.length;j++){
             if(right[j]<RightMin){
                RightMin = right[j];
            }
        }
        if(left.length==0){
              return n-RightMin;
        } 
        if(right.length==0){
            return LeftMax;
        }

       return Math.max(LeftMax,n-RightMin);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int ar1[]=new int[s1];
        int ar2[]=new int[s2];
        for(int i=0;i<s1;i++){
            ar1[i]=sc.nextInt();
        }
        for(int j=0;j<s2;j++){
            ar2[j]=sc.nextInt();
        }
        System.out.println(getLastMoment(n,ar1,ar2));
    }
}
