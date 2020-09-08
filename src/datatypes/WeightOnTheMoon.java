package datatypes;

import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight:");
        double weight = scanner.nextDouble();

        double wom = weight * 0.17;
        System.out.println(wom);
    }
}
