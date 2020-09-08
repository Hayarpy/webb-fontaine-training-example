package datatypes;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        float number = scanner.nextFloat();

        if(number == 0){
            System.out.println("Zero");
        } else if(number <= -1){
            System.out.println("Negative");
        } else if(number >= 1 && number <= 1000000){
            System.out.println("Positive");
        } else if(number < 1 && number > -1){
            System.out.println("small");
        } else if (number > 1000000){
            System.out.println("large");
        }
    }
}
