import java.util.ArrayList;

public class AccessingElementInArrayList{
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> names = new ArrayList<String>();
        // insert all names
        names.add("raj");
        names.add("sarbojit");
        names.add("maharnab");
        names.add(2,"anjan");
        System.out.println(names);
        // Accessing Elements in ArrayList
        String nameAt3rdIndex = names.get(2);
        String nameAt4thIndex = names.get(3);
        System.out.println(nameAt3rdIndex);
        System.out.println(nameAt4thIndex);

    }
}