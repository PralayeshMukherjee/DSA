import java.util.ArrayList;
import java.util.Arrays;

public class creatingAArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(allNumbers);
    }
}