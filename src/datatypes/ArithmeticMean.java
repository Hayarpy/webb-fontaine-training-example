package datatypes;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        double sum = 0;
        System.out.println("Enter the elements:");

        for (int i = 0; i < 10; i++)
        {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
         double arMean = sum /10;
        System.out.println("");
        System.out.println("Arithmetic mean of array elements is: "+arMean);
    }
}
