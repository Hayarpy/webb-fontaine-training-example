package datatypes;

public class TwoDimensionalIntoOne {
    public static void main(String[] args) {
        int[][] array;
        array = new int[6][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+", ");
            }
        }
    }
}