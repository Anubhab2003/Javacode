import java.util.*;
public class incometax{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.print("Sir would you mind entering your annual Income₹:");
		int income=s.nextInt();
		int tax;
		//System.out.println("Sir would you mind entering your annual Income");
		if (income<500000){
			tax=0;
			System.out.println("Tax is 0% "+ tax);
			System.out.println("Annual salary from tax cutting ₹"+(income-tax));
		}
		else if (income>=500000 && income <1000000){
			tax=(int)(0.2*income);
			System.out.println("Tax is 20%"+tax);
			System.out.println("Annual salary from tax cutting ₹"+(income-tax));
		}
		else {
			tax=(int)(0.3*income);
			System.out.println("Tax is 30%"+tax);
			System.out.println("Annual salary from tax cutting ₹"+(income-tax));
		}
	}
}
