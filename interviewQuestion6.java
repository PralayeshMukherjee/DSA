public class interviewQuestion6{
    public static void main(String[] args) {
        // Created a method which takes an array as a parameter and reverse it
        // Find the runtime complexity of the created method
        interviewQuestion6 arr = new interviewQuestion6();
        int[] customArray = {1,2,3,4,5};
        arr.rseserveArray(customArray);
    }
    void rseserveArray(int[] array) {
        for(int i=array.length-1;i<=0;i--) {
            System.out.println(array);
        }
    }
}