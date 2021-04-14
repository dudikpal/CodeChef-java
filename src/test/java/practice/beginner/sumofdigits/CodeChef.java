package practice.beginner.sumofdigits;

class CodeChef {
    
     String solution(String input) {
        
        String[] lines = input.split("\n");
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i < lines.length; i++) {
            sb.append(separator);
            sb.append(sumOfDigits(lines[i]));
            separator = "\n";
        }
        return sb.toString();
    }
    
     String sumOfDigits(String digits) {
        int sum = 0;
        for (char digit : digits.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return String.valueOf(sum);
    }
}
