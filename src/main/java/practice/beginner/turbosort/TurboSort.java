package practice.beginner.turbosort;

import java.util.*;

public class TurboSort {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        int lines = Integer.parseInt(s.nextLine());
        List<Integer> sortedResult = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            sortedResult.add(Integer.parseInt(s.nextLine()));
        }
        Collections.sort(sortedResult);
        StringBuilder sb = new StringBuilder();
        for (Integer number : sortedResult) {
            sb.append(number + "\n");
            System.out.println(number);
        }
        return sb.toString().trim();
    }
}
