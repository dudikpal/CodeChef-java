package practice.beginner.mahasena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MahasenaTest {

    @Test
    void test() {
        String input = """
                4
                11 12 13 14""";
        String expected = """
                NOT READY""";

        assertEquals(expected, new Mahasena().solution(input));
    }

}