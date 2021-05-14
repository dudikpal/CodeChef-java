package practice.beginner.chefandoperators;

import java.util.Scanner;

public class ChefAndOperators {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int number1 = s.nextInt();
            int number2 = s.nextInt();
            if (number1 < number2) {
                sb.append("<\n");
            } else if (number1 > number2) {
                sb.append(">\n");
            } else {
                sb.append("=\n");
            }
        }
        return sb.toString().trim();
    }
}
