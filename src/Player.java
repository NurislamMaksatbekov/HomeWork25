import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    private int move;
    public int getMove() {
        return move;
    }
    public void playersTurn() {
        try {
            move = Integer.parseInt(sc.nextLine());
            if (move > 3 || move <= 0) {
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
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter the correct data!");
            playersTurn();
        }
    }
}
