import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    private int playersMove;
    public int getPlayersMove() {
        return playersMove;
    }
    public void playersTurn() {
        try {
            playersMove = Integer.parseInt(sc.nextLine());
            if (playersMove > 3 || playersMove <= 0) {
                throw new NumberFormatException();
            }
            switch (playersMove) {
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
