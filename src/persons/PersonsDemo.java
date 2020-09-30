package persons;

import java.util.Scanner;

public class PersonsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String company = scanner.next();
        System.out.println(DataProvider.getPersonsBy(company));
        System.out.println("Oldest person is: "+DataProvider.getOldestPerson());
        System.out.println("Youngst person is: "+DataProvider.getYoungestPerson());
        System.out.println(DataProvider.getMostRepeatedAge());
    }
}
