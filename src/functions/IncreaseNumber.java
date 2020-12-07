package functions;

import java.util.Scanner;

public class IncreaseNumber {
    public static void main(String[] args) {

        double[] array =increaseNumberOfArray();
        for (int i = 0; i < array.length; i++){
            System.out.print(" "+array[i]+" ");
        }
    }
    public static double[] increaseNumberOfArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Please enter elements: ");
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextDouble();
        }
        System.out.println("Please enter index you want to increase");
        int index = scanner.nextInt();

        arr[index] = arr[index] * 110 / 100;
        return arr;
    }
}
