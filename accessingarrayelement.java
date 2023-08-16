import java.util.Arrays;

public class accessingarrayelement{
    public static void main(String[] args) {
        // time complexity is Big O(1)
        String arr[] = {"a","b","c"};
        var firstElement = arr[0];
        System.out.println(firstElement);
        var secondElement = arr[1];
        System.out.println(secondElement);
        

        // this index is out of the boundary so it's shows exception
        var invalidelement = arr[3];
        System.out.println(invalidelement);
    }
}