package practice.beginner.findingsquareroots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingSquareRootsTest {

    @Test
    void test() {
        String input = """
                3
                10
                5
                10000""";
        String expected = """
                3
                2
                100""";

        assertEquals(expected, new FindingSquareRoots().solution(input));
    }

}