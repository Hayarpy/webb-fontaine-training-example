package datatypes;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of elements for array: ");

        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("enter elements for array: ");

        for(int i = 0; i < n; i++){

            array[i] = scanner.nextInt();
        }


        System.out.println("enter index of element to be deleted: ");

        int index = scanner.nextInt();

        for(int i = 0; i < array.length; i++){
            if(i == index){
                continue;
            }
            System.out.print(array[i]+" ");
        }
    }
}
