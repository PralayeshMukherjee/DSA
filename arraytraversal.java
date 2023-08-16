public class arraytraversal{
    
    int arr[] = null;

    public arraytraversal(int i) {
        arr = new int[i];
        for(int j=0;j<arr.length;j++) {
            arr[j] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int insertvalue) {
        try{
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = insertvalue;
                System.out.println("insert successfully");
            }else {
                System.out.println("space occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid input!");
        }
    }
    public void traverseArray() {
        try {
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
        }catch(Exception e) {
            System.out.println("array no longer exits");
        }
    }
    // runtime complexity is Big O(n).


}