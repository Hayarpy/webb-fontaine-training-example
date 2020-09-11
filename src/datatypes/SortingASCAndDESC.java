package datatypes;

public class SortingASCAndDESC {
    public static void main(String[] args) {

        int[] array;
        array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending  order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }

        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted in descending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }
    }
}