import java.util.Scanner;

public class CalAvgTempUsingArray{
    public static void main(String[] args) {
        //  Qs) Find Number of Days Above Average Temperature 
        
        //  Input statement 1 :- How many day's temperature? - 2
        //  Input statement 2 :- Day 1's high temperature: 10
        //  Input statement 3 :- Day 2's high temperature: 20
        
        //  Output :- Average = 15.0
        //    1 day's above average temperature
        
        
        // Write the answer without adding an array
        
        Scanner sc = new Scanner(s);
        System.out.println("How many day's tempratures? ");
        int numberOfDays = sc.nextInt();
        int temps[] = new int[numberOfDays];
        // record temperature and find average
        int sum = 0;
        for(int i=0;i<numberOfDays;i++) {
            System.out.println("Day "+(i+1)+"'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }

        double average = sum / numberOfDays;
        System.out.println("Average Temperature: "+average);

        // count days above average 
        int above = 0;
        for(int i=0;i<temps.length;i++) {
            if(temps[i]>average) {
                above++;
                System.out.println(above+" day's above average!");
            }
        }
        sc.close();
    }
}