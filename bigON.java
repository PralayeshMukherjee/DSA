public class bigON{
    public static void printNumbers(int n) {
        for(int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printNumbers(10);
    }
}
 
// Here for every elements we use operations. If we increase the number of element to n then the number of operations also increases by n means the Big O is linear.