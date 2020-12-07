package strings;

import java.util.Scanner;

public class SpecifiedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findSequence(scanner);

    }

    static void findSequence(Scanner scanner){
        System.out.println("Please enter a sentence: ");
        String str = scanner.nextLine();
        System.out.println("Please enter a word you want to check: ");
        String word = scanner.nextLine();
        System.out.println(str.contains(word));
    }
}
