import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Arithmetic Calculator");

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));

        if (b != 0) {
            System.out.println("Quotient = " + (a / b));
            System.out.println("Remainder = " + (a % b));
        } else {
            System.out.println("Division by zero is not possible.");
        }

        input.close();
    }
}
