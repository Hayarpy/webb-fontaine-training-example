package datatypes;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers and Math operation:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        char symbol = scanner.next().charAt(0);

        double result;

        switch(symbol)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Error! operator is not correct");
                return;
        }

        if(num2 == 0 && symbol == '/'){
            System.out.println("Operation not possible");
        } else {
            System.out.println(num1+" "+symbol+" "+num2+" = "+result);
        }
    }
}
