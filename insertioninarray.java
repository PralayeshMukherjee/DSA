public class insertioninarray{

    int arr[] = null;
    
    public insertioninarray(int i) {
        arr = new int[i];
        for(int j=0;j<arr.length;j++) {
            arr[j] = Integer.MIN_VALUE;
        }
	}
    public void insert(int location, int valueofInsert) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueofInsert;
                System.out.println("successfully inserted");
            } else {
                System.out.println("this cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }
    // runtime complexity is Big O(1). 
    
}