package practice.beginner.theleadgame;

import java.util.*;

public class TheLeadGame {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        int lines = Integer.parseInt(s.nextLine());
        int player1Score = 0;
        int player2Score = 0;
        int biggestDifference = 0;
        int winner = 0;
        for (int i = 0; i < lines; i++) {
            String[] scores = s.nextLine().split(" ");
            player1Score += Integer.parseInt(scores[0]);
            player2Score += Integer.parseInt(scores[1]);
            int actualDifference;
            if ((actualDifference = Math.abs(player1Score - player2Score)) > biggestDifference) {
                biggestDifference = actualDifference;
                if (player1Score > player2Score) {
                    winner = 1;
                } else {
                    winner = 2;
                }
            }
        }
        return winner + " " + biggestDifference;
    }
}
