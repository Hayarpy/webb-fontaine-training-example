package datatypes;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int arrayLength = 10;
        double[] array = new double[arrayLength];
        double sum = 0;
        System.out.println("Enter the elements:");

        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
         double arMean = sum /arrayLength;
        System.out.println("");
        System.out.println("Arithmetic mean of array elements is: "+arMean);
    }
}
