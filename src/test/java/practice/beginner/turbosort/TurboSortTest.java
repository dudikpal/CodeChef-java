package practice.beginner.turbosort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurboSortTest {

    @Test
    public void test() {
        String input = """
                7
                5
                7
                7
                3
                1
                2
                9""";
        String expected = """
                1
                2
                3
                5
                7
                7
                9""";
        assertEquals(expected, new TurboSort().solution(input));
    }

}