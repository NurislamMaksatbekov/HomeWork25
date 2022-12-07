public class Main {
    public static void main(String[] args) {
        mainPrint();
        start();
    }
    public static void start(){
        GameRPS game = new GameRPS();
        game.game();
        lastPrint(game);

    }

    public static void mainPrint(){
        System.out.println("Choose your move: (1-3)\n" +
                "(1) ROCK\n" +
                "(2) PAPER\n" +
                "(3) SCISSORS");
    }

    public static void lastPrint(GameRPS games){
        System.out.printf("+-----------------------------------------------------------+\n" +
                           "| VICTORIES | LOSES | DRAWS | TOTAL GAMES | PERCENT OF WINS |\n" +
                           "|-----------------------------------------------------------+\n" +
                           "|     %s    |   %s  |   %s  |      %s     |        %s       |\n" +
                           "+-----------------------------------------------------------+",
                games.getWins(), games.getLoses(), games.getDraws(),
                games.getTotalGames(), games.getPercentOfWins());
        ;

    }
}