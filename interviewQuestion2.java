public class interviewQuestion2{
    public static void main(String[] args) {
        // Create a function which prints to the console the pairs from given array.
        // Finds the time complexity for the created method.

        interviewQuestion2 arr = new interviewQuestion2();
        int [] customArray = {1,3,5,7};
        arr.printPairs(customArray);
    }
    void printPairs(int [] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length;j++) {
                System.out.println(array[i] + " , " + array[j]);
            }
        }
    }

    // The runtime complexity for the function is Big O(n^2).
} 