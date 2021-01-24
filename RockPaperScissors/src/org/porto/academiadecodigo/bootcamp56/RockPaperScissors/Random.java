package org.porto.academiadecodigo.bootcamp56.RockPaperScissors;

public class Random {

    public static int getRandomNum() {

        int randomNum = (int) ((Math.random()*3));
        return randomNum;
    }
}
