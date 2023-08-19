import java.util.Scanner;
public class calAvgtempwithoutarray{
    public static void main(String[] args) {
        //  Qs) Find Number of Days Above Average Temprature 
        
        //  Input statement 1 :- How many day's temprature? - 2
        //  Input statement 2 :- Day 1's high temp: 10
        //  Input statement 3 :- Day 2's high temp: 20
        
        //  Output :- Average = 15.0
        //    1 day's above average 
        
        
        // Write the answer without adding an array
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's tempratures? =>");
        int numberOfDays = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=numberOfDays;i++) {
            System.out.println("Day "+i+"'s high temp: ");
            int next = sc.nextInt();
            sum += next;
        }
        double average = sum / numberOfDays;
        System.out.println("Average Temprature = "+average);
        sc.close();
    }
}