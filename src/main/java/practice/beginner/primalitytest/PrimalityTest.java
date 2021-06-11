package practice.beginner.primalitytest;

import java.util.Scanner;

public class PrimalityTest {

    public String solution(String input) {
        Scanner scan = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = scan.nextInt();
        for (int i = 0; i < lines; i++) {
            sb.append(isPrime(scan.nextInt()))
                .append("\n");
            //scan.nextLine();
        }
        return sb.toString().trim();
    }

    private String isPrime(int number) {
        if (number == 1) {
            return "no";
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i != number) {
                return "no";
            }
        }
        return "yes";
    }

    public boolean isNotPrimeWithBoolean(int number) {
        if (number == 1) {
            return true;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i != number) {
                return true;
            }
        }
        return false;
    }
}
