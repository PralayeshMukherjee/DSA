import java.util.ArrayList;

public class AccessingElementInArrayList{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("raj");
        names.add("sarbojit");
        names.add("maharnab");
        names.add(2,"anjan");
        System.out.println(names);
    }
}