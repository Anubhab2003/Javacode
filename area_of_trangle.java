import java.util.*;
class area_of_trangle{
	public static void main(String args[]){
		float h,b,a;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter height and then breath");
		h=s.nextFloat();
		b=s.nextFloat();
		a=(float)0.5*(h*b);
		System.out.print("Area is");
		System.out.println(a);
	}
}

