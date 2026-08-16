import java.util.Scanner;
public class Menucalculator {
    static void printMenu() {
        System.out.println("--- MENU ---");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }
    static float calculate(int choice, float a, float b) {
        switch (choice) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }
    public void Calculator() {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            printMenu();

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice!");
                continue;
            }

            if (choice == 0) {
                System.out.println("Calculator exited.");
                break;
            }

            System.out.print("Enter first number: ");
            float a = input.nextFloat();

            System.out.print("Enter second number: ");
            float b = input.nextFloat();

            if (choice == 4 && b == 0) {
                System.out.println("Error: Cannot divide by zero!");
                continue;
            }

            double result = calculate(choice, a, b);

            System.out.println("Result = " + result);

        } while (choice != 0);

        input.close();
    }
}