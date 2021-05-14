package practice.beginner.cielandreceipt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CielAndReceiptTest {

    @Test
    void test() {
        String input = """
                4
                10
                256
                255
                4096""";
        String expected = """
                2
                1
                8
                2""";

        assertEquals(expected, new CielAndReceipt().solution(input));
    }

}