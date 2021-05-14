package practice.beginner.validtriangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTrianglesTest {

    @Test
    void test() {
        String input = """
                3
                40 40 100
                45 45 90
                180 1 1""";
        String expected = """
                YES
                YES
                NO""";

        assertEquals(expected, new ValidTriangles().solution(input));
    }

}