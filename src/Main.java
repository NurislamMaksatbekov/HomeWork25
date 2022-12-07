public class Main {
    public static void main(String[] args) {
        mainPrint();
        start();
        lastPrint();
    }
    public static void start(){
        GameRPS game = new GameRPS();
        game.game();
    }

    public static void mainPrint(){
        System.out.println("Choose your move: (1-3)\n" +
                "(1) ROCK\n" +
                "(2) PAPER\n" +
                "(3) SCISSORS");
    }

    public static void lastPrint(){
        System.out.printf("+-----------------------------------------------------------+\n" +
                           "| VICTORIES | LOSES | DRAWS | TOTAL GAMES | PERCENT OF WINS |\n" +
                           "|-----------------------------------------------------------+\n" +
                           "|     %s    |   %s  |   %s  |      %s     |        %s       |\n" +
                           "+-----------------------------------------------------------+");
    }
}