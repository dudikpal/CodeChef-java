package practice.beginner.atm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeChefTest {
    
    @Test
    void testSuccessful() {
        
        String withdraw = "30";
        String amount = "120.00";
        
        assertEquals("89.50", CodeChef.solution(withdraw, amount));
    }
    
    @Test
    void testIncorrectWithdrawal() {
        
        String withdraw = "42";
        String amount = "120.00";
        
        assertEquals("120.00", CodeChef.solution(withdraw, amount));
    }
    
    @Test
    void testInsufficientFunds() {
        
        String withdraw = "300";
        String amount = "120.0";
        
        assertEquals("120.00", CodeChef.solution(withdraw, amount));
    }
    
    @Test
    void testInsufficientFunds2() {
        
        String withdraw = "120";
        String amount = "120.0";
        
        assertEquals("120.00", CodeChef.solution(withdraw, amount));
    }
}