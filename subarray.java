import java.util.*;
public class subarray{
	public static void sarray(int number[]){
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for (int i=0;i<number.length;i++){
			
			int start=i;
			for(int j=i;j<number.length;j++){
				int end=j;
				currsum=0;
				for(int k=start;k<end;k++){
					currsum=currsum+number[k];
					
					
				}
				System.out.println("Current sum is"+currsum);
				if(maxsum<currsum){
					maxsum=currsum;
				}
				//System.out.println("Maximum sum is"+maxsum);
			
				
			}
			
			

		}

	System.out.println("Maximum sum is "+maxsum);
	}

	public static void main(String args[]){
		int number[]={1,2,47,45,66,89};
		sarray(number);
	}
}


