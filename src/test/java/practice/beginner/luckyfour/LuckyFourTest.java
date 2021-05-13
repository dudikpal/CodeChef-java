package practice.beginner.luckyfour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckyFourTest {

    @Test
    void test() {
        String input = """
                5
                447474
                228
                6664
                40
                81""";
        String expected = """
                4
                0
                1
                1
                0""";
        assertEquals(expected, new LuckyFour().solution(input));

    }

}