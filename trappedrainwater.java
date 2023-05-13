import java.util.*;
public class trappedrainwater {
    public static int trappedwater(int height[]){
        int n=height.length;
        //Calculate Left max boundry
        int leftmax[]=new int [n];
        leftmax[0]=height[0];
        for(int i=1;i<=n-1;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //Calculate Right max boundry
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }
        //loop
        int trappedrain=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedrain+=waterlevel-height[i];
        }
        return trappedrain;



    }
    
    public static void main (String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("The trapped water is "+trappedwater( height));
    }

    
}

