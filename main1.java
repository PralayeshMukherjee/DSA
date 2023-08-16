public class main1 {
    public static void main(String[] args) {
        insertioninarray arr = new insertioninarray(10);
        arr.insert(0, 10);
        arr.insert(1, 20);
        arr.insert(2, 30);
        arr.insert(10, 5);

        arr.searchArray(20);

        arr.deleteValue(0);
        System.out.println(arr.arr[0]);
    }
}
