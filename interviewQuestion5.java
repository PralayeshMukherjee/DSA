public class interviewQuestion5{
    public static void main(String[] args) {
        // What is the runtime complexity of the below code?

        interviewQuestion5 arr = new interviewQuestion5();
        int[] customArray1 = {1,3,5,7};
        int[] customArray2 = {2,4,6,8};
        arr.printPairs(customArray1, customArray2);
    }
    void printPairs(int[] arrayA, int[] arrayB) {
        for(int i=0;i<arrayA.length;i++) {
            for(int j=0;j<arrayB.length;j++) {
                for(int k=0;k<1000000;k++) {
                    System.out.println(arrayA[i]+" , "+arrayB[j]);
                }
            }
        }
    }
}