package strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getNumberOfWords(scanner);
    }

   static void getNumberOfWords(Scanner scanner) {
       System.out.println("Please enter sentence: ");
       String str = scanner.nextLine();
       int count = 0;
       for(int i = 0; i < str.length(); i++){
           if (str.charAt(i) == ' '){
               count++;
           }
       }
       System.out.print("Number of words in your sencetce is: ");
       System.out.println(count + 1);
   }
}
