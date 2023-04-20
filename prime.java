import java.util.*;
public class prime{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number Sir :");
		n=s.nextInt();
		if(n==2){
			System.out.println("Yes its prime number");
		}else{
			boolean isprime= true;
			for(int i=2;i<=n-1;i++){
				if (i%n==0){
					isprime= false;
				}
			if (isprime==true){
				System.out.println("Yes the given number is prime");
			}else{
				System.out.println("The number is composite");
			}
		}
	}
}



