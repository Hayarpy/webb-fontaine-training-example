package strings;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getKthCharacter(scanner);
    }

    static void getKthCharacter(Scanner scanner) {
        System.out.println("Please enter your message: ");
        String str = scanner.next();
        System.out.println("Please enter index of character: ");
        int k = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (i == k) {
                count++;
                System.out.print("Character at index "+k+ " is: ");
                System.out.println(str.charAt(i));
            }
        }
        if (count == 0) {
            System.out.println("Index is out of bounds");
        }
    }
}
