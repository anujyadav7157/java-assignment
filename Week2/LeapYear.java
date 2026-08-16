import java.util.Scanner;

public class LeapYear {
    public void IsLeapYear()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = sc.nextInt();

        if (year%400==0 || year%4==0 && year%100!=0 ) {
            System.out.println("leap year"); 
        } 
        else{
            System.out.println("not a leap year");
        }
    sc.close();
    }
}
