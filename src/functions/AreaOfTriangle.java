package functions;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextInt();
        double side2 = scanner.nextInt();
        double side3 = scanner.nextInt();

        AreaOfTriangle triangle = new AreaOfTriangle();
        if(triangle.isTriangleValid(side1, side2, side3)) {
            double area = triangle.calculateArea(side1, side2, side3);
            System.out.println(area);
        } else {
            System.out.println("Not a triangle");
        }
    }

    private double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    private boolean isTriangleValid(double side1, double side2, double side3) {
        if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            return true;
        } else {
            return false;
        }
    }
}
