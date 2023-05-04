import java.util.*;

public class menu {
    public static String lsearch(String numbers[], String food) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(food)) {
                return Integer.toString(i);
            }
        }
        return "Food Not Found";
    }

    public static void main(String args[]) {
        String numbers[] = {"Momo", "Mutton Biriyani", "Chicken Biriyani", "Chicken Chowmein", "Mutton Curry", "Aloo posto"};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a food you wanna have!!");
        String food = s.nextLine();

        String index = lsearch(numbers, food);
        if (index.equals("Food Not Found")) {
            System.out.println(index);
        } else {
            System.out.println("Index is " + index);
        }
    }
}

