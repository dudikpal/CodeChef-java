package practice.beginner.chefandremissness;

import java.util.Scanner;

public class ChefAndRemissness {
    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int guard1 = s.nextInt();
            int guard2 = s.nextInt();
            sb.append(Math.max(guard1, guard2) + " ");
            sb.append(guard1 + guard2 + "\n");
        }
        return sb.toString().trim();
    }
}
