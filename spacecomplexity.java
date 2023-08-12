// example of O(n) space complexity
public class spacecomplexity{
    public static int sumNumbers(int n) {
        if(n<=0) {
            return 0;
        }
        return n + sumNumbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumNumbers(3));
    }
}
/*Basically it's a recursive function. Here the first number is 3 . So the 3 number stored in a stack and save it. After that repeat the function and n become 2. So the 2 number stored in the stack and save it.Than the function repeat again and n become 1. So the 1 number stored in the stack and save it. At last the function last time repeat and n become 0. At that time base condition satisfied and the function stopped. The space occupied for each element that's why the space complexity is Big O(n).*/