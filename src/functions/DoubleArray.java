package functions;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {

        int[] array =numbers();

        for (int value : array) {
            System.out.print(value * 2 + " ");
        }
    }

    public static int[] numbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Please enter elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
