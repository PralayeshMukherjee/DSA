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
// the runtime complexity for the 1000000 is Big O(1) because the given number is constant
// it's a nested loop but the runtime complexity is not Big O(n^2) because there are 2 different arrays, let suppose the total numbers of element in the first array is n and the second array is m.
// So, the runtime complexity for the nested loop is Big O(n * m)
// So, the runtime complexity for the whole method is Big O(n*m).