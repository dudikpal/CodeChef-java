package practice.beginner.smallfactorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallFactorialTest {

    @Test
    void test() {
        String input = """
                3
                3
                4
                20""";
        String expected = """
                6
                24
                2432902008176640000""";

        assertEquals(expected, new SmallFactorial().solution(input));
    }

}