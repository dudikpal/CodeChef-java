package practice.beginner.helpingchef;

import java.util.Scanner;

public class HelpingChef {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            if (s.nextInt() < 10) {
                sb.append("Thanks for helping Chef!\n");
            } else {
                sb.append("-1\n");
            }
        }
        return sb.toString().trim();
    }
}
