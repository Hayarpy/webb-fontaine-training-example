package strings;

import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (isPalindrome(str))
            System.out.print("Is Palindrome");
        else
            System.out.print("Is Not Palindrome");

    }

    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
