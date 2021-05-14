package practice.easy.countingprettynumbers;

import java.util.Scanner;

public class CountingPrettyNumbers {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int from = s.nextInt();
            int to = s.nextInt();
            int counter = 0;
            for (int j = from; j <= to; j++) {
                if (j % 10 == 2
                || j % 10 == 3
                || j % 10 == 9) {
                    counter++;
                }
            }
            sb.append(counter + "\n");
        }
        return sb.toString().trim();
    }
}
