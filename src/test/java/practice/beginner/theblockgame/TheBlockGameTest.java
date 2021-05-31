package practice.beginner.theblockgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheBlockGameTest {

    @Test
    void test() {
        String input = """
                4
                16
                331
                666
                232""";
        String expected = """
                loses
                loses
                wins
                wins""";
        assertEquals(expected, new TheBlockGame().solution(input));
    }

    @Test
    void test2() {
        String input = """
                5
                731137
                6667
                2332
                1
                22""";
        String expected = """
                wins
                loses
                wins
                wins
                wins""";
        assertEquals(expected, new TheBlockGame().solution(input));
    }

}