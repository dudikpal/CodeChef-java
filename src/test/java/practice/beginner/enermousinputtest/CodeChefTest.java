package practice.beginner.enermousinputtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeChefTest {
    
    @Test
    void solution() {
        
        String input = "7 3\n" +
                           "1\n" +
                           "51\n" +
                           "966369\n" +
                           "7\n" +
                           "9\n" +
                           "999996\n" +
                           "11";
        
        int expected = 4;
        
        assertEquals(expected, CodeChef.solution(input));
    }
}