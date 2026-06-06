import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Enter source scale (1-3): ");
        int source = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter target scale (1-3): ");
        int target = sc.nextInt();

        double result = temp;

        if (source == 1) { // Celsius
            if (target == 2)
                result = (temp * 9 / 5) + 32;
            else if (target == 3)
                result = temp + 273.15;
        }
        else if (source == 2) { // Fahrenheit
            if (target == 1)
                result = (temp - 32) * 5 / 9;
            else if (target == 3)
                result = (temp - 32) * 5 / 9 + 273.15;
        }
        else if (source == 3) { // Kelvin
            if (target == 1)
                result = temp - 273.15;
            else if (target == 2)
                result = (temp - 273.15) * 9 / 5 + 32;
        }

        System.out.printf("Converted Temperature: %.2f%n", result);

        sc.close();
    }
}