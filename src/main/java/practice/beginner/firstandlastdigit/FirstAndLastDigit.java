package practice.beginner.firstandlastdigit;

public class FirstAndLastDigit {

    public String solution(String input) {

        String[] inputs = input.split("\n");
        int repeat = Integer.parseInt(inputs[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < repeat + 1; i++) {
            int sum = Character.getNumericValue(inputs[i].charAt(0)) + Character.getNumericValue(inputs[i].charAt(inputs[i].length() - 1));
            sb.append(sum + "\n");
        }
        return sb.toString().trim();
    }
}
