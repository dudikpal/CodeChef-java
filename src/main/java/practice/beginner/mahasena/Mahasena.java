package practice.beginner.mahasena;

import java.util.Scanner;

public class Mahasena {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < lines; i++) {
            if (s.nextInt() % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        if (evenCounter > oddCounter) {
            sb.append("READY FOR BATTLE");
        } else {
            sb.append("NOT READY");
        }
        return sb.toString().trim();
    }
}
