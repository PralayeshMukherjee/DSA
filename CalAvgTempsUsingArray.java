import java.util.Scanner;

public class CalAvgTempsUsingArray{
    public static void main(String[] args) {
        // Find Number of Days Above Average Temperature
        // Input Statement 1 :- How many day's temperature? =>
        // Input Statement 2 :- Day 1's high temperature: 10
        // Input Statement 3 :- Day 2's high temperature: 20

        // Output Statement 1 :- Average = 15.0
        // Output Statement 2 :- 1 day's above average.
        
        // Ans:
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperature? =>");
        int numberOfDays = sc.nextInt();
        int [] temperature = new int[numberOfDays];
        int sum = 0;
        for(int i=0;i<numberOfDays;i++) {
            System.out.println("Day "+(i+1)+"'s high temperature: ");
            temperature[i] = sc.nextInt();
            sum += temperature[i];
        }
        
        double average = sum / numberOfDays;
        System.out.println("Average Temperature: "+average);

        int above = 0;
        for(int i=0;i<temperature.length;i++) {
            if(temperature[i] > average) {
                above++;
                System.out.println(above+" day's above average!");
            }
        }
        sc.close();
    }
}