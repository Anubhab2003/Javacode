import java.util.*;
public class largest {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }

        }
        return largest;

    }
    public static void main(String args[]){
        int numbers[]={1,1558,4578,6666,90,32};
        int x=getlargest(numbers);
        System.out.println("Largest number in array is"+x);
    }
    
}
