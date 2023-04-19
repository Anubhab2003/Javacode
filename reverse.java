import java.util.*;
public class reverse{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		while(n>0){
			int lastdgt=n%10;
			System.out.print(lastdgt+" ");
			n=n/10;
		}
	System.out.println();
	}
}
