package practice.beginner.packagingcupcakes;

import java.util.Scanner;

public class PackagingCupcakes {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int cakes = s.nextInt();
            sb.append(cakes / 2 + 1 + "\n");
        }
        return sb.toString().trim();
    }
}
