package practice.beginner.primalitytest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PrimalityTestTest {


    @ParameterizedTest
    @ValueSource(ints = {16, 20, 1000, 1})
    void testWithParams(int candidate) {

        assertTrue(new PrimalityTest().isNotPrimeWithBoolean(candidate));
    }

    @RepeatedTest(value = 3, name = "repeat {currentRepetition}/{totalRepetitions}")
    @Tag("primek")
    void test_not_primes() {
        String input = """
                    4
                    16
                    20
                    1000
                    1""";
        String expected = """                    
                    no
                    no
                    no
                    no""";

        assertEquals(expected, new PrimalityTest().solution(input));
    }

    @Test
    @DisplayName("Test primes")
    void testPrimes() {
        String input = """
                    13
                    23
                    13                    
                    99991
                    3
                    5
                    7
                    11
                    13
                    17
                    19
                    23
                    29
                    31""";
        String expected = """
                    yes
                    yes                    
                    yes
                    yes
                    yes
                    yes
                    yes
                    yes
                    yes
                    yes
                    yes
                    yes
                    yes""";

        assertEquals(expected, new PrimalityTest().solution(input));
    }

}