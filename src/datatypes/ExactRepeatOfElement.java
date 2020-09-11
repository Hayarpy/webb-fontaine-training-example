package datatypes;

import java.util.Scanner;

public class ExactRepeatOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of elements for array: ");

        int n = scanner.nextInt();

        System.out.println("enter number K: ");

        int k = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("enter elements for array: ");

        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {

                int count = 1;
                for (int j = i + 1; j < n; j++)
                    if (array[i] == array[j])
                        count += 1;

                    if (k == count){
                        System.out.println("This number is occuring exactly "+k+" times: "+array[i]);
                    }
            }
        }
    }
}