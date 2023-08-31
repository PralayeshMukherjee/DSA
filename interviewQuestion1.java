public class interviewQuestion1{
    public static void main(String[] args) {
        // Q1> Create a function which calculates the sum and product of elements of Array
        // Q2> Find the complexity for created method

        // Answer:-
        interviewQuestion1 arr = new interviewQuestion1();
        int [] customArray = {1,3,5,7};
        arr.spofArray(customArray);

    }

    void spofArray(int [] array) {
        int sum = 0;
        int product = 1;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
        }
        for (int i=0;i<array.length;i++) {
            product *= array[i];
        }
        System.out.println(sum+" , "+product);
    }
}

// The runtime complexity for this funtion is Big O(n).