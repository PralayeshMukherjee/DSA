import java.util.ArrayList;

public class TraversalOfArrayList{
    public static void main(String[] args) {
        // Create an ArrayList which type is String
        ArrayList<String> names = new ArrayList<String>();
        // Inserting an element in an ArrayList
        names.add("raj");
        names.add("maharnab");
        names.add("sarbojit");
        names.add(2,"anjan");
        System.out.println(names);
    }
}