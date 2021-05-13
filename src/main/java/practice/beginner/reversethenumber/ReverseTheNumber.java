package practice.beginner.reversethenumber;

import java.util.Scanner;

public class ReverseTheNumber {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            StringBuilder reversor = new StringBuilder();
            reversor.append(s.nextLine());
            int reversedNumber = Integer.parseInt(reversor.reverse().toString());
            sb.append(reversedNumber + "\n");
        }
        return sb.toString().trim();
    }
}
