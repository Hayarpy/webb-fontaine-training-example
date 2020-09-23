package functions;

import java.util.Scanner;

public class SumOfArguments {
    public static void main(String[] args) {
        int[] array =numbers();

        System.out.println("Sum of elements equals: "+calculateSum(array));

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

    private static int calculateSum(int... n)
    {
        int sum = 0;
        for(int i : n)
        {
            sum = sum + i;
        }
        return sum;
    }
}
