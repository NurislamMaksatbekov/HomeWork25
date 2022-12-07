import java.util.Scanner;

public class GameRPS {
    private int victories;
    private int loses;
    private int draws;
    private int totalGames;
    private double percentOfWins;

    public void game(){
        mainPrint();
        Player player = new Player();
        Computer computer = new Computer();
        player.playersTurn();
        computer.computersTurn();
        if (player.getMove() == 1 && computer.getMove() == 2 ||
            player.getMove() == 2 && computer.getMove() == 3 ||
            player.getMove() == 3 && computer.getMove() == 1){
            System.out.println("Computer won!");
            loses++;
        }else if(player.getMove() == computer.getMove()){
            System.out.println("Draw!");
            draws++;
        }else{
            System.out.println("You won!");
            victories++;
        }
        totalGames++;
        percentOfWins = (victories * 100) / totalGames;
        continueGame();
    }
    public void continueGame(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Do you wanna continue?\n" +
                    "(1)-YES\n" +
                    "(2)-NO");
            int enter = Integer.parseInt(sc.nextLine());
            if(enter < 1 || enter > 2){
                throw new NumberFormatException();
            }switch (enter){
                case 1:
                    game();
                    break;
                case 2:
                    lastPrint();
                    break;
            }
        }catch (NumberFormatException e){
            System.out.println("Enter correct data! (1-2)");
            continueGame();
        }
    }
    public void lastPrint(){
        System.out.printf("+-----------------------------------------------------------+\n" +
                        "| VICTORIES | LOSES | DRAWS | TOTAL GAMES | PERCENT OF WINS |\n" +
                        "|-----------------------------------------------------------+\n" +
                        "|     %-6s|   %-4s|   %-4s|      %-7s|       %-10s|\n" +
                        "+-----------------------------------------------------------+",
                victories, loses, draws, totalGames, percentOfWins);
    }
    public static void mainPrint(){
        System.out.println("Choose your move: (1-3)\n" +
                "(1) " + Turn.ROCK + "\n" +
                "(2) " + Turn.PAPER + "\n" +
                "(3) " + Turn.SCISSORS);
    }
}