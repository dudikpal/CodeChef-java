package practice.beginner.findremainder;

class CodeChef {
    
    String solution(String input) {
    
        String[] lines = input.split("\n");
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i < lines.length; i++) {
            sb.append(separator);
            sb.append(remainder(lines[i]));
            separator = "\n";
        }
        return sb.toString();
    }
    
    private String remainder(String line) {
        String[] numbers = line.split("\\s");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        return String.valueOf(a % b);
    }
    
}
