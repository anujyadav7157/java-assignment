import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int first, int second) {

        first = Math.abs(first);
        second = Math.abs(second);
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }    public void Printgreateast() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.println("GCD = " + gcd(first, second));
        input.close();
    }
}