package datatypes;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of elements for two arrays");

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;

        int[] array1 = new int[n];
        int[] array2 = new int[m];

        System.out.println("enter elements for first array");

        for(int i = 0; i < n; i++){

            array1[i] = scanner.nextInt();
        }

        System.out.println("enter elements for second array");

        for(int i = 0; i < m; i++){

            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            int j;

            for (j = 0; j < m; j++)
                if (array1[i] == array2[j])
                    break;
                if (j == m){
                    System.out.println(array1[i]);
                    count++;
                }
        }
        if(count == 0) {
            System.out.println("there are no unique elements in first array");
        }
    }
}

