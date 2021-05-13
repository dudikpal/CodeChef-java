package practice.beginner.theleadgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheLeadGameTest {

    @Test
    void test() {
        String input = """
                5
                140 82
                89 134
                90 110
                112 106
                88 90""";
        String expected = "1 58";

        assertEquals(expected, new TheLeadGame().solution(input));
    }

}