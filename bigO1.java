public class bigO1{
    public static int multiplyNumbers(int n) {
        int work = (n*n);
        return work;
    }
    public static void main(String[] args) {
        System.out.println(multiplyNumbers(3));
    }
}

// if I change the value of n then nothing will be change in the time or space complexity. Through out the work the Big O is remain same means constant.