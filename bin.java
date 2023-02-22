import java.lang.*;
import java.util.*;
class bin{
	public static void main(String arg[]){
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int x;
		x=s.nextInt();
		System.out.println(Integer.toBinaryString(x));
	}
}
