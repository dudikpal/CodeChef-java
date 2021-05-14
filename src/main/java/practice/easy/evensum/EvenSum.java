package practice.easy.evensum;

import java.util.Scanner;

public class EvenSum {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int arrayLength = s.nextInt();
            int sum = 0;
            for (int j = 0; j < arrayLength; j++) {
                sum += s.nextInt();
            }
            if (sum % 2 == 0) {
                sb.append("1\n");
            } else {
                sb.append("2\n");
            }
        }
        return sb.toString().trim();
    }
}
