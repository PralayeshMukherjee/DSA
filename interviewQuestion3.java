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

// There are 2 way to find out the runtime complexity for the given function

// 1st method:=> Counting the iterations
// 1st -> (n-1)
// 2nd -> (n-2)
// ..... 1
// so we can write, (n-1) + (n-2) + (n-3) + ... + 3 + 2 + 1
//  or, 1 + 2 + 3 + (n-3) + (n-2) + (n-1)
// or, n(n-1) / 2
// or, ((n^2) / 2) - (n / 2)
// after droping the constant, ((n^2) - n)
// or, (n^2) [because n^2 >> n]

// so, the runtime complexity for the given function is Big O(n^2).