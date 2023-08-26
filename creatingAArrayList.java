import java.util.ArrayList;
import java.util.Arrays;

public class creatingAArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(allNumbers);
    }
}

// If this is default than the runtime complexity is Big O(1)
// and the space time complexity is also Big O(1)

// but if we define it like here or inserting elements then the runtime complexity is Big O(1) but the space time complexity is O(n).