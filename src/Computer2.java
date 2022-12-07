import java.util.Random;
public class Computer2 {
    Random rnd = new Random();
    private int move;
    public int getMove() {
        return move;
    }
    public void computersTurn(){
        move = rnd.nextInt(5) + 1;
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
            case 4:
                System.out.println("Computer chose: " + Turn.LIZARD);
                break;
            case 5:
                System.out.println("Computer chose: " + Turn.SPOCK);
        }
    }
}

