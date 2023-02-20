package Google;

public class random_pick {
    private int cum[];
    private int sum;
    public Solution(int[] w) {
        sum=0;
        cum=new int[w.length];
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            cum[i]=sum;
        }
    }
    
    public int pickIndex() {
        int in=(int)(Math.random()*sum);    
        return binarysearch(in+1);
    }
    
    public int binarysearch(int val){
        int l=0,r=cum.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(cum[mid]<val)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
}
