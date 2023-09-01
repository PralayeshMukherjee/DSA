public class interviewQuestion3{
    public static void main(String[] args) {
        // What is the runtime complexity for the given method
        interviewQuestion3 arr = new interviewQuestion3();
        int [] customArray = {1,3,5,7};
        arr.printPairs(customArray);
    }

    void printPairs(int [] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                System.out.println(array[i]+" , "+array[j]);
            }
        }
    }
}