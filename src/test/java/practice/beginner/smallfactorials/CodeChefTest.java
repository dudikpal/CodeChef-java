package practice.beginner.smallfactorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeChefTest {
    
    @Test
    void solution() {
        
        String input = "6\n" +
                           "1\n" +
                           "2\n" +
                           "5\n" +
                           "3\n" +
                           "100\n" +
                            "0";
        
        String expected = "1\n" +
                              "2\n" +
                              "120\n" +
                              "6\n" +
                              "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000\n" +
                                "1";
        
        assertEquals(expected, new CodeChef().solution(input));
    }
}