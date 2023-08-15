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

        // 2nd way to create a Array. 3 steps together.

        // 3rd way to create a Array. Declare and Instantiation combination.

        String [] arrayNew = {"a", "b", "c"};
        System.out.println(Arrays.toString(arrayNew));

        String [] arrayanother = new String[3];
        arrayanother[0] = "rice";
        arrayanother[1] = "chiken";
        arrayanother[2] = "egg";
        System.out.println(Arrays.toString(arrayanother));

    }
}