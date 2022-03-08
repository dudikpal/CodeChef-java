package practice.beginner.instnoodle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChefAndInstantNoodles {

    public static int solution(String line) {

        Pattern firstNumberRegex = Pattern.compile("^\\d+");
        Pattern secondNumberRegex = Pattern.compile("\\d+$");

        Matcher firstNumber = firstNumberRegex.matcher(line);
        Matcher secondNumber = secondNumberRegex.matcher(line);

        firstNumber.find();
        secondNumber.find();

        return Integer.parseInt(firstNumber.group()) * Integer.parseInt(secondNumber.group());
    }

    public static void main(String[] args) {
        solution("3 5");
    }
}
