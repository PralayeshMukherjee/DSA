import java.util.Arrays;

public class interviewQuestion6{
    public static void main(String[] args) {
        // Created a method which takes an array as a parameter and reverse it
        // Find the runtime complexity of the created method
        interviewQuestion6 arr = new interviewQuestion6();
        int[] customArray = {1,2,3,4,5};
        arr.rseserveArray(customArray);
    }
    void rseserveArray(int[] array) {
        for(int i=0;i<array.length/2;i++){
            int other = array.length-i-1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }
}
// time complexity for the for loop is Big O(n/2) and after droping the constant the runtime complexity is Big O(n)
// runtime complexity for the printing the reverse array is Big O(n).
// for the other statement the runtime complexity is Big O(1).
// The runtime complexity for the method is Big O(n).