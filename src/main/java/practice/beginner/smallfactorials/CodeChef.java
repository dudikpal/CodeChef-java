package practice.beginner.smallfactorials;

import java.math.BigInteger;

class CodeChef {
    
    String solution(String input) {
        
        String[] lines = input.split("\n");
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i < lines.length; i++) {
            sb.append(separator);
            sb.append(factorial(Integer.parseInt(lines[i])));
            separator = "\n";
        }
        return sb.toString();
    }
    
    private String factorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact.toString();
    }
    
}