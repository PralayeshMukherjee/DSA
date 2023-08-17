import java.util.Arrays;

public class main3{
    public static void main(String[] args) {
        TwoDimensionArray array = new TwoDimensionArray(2, 2);
        array.insert(0, 1, 2);
        array.insert(1, 0, 3);
        array.insert(1, 1, 4);
        array.insert(3, 0, 7);
        array.insert(0, 3, 8);
        array.insert(4, 4, 6);

        System.out.println(Arrays.deepToString(array.arr));

    }
}