import java.util.Scanner;

public class GameRPS2 {
    private int victories;
    private int loses;
    private int draws;
    private int totalGames;
    private double percentOfWins;

    public void startGame2() {
        mainPrint();
        Player2 player2 = new Player2();
        Computer2 computer2 = new Computer2();
        player2.playersTurn();
        computer2.computersTurn();
        if (player2.getMove() == 1 && computer2.getMove() == 2 ||
                player2.getMove() == 1 && computer2.getMove() == 5 ||
                player2.getMove() == 2 && computer2.getMove() == 3 ||
                player2.getMove() == 2 && computer2.getMove() == 4 ||
                player2.getMove() == 3 && computer2.getMove() == 1 ||
                player2.getMove() == 3 && computer2.getMove() == 5 ||
                player2.getMove() == 4 && computer2.getMove() == 1 ||
                player2.getMove() == 4 && computer2.getMove() == 3 ||
                player2.getMove() == 5 && computer2.getMove() == 2 ||
                player2.getMove() == 5 && computer2.getMove() == 4){
            System.out.println("Computer won!");
            loses++;
        } else if (player2.getMove() == computer2.getMove()) {
            System.out.println("Draw!");
            draws++;
        } else {
            System.out.println("You won!");
            victories++;
        }
        totalGames++;
        percentOfWins = (victories * 100) / totalGames;
        continueGame();
    }

    public void continueGame() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Do you wanna continue?\n" +
                    "(1)-YES\n" +
                    "(2)-NO");
            int enter = Integer.parseInt(sc.nextLine());
            if (enter < 1 || enter > 2) {
                throw new NumberFormatException();
            }
            switch (enter) {
                case 1:
                    startGame2();
                    break;
                case 2:
                    lastPrint();
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter correct data! (1-2)");
            continueGame();
        }
    }
    public void lastPrint() {
        System.out.printf("+-----------------------------------------------------------+\n" +
                        "| VICTORIES | LOSES | DRAWS | TOTAL GAMES | PERCENT OF WINS |\n" +
                        "|-----------------------------------------------------------+\n" +
                        "|     %-6s|   %-4s|   %-4s|      %-7s|       %-10s|\n" +
                        "+-----------------------------------------------------------+",
                victories, loses, draws, totalGames, percentOfWins);
    }

    public static void mainPrint() {
        System.out.println("Choose your move: (1-5)\n" +
                "(1) " + Turn.ROCK + "\n" +
                "(2) " + Turn.PAPER + "\n" +
                "(3) " + Turn.SCISSORS + "\n" +
                "(4) " + Turn.LIZARD + "\n" +
                "(5) " +Turn.SPOCK);
    }
}
