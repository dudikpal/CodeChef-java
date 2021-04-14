package practice.beginner.sumofdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeChefTest {
    
    @Test
    void solution() {
        
        String input = "3 \n" +
                           "12345\n" +
                           "31203\n" +
                           "2123";
        
        String expected = "15\n" +
                              "9\n" +
                              "8";
        
        assertEquals(expected, new CodeChef().solution(input));
    }
}