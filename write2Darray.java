import java.util.Arrays;

public class write2Darray{
    public static void main(String[] args) {
        int [][] int2DArray;
        // Step 2 - Instantiate
        int2DArray = new int[2][2];
        // Step 3 - Initialize 
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));
        // All together

        String sarr[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(sarr));
    }
}