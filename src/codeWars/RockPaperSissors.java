package codeWars;

public class RockPaperSissors {

    public static String rps(String p1, String p2) {

        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        String result = "";

        // Checking if it is a draw:

        if(p1.equals(p2)) {
            result += "Draw!";
        }

        // Checking all scenarios for player 1 to win:

        if(p1.equals(rock) && p2.equals(scissors)) {
            result += "Player 1 won!";
        }

        if(p1.equals(scissors) && p2.equals(paper)) {
            result += "Player 1 won!";
        }

        if(p1.equals(paper) && p2.equals(rock)) {
            result += "Player 1 won!";
        }

        // Checking all scenarios for player 2 to win:

        if(p2.equals(rock) && p1.equals(scissors)) {
            result += "Player 2 won!";
        }

        if(p2.equals(scissors) && p1.equals(paper)) {
            result += "Player 2 won!";
        }

        if(p2.equals(paper) && p1.equals(rock)) {
            result += "Player 2 won!";
        }


        return result;
    }

}
