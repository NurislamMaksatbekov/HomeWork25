import java.util.Scanner;

public class Player2 {
    Scanner sc = new Scanner(System.in);
    private int move;
    public int getMove() {
        return move;
    }
    public void playersTurn() {
        try {
            move = Integer.parseInt(sc.nextLine());
            if (move > 5 || move <= 0) {
                throw new NumberFormatException();
            }
            switch (move) {
                case 1:
                    System.out.println("You chose: " + Turn.ROCK);
                    break;
                case 2:
                    System.out.println("You chose: " + Turn.PAPER);
                    break;
                case 3:
                    System.out.println("You chose: " + Turn.SCISSORS);
                    break;
                case 4:
                    System.out.println("Computer chose: " + Turn.LIZARD);
                    break;
                case 5:
                    System.out.println("Computer chose: " + Turn.SPOCK);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter the correct data!");
            playersTurn();
        }
    }
}
