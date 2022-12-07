public class Main {
    public static void main(String[] args) {
        mainPrint();
        start();
    }
    public static void start(){
        Player player = new Player();
        player.playersTurn();
    }

    public static void mainPrint(){
        System.out.println("Choose your move: (1-3)\n" +
                "(1) ROCK\n" +
                "(2) PAPER\n" +
                "(3) SCISSORS");
    }
}