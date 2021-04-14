package practice.beginner.atm;

import java.util.Locale;

class CodeChef {
    
    private static final double fee = 0.5;

    static String solution(String withdrawStr, String amountStr) {
        Locale.setDefault(Locale.US);
        int withdraw = Integer.parseInt(withdrawStr);
        double amount = Double.parseDouble(amountStr);
        if (withdraw % 5 != 0 || withdraw + 0.5 > amount) {
            return String.format("%.2f", amount);
        }
        
        return String.format("%.2f", amount - withdraw - fee);
    }
}
