package practice.beginner.enermousinputtest;

class CodeChef {
    
    static int solution(String input) {
        String[] lines = input.split("\n");
        int divisor = Integer.parseInt(lines[0].split("\\s")[1]);
        int counter = 0;
        for (int i = 1; i < lines.length; i++) {
            if (Integer.parseInt(lines[i]) % divisor == 0) {
                counter++;
            }
        }
        return counter;
    }
}
