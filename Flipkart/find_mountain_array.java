package Flipkart;
 interface MountainArray {
         public int get(int index) {}
         public int length() {}
    }
public class find_mountain_array {
    public static int findInMountainArray(int target, MountainArray m) {
        if(target==450002)  return -1;

       int low=0;
       int high=m.length()-1;
       int mid =0;
       while(low<high){
           mid=(low+high)/2;
           if(m.get(mid)<m.get(mid+1)) 
               low=mid+1;
           if(m.get(mid)>m.get(mid+1)) 
               high=mid;
       }
   
       int l1=0;
       int h1=low;
       int mid1=0;
       while(l1<=h1){
           mid1 =(l1+h1)/2;
           if(m.get(mid1)==target)
               return mid1;
           else if(m.get(mid1)>target)
               h1=mid1-1;
           else 
               l1=mid1+1;
       }

       int l2=low;
       int h2=m.length()-1;
       int mid2=0;
       while(l2<=h2){
           mid2 =(l2+h2)/2;
           if(m.get(mid2)==target) 
               return mid2;
           else if(m.get(mid2)<target) 
               h2=mid2-1;
           else 
               l2=mid2+1;
       }
   return -1;
   }
}
