public class TwoDimensionArray{
    
    int arr [][] = null;
    
    // constructor
    public TwoDimensionArray(int numberOfRows, int numberOfColumn) {
        this.arr = new int[numberOfRows][numberOfColumn];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the 2D Array
    public void insert(int rowLocation, int colLocation, int value) {
        try{
            if(arr[rowLocation][colLocation]==Integer.MIN_VALUE) {
                arr[rowLocation][colLocation] = value;
                System.out.println("Successfully Inserted!");
            }else{
                System.out.println("Space Occupied!");
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }
    
}