package practice.easy.countingprettynumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingPrettyNumbersTest {

    @Test
    void test() {
        String input = """
                2
                1 10
                11 33""";
        String expected = """
                3
                8""";

        assertEquals(expected, new CountingPrettyNumbers().solution(input));
    }

}