import java.util.Arrays;

public class creatingarray{
    public static void main(String[] args) {
        
        // 1st way to create a Array. There are 3 steps to create an array.

        int [] arr; // Declare Array
        arr = new int[3]; // Instantiation of an Array
        arr[0] = 1; // Initialization of an Array
        arr[1] = 2; // Initialization of an Array
        arr[2] = 3; // Initialization of an Array
        System.out.println(Arrays.toString(arr)); 
        
        // print Array. We cann't print array directly, at first we should import Arrays package and then we convert arrays to string and the print.
    }
}