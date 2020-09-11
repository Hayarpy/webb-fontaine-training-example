package datatypes;

import java.util.Scanner;

public class RepeatMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number: ");

        if (scanner.hasNextInt()) {
            int number = 0;
            while (number != -1) {
                number = scanner.nextInt();
                for (int i = 0; i < number; i++) {
                    System.out.println("Hello World!");
                }
            }
        }
    }
}
