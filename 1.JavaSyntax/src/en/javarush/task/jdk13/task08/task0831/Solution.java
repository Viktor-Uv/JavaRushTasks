package en.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        //write your code here
        BoardGame monopoly = new BoardGame();
        monopoly.name = "Monopoly";
        collection[1] = monopoly;

        BoardGame scrabble = new BoardGame();
        scrabble.name = "Scrabble";
        collection[2] = scrabble;

        BoardGame Checkers = new BoardGame();
        Checkers.name = "Checkers";
        collection[3] = Checkers;

        BoardGame Backgammon = new BoardGame();
        Backgammon.name = "Backgammon";
        collection[4] = Backgammon;

        System.out.println(Arrays.toString(collection));
    }
}
