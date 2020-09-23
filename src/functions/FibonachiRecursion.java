package functions;

import java.util.Scanner;

public class FibonachiRecursion {


    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n +"th number of fibonachi is " +fibonachi(n));
    }

    static int fibonachi(int n)
    {
        if (n <= 1)
            return n;
        return fibonachi(n-1) + fibonachi(n-2);
    }

}
