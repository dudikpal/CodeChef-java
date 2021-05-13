package practice.beginner.firstandlastdigit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitTest {

    @Test
    void test() {
        String input = """
                3
                1234
                124894
                242323""";
        String expected = """
                5
                5
                5""";
        assertEquals(expected, new FirstAndLastDigit().solution(input));
    }

}