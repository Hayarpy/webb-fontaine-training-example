package strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str = scanner.nextLine();
        char [] chars = str.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    int temp = j;
                    for (int k = temp; k < length - 1; k++) {
                        chars[k] = chars[k + 1];
                    }
                    j--;
                    length--;
                }
            }
        }
        String stringWithOutDuplicates = new String(chars);
        stringWithOutDuplicates = stringWithOutDuplicates.substring(0, length);
        System.out.println("String after duplicates removed : " +
                stringWithOutDuplicates);
    }
}



