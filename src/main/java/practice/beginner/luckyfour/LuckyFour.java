package practice.beginner.luckyfour;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LuckyFour {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            Pattern p = Pattern.compile("(?=(4))");
            Matcher m = p.matcher(s.nextLine());
            int counter = 0;
            while (m.find()) {
                counter++;
            }
            sb.append(counter + "\n");
        }
        return sb.toString().trim();
    }
}
