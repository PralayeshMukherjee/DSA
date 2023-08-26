import java.util.ArrayList;

public class InsertionInArrayList{
    public static void main(String[] args) {
        // ArrayList for an Integer
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3); // time & space complexity is Big O(1)
        numbers.add(2,4); // if I use this method to inserting an element then the specific element implement at the mention index of an ArrayList and the past element which was stand at the mention index, move to the right element box of an ArrayList.
        // time complexity for this add method is Big O(n) but the space complexity is Big O(1).
        System.out.println(numbers);
        // ArrayList for a String
        ArrayList<String> names = new ArrayList<String>();
        names.add("raj");
        names.add("sarbojit");
        names.add("maharnob");
        names.add("anjan");
        names.add("arpan");
        names.add(3,"shubham"); // same as 10 number line but I'm using this for a String
        System.out.println(names);
    }
}