import java.util.ArrayList;

public class SearchForAnElementInArrayList{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> names = new ArrayList<String>();
        names.add("raj");
        names.add("sarbojit");
        names.add("maharnob");
        names.add("anjan");
        names.add("arpan");
        System.out.println(names);

        // way to search an element in an ArrayList
        // 1st way
        for(String SearchElement: names) {
            if(SearchElement.equals("arpan")) {
                System.out.println("The element is found");
                break;
            }
        }
        // 2nd way
        int index = names.indexOf("anjan");
        System.out.println("The element is found at index: "+index);
        
        // 3rd
        String thename = "maharnob";
        for(int i=0;i<names.size();i++) {
            if(thename==names.get(i)) {
                System.out.println("The element is found at index: "+i);
            }
        }
    }

    // The runtime complexity is Big O(n)
    // The space complexity is Big O(1)
}