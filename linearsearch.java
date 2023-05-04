import java.util.*;

public class linearsearch {
    public static int lsearch(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }
        

        }
        return -1;
    }


    



    public static void main(String args[]){
        int numbers[]={1,55,66,77,88,99,1000,10,25,68,69};
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a key to be search");
        int key=s.nextInt();
        //int key=68;
        int index=lsearch(numbers, key);
        if (index==-1){
            System.out.println("Index Not found");
        }
        else{
            System.out.println("Index is "+index);
        }

    }

}




