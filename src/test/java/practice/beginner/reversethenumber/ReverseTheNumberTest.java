package practice.beginner.reversethenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTheNumberTest {

    @Test
    void test() {
        String input = """
                4
                12345
                31203
                2123
                2300""";
        String expected = """
                54321
                30213
                3212
                32""";
        assertEquals(expected, new ReverseTheNumber().solution(input));

    }

}