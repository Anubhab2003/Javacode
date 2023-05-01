import java.util.*;
public class functionoverloading {
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(add(3,7));
        System.out.println(add(3.5f,5.9f));

    }
    
}
