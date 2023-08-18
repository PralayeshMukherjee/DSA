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
            System.out.println("Invalid Index!");
        }
    }
    // runtime complexity is Big O(1).    


    // Access an element of Two Dimension Array
    public void accessArray(int row, int col) {
        System.out.println("\nAccessing Row#"+row+", Col#"+col);
        try{
            System.out.println("Cell value is "+arr[row][col]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
    }

    // Traverse Two Dimension Array
    public void traverseArray() {
        System.out.println("\n"); 
        try{
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr[0].length;j++) {
                    System.out.println(arr[i][j]+" ");
                }
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
    }
    // runtime complexity is Big O(nm), [Where n stands for Row and m stands for Column].

    // Searching Two Dimension Array
    public void srarchArray(int value) {
        try{
            System.out.println("\n");
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr[0].length;j++) {
                    if(arr[i][j]==value) {
                        System.out.println("Value is found at Row: "+i+" Column: "+j);
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
    }
    
}