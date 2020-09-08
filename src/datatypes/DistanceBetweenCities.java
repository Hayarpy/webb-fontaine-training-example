package datatypes;

import java.util.Scanner;

public class DistanceBetweenCities {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter coordinates of two cities:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println(distance);
    }
}
