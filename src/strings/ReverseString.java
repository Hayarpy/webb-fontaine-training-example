package strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("The reversed string is: " + reverseString(str));
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}


