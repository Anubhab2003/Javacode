import java.util.*;
public class leap{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a year");
		Float n=s.nextFloat();
		if (n%4==0){
			if(n%100==0){
				if(n%400==0){
					System.out.println("Leap year");
				}
				else{
					System.out.println("Not a leap year");
				}

			}else{
				System.out.println("Leap year");
			}
		}
		else{
			System.out.println("Not a leap year");
		}
		
	}
}
