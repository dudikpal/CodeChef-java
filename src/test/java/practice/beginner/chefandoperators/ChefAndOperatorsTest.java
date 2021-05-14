package practice.beginner.chefandoperators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefAndOperatorsTest {

    @Test
    void test() {
        String input = """
                6
                10 20
                21 11
                12 12
                1 99
                99 1
                99 99""";
        String expected = """
                <
                >
                =
                <
                >
                =""";

        assertEquals(expected, new ChefAndOperators().solution(input));
    }

}