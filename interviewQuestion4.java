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

// the runtime complexity for the if statement is Big O(1)
// it's a nested loop but the runtime complexity is not Big O(n^2) because there are 2 different arrays, let suppose the total numbers of element in the first array is n and the second array is m.
// So, the runtime complexity for the nested loop is Big O(n * m)
// So, the runtime complexity for the whole function is Big O(n*m).