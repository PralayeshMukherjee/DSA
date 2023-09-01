public class interviewQuestion4{
    public static void main(String[] args) {
        // What is the runtime complexity for the below code?

        interviewQuestion4 arr = new interviewQuestion4();
        int [] customArray1 = {1,3,5,7};
        int [] customArray2 = {2,4,6,8};
        arr.printUnorderedPairs(customArray1, customArray2);
    }

    void printUnorderedPairs(int [] arrayA, int[] arrayB) {
        for(int i=0;i<arrayA.length;i++) {
            for(int j=0;j<arrayB.length;j++) {
                if(arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + " , " + arrayB[j]);
                }
            }
        }
    }
}