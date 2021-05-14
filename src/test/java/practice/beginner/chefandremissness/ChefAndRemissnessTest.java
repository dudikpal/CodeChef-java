package practice.beginner.chefandremissness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefAndRemissnessTest {

    @Test
    void test() {
        String input = """
                1
                19 17""";
        String expected = """
                19 36""";

        assertEquals(expected, new ChefAndRemissness().solution(input));
    }

}