import java.util.*;
public class gstbill{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the cost of pen , pencil and eraser");
		Float pen=s.nextFloat();
		Float pencil=s.nextFloat();
		Float eraser=s.nextFloat();
		float bill=(pen*(18/100)+pen)+(pencil*(18/100)+pencil)+(eraser*(18/100)+eraser);
		System.out.print("The total bill is:₹"+bill);
	}
}


























