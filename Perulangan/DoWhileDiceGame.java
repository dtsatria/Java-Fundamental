import java.util.Scanner;

public class DoWhileDiceGame {
    public static void main(String[] args) {
        int roll, playerTotal, computerTotal, turnTotal;
        String choice = "";
        Scanner inputan = new Scanner(System.in);
        playerTotal = 0;
        computerTotal = 0;

        do {
            if (playerTotal < 100) {
                turnTotal = 0;
                System.out.println("points Computer" + computerTotal);

                do {
                    roll = 1 + (int) (Math.random() * 6);
                    System.out.println("\tRoll Komputer " + roll + ".");
                    if (roll == 1) {
                        System.out.println("that end its turn");
                        turnTotal = 0;
                    } else {
                        turnTotal += roll;
                        System.out.println("\tcomputer has " + turnTotal + " point this round");
                        if (turnTotal < 10) {
                            System.out.println("\tComputer will roll again");
                        }
                    }
                } while (roll != 1 && turnTotal < 10);

                computerTotal += turnTotal;
                System.out.println("\tComputer end the rounds with");
                System.out.println(computerTotal + " points.\n");
            }

            turnTotal = 0;
            System.out.println("You have" + playerTotal + " points.");

            do {
                roll = 1 + (int) (Math.random() * 6);
                System.out.println("\tYou rolled a " + roll + ".");
                if (roll == 1) {
                    System.out.println("\tThat ends your turn.");
                    turnTotal = 0;
                } else {
                    turnTotal += roll;
                    System.out.println("\tYou have " + turnTotal + " points.");
                    System.out.println(" So far this round. \n");
                    System.out.println("\tWould you like to roll again?");
                    System.out.println("or hold ?");
                    choice = inputan.next();
                }
            } while (roll != 1 && choice.equals("roll"));

            playerTotal += turnTotal;
            System.out.println("\tYou end the round with " + playerTotal + " points.");
        } while (playerTotal < 50 && computerTotal < 50);
        if (playerTotal > computerTotal) {
            System.out.println("Humanity Wins!!");
        } else {
            System.out.println("Computer Wins !!");
        }

        inputan.close();
    }
}
