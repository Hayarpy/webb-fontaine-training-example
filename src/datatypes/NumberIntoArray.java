package datatypes;

import java.util.Scanner;

public class NumberIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 digits number: ");

        int number = scanner.nextInt();

       int arr1 = number / 100;
       int arr2 = (number / 10) % 10;
       int arr3 = number % 10;

       System.out.println("[ "+arr1+", "+arr2+", "+arr3+" ]");
    }
}
