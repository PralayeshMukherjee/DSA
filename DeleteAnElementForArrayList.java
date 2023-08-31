import java.util.ArrayList;

public class DeleteAnElementForArrayList{
    public static void main(String[] args) {
        // Creating an ArrayList 
        ArrayList<String> names = new ArrayList<String>();
        names.add("raj");
        names.add("sarbojit");
        names.add("maharnob");
        names.add("anjan");
        names.add("arpan");
        System.out.println(names);
        // delete an element for ArrayList
        names.remove("maharnob"); // After deleting the element("maharnob"), the others elements after 'maharnob'element all elements shifts to left by 1.
        System.out.println(names);
    }

    // The runtime complexity is Big O(n)
    // The space complexity is Big O(1)
}