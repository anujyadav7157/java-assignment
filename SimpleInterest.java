import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal :: ");
        double principal = input.nextDouble();

        System.out.print("Enter Annual Interest Rate :: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time in Years :: ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double finalAmount = principal + simpleInterest;

        System.out.println("\nYour Interest Amount is " + simpleInterest);
        System.out.println("Your Final Amount is " + finalAmount);

        input.close();
    }
}
