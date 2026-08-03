import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit + " °F");

        input.close();
    }
}