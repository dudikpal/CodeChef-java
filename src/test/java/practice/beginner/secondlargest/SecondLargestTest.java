package practice.beginner.secondlargest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    @Test
    void test() {
        String input = """
                3
                120 11 400
                10213 312 10
                10 3 450""";
        String expected = """
                120
                312
                10""";

        assertEquals(expected, new SecondLargest().solution(input));
    }

}