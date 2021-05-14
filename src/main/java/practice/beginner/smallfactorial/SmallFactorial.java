package practice.beginner.smallfactorial;

import java.util.Scanner;

public class SmallFactorial {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int number = s.nextInt();
            long result = 1;
            // rekurzióval runtime error az oldalon
            /*sb.append(factorial(number) + "\n");*/
            for (int j = number; j > 0; j--) {
                result *= j;
            }
            sb.append(result + "\n");
        }


        return sb.toString().trim();
    }

    private long factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
