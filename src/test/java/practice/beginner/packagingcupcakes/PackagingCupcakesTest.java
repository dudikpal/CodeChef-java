package practice.beginner.packagingcupcakes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagingCupcakesTest {

    @Test
    void test() {
        String input = """
                2
                2
                5""";
        String expected = """
                2
                3""";

        assertEquals(expected, new PackagingCupcakes().solution(input));
    }

}