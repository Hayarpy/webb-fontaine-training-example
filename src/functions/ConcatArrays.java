package functions;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[getFirstArraylength(scanner)];
        int[] array2 = new int[getSecondArraylength(scanner)];

        fillFirstArray(array1);
        fillSecondArray(array2);

        System.out.println(Arrays.toString(concatArray(array1, array2)));
        System.out.println(getArithmeticMean(array1, array2));
    }

    static int getFirstArraylength(Scanner scanner) {
        System.out.println("enter number of elements for first array");
        return scanner.nextInt();
    }

    static int getSecondArraylength(Scanner scanner) {
        System.out.println("enter number of elements for second array");
        return scanner.nextInt();
    }

    static void fillFirstArray(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
    }

    static void fillSecondArray(int[] array2) {

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
    }

    static  int [] concatArray(int [] array1, int [] array2){
        int length = array1.length + array2.length;
        int[] concatArray = new int[length];
        int j = 0;
        for (int value : array1) {
            concatArray[j] = value;
            j++;
        }
        for (int value : array2) {
            concatArray[j] = value;
            j++;
        }
        return concatArray;
    }

    static double getArithmeticMean(int [] array1, int [] array2){
        double ar;
        double ar1;
        double ar2;
        double sum1 = 0;
        double sum2 = 0;

        for (int value : array1) {
            sum1 += value;
        }
        ar1 = sum1 / array1.length;

        for (int value : array2) {
            sum2 += value;
        }
        ar2 = sum2 / array2.length;
        ar = ar1 + ar2;

        return ar;
    }
}


