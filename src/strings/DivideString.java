package strings;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divideString(scanner);
    }

    static void divideString (Scanner scanner){
        System.out.println("Please enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        int eqParts;

        if(str.length() % n != 0){
            System.out.println("Invalid, can't divide");
            return;
        }
        eqParts = str.length() / n;
        for (int i = 0; i < str.length(); i++) {
            if (i % eqParts == 0)
                System.out.println();
            System.out.print(str.charAt(i));
        }
    }
}

