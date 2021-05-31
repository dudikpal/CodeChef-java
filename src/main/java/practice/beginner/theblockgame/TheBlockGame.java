package practice.beginner.theblockgame;

import java.util.Scanner;

public class TheBlockGame {

    public String solution(String input) {


        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());

        for (int i = 0; i < lines; i++) {
            String number = s.nextLine();
            if (number == null || number.length() == 0) {
                sb.append("loses\n");
                continue;
            }
            if (number.length() == 1) {
                sb.append("wins\n");
                continue;
            }
            for (int j = 0; j < number.length() / 2; j++) {
                if (number.charAt(j) != number.charAt(number.length() - j - 1)) {
                    sb.append("loses\n");
                    break;
                }
                if (j == number.length() / 2 - 1) {
                    sb.append("wins\n");
                }
            }
        }
        System.out.println(sb.toString().trim());
        return sb.toString().trim();
    }
}
