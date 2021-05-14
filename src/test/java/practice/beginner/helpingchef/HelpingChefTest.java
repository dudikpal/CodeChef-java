package practice.beginner.helpingchef;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpingChefTest {

    @Test
    void test() {
        String input = """
                3
                1
                12
                -5""";
        String expected = """
                Thanks for helping Chef!
                -1
                Thanks for helping Chef!""";

        assertEquals(expected, new HelpingChef().solution(input));
    }

}