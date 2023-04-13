import java.util.*;
public class lossyconvt{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		//byte b=5; An Error will occur
		//b=b*2; Here the b is upgraded into int so we cannot assign it into byte datatype as loss in data 
		//but we can type cast
		byte b=5;
		b=(byte)(b*2);
		System.out.println(b);
	}
}


