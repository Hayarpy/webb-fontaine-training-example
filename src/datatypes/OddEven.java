package datatypes;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a numbers:");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("bye!");
    }
}
