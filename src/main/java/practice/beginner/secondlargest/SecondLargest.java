package practice.beginner.secondlargest;

import java.util.Scanner;

public class SecondLargest {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] numbers = s.nextLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);
            if ((a < b && a > c) || (a > b && a < c)) {
                sb.append(a + "\n");
            } else if ((a < b && b < c) || (a > b) && (b > c)) {
                sb.append(b + "\n");
            } else {
                sb.append(c + "\n");
            }
        }
        return sb.toString().trim();
    }
}
