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
        // Traversal Of ArrayList
        // 1st way
        for(int i=0;i<names.size();i++) {
            String allNames = names.get(i);
            System.out.println(allNames);
        }
        // runtime complexity for the traversal using for loop is Big O(n)
        // space complexity for the traversal using for loop is Big O(1)

        // 2nd way
        for(String traversalNames: names) {
            System.out.println(traversalNames);
        }
        // runtime complexity for the 2nd way is Big O(n)
        // space complexity for the 2nd way is Big O(1)
    }
}