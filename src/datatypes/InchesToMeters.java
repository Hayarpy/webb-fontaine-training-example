package datatypes;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number in inches:");
        double inch = scanner.nextDouble();

        double m = inch * 39.37;

        System.out.println(m);
    }
}
