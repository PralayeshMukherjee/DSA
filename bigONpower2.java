public class bigONpower2{
    public static void printNumbers(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.println(i+" "+j);
            }
        }
    }
    public static void main(String[] args) {
        printNumbers(10);
    }
}

// It is a nested loop. For the outer(i) loop the runtime complexity is Big O(n) and for the inner loop(j) the runtime complexity is Big O(n) so the total runtime complexity for the whole nested loop is Big O(n * n) => Big O(n^2) means it's have a Quadratic graph. But if you increase the numbers of inner loop like total 3 loops then the runtime complexity is Big O(n*n*n) => Big O(n^3).