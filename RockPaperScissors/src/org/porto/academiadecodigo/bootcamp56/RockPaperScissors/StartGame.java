package org.porto.academiadecodigo.bootcamp56.RockPaperScissors;

public class StartGame {

    public static void main (String[] args) {

        String name1 = "P1";
        String name2 = "P2";
        int maxWins = 3;

        Game newGame = new Game();
        newGame.start(name1, name2, maxWins);

    }
}
