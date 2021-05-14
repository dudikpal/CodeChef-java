package practice.beginner.validtriangles;

import java.util.Scanner;

public class ValidTriangles {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            sb.append(a + b + c == 180 ? "YES" : "NO")
                            .append("\n");

        }
        return sb.toString().trim();
    }
}
