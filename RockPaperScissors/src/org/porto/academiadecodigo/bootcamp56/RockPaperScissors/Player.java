package org.porto.academiadecodigo.bootcamp56.RockPaperScissors;

public class Player {
    public String name;
    public HandType hand;

    public Player (String name) {
        this.name = name;
    }

    public HandType getHand () {

        int num = Random.getRandomNum();

        switch (num) {

            case 0:
                hand = HandType.ROCK;
            break;

            case 1:
                hand = HandType.PAPER;
            break;

            case 2:
                hand = HandType.SCISSORS;
            break;

        }


        return hand;
    }

}
