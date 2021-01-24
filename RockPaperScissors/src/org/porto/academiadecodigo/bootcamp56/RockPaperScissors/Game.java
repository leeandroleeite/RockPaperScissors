package org.porto.academiadecodigo.bootcamp56.RockPaperScissors;

public class Game {



// PROPERTIES

    public String name1;
    public String name2;

    public HandType hand1;
    public HandType hand2;

    public int wins1;
    public int wins2;

    public int maxWins;


    public String result; // Resultado da ronda. Ex: ROCKROCK
    public int totalRounds; // numero total de rondas


//METHODS
    public void start(String name1, String name2, int maxWins) {

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);


        while (wins1 < maxWins && wins2 < maxWins) {

            hand1 = player1.getHand();
            hand2 = player2.getHand();
            result = hand1.toString() + hand2.toString();

            totalRounds++;

            System.out.println("ROUND " + totalRounds + ": " + hand1 + " vs " + hand2);

            switch (result) {

                case "ROCKROCK":
                    // System.out.println("RESULT: It's a DRAW!");
                break;

                case "ROCKPAPER":
                    // System.out.println("RESULT: " + name2);
                    wins2++;
                break;

                case "ROCKSCISSORS":
                    // System.out.println("RESULT: " + name1);
                    wins1++;
                    break;

                case "PAPERROCK":
                    // System.out.println("RESULT: " + name1);
                    wins1++;
                break;

                case "PAPERPAPER":
                    // System.out.println("RESULT: It's a DRAW!");
                break;

                case "PAPERSCISSORS":
                    // System.out.println("RESULT: " + name2);
                    wins2++;
                break;

                case "SCISSORSROCK":
                    // System.out.println("RESULT: " + name2);
                    wins2++;
                break;

                case "SCISSORSPAPER":
                    // System.out.println("RESULT: " + name1);
                    wins1++;
                break;

                case "SCISSORSSCISSORS":
                    // System.out.println("RESULT: It's a DRAW!!");
                break;
            }



        }
        

        // Prints the winner of thhe game
        if (wins1 > wins2) {
            System.out.println("WINNER: " + name1);
        } else {
            System.out.println("WINNER: " + name2);
        }


        // Final Results
        System.out.println("FINAL RESULT: " + wins1 + " - " + wins2);

    }
}
