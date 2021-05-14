package practice.easy.evensum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenSumTest {

    @Test
    void test() {
        String input = """
                3
                2
                1 2
                3
                1 1 2
                3
                1 2 4""";
        String expected = """
                2
                1
                2""";

        assertEquals(expected, new EvenSum().solution(input));
    }

}