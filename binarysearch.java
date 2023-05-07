import java.util.*;
public class binarysearch{
	public static int bisearch(int number[],int key){
		int start=0, end=number.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			//comparision
			if(number[mid]==key){
				//found
				return mid;
			}
			if (number[mid]<key){
				start=mid+1;
			}else{
				end=mid-1;
			}

		}
		return -1;
	}
	public static void main(String args[]){
		int number[]={3,6,9,12,15,18,21,24,27,30};
		int key=30;
		System.out.println("Index of key is "+bisearch(number,key));

	}
}




