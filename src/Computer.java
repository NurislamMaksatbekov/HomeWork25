import java.util.Random;
public class Computer {
    Random rnd = new Random();
    private int move;
    public int getMove() {
        return move;
    }
    public void computersTurn(){
        move = rnd.nextInt(3) + 1;
            switch (move) {
                case 1:
                    System.out.println("Computer chose: " + Turn.ROCK);
                    break;
                case 2:
                    System.out.println("Computer chose: " + Turn.PAPER);
                    break;
                case 3:
                    System.out.println("Computer chose: " + Turn.SCISSORS);
                    break;
            }
    }
}
