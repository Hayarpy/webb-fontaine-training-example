package datatypes;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n = scanner.nextInt();

        int array[] = new int[n];

        System.out.println("enter elements");

        for(int i = 0; i < n; i++){

            array[i] = scanner.nextInt();
        }

        for(int i = array.length; i > 0 ; i--){

            System.out.print(" "+i+" ");
        }
    }
}
