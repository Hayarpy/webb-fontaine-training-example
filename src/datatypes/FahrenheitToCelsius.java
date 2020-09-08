package datatypes;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a degree in Fahrenheit:");
        double far = scanner.nextDouble();

        double celsius = (far - 32) * 5/9;

        System.out.println(celsius);
    }
}
