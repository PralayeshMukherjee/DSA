public class spacecomplexity1{
    public static int pairSumSequence(int n) {
        int total = 0;
        for(int i=0;i<=n;i++) {
            total += pairSum(i,i+1);
        }
        return total;
    }
    public static int pairSum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(pairSumSequence(3));
    }
}
// here the space complexity is O(1) because of same time in a data and out