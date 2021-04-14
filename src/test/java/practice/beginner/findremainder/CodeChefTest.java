package practice.beginner.findremainder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeChefTest {
    
    @Test
    void solution() {
        
        String input = "3\n" +
                         "1 2\n" +
                         "100 200\n" +
                         "40 15";
        
        String expected = "1\n" +
                              "100\n" +
                              "10";
        
        assertEquals(expected, new CodeChef().solution(input));
    }
}