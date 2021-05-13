package practice.beginner.findingsquareroots;

import java.util.Scanner;

public class FindingSquareRoots {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            sb.append((int)Math.sqrt(Integer.parseInt(s.nextLine())) + "\n");
        }
        return sb.toString().trim();
    }
}
