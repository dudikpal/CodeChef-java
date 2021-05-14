package practice.beginner.cielandreceipt;

import java.util.Scanner;

public class CielAndReceipt {

    public String solution(String input) {
        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            int p = s.nextInt();
            int result = 0;
            for (int j = 11; j >=0 ; j--) {
                if ((int)(p / Math.pow(2, j)) > 0) {
                    result += (int)(p / Math.pow(2, j));
                }
                p = (int)(p % Math.pow(2, j));
            }
            sb.append(result + "\n");
        }
        return sb.toString().trim();
    }
}
