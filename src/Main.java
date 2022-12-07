import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        Scanner sc = new Scanner(System.in);
        GameRPS gameRPS = new GameRPS();
        GameRPS2 gameRPS2 = new GameRPS2();
        try {
            System.out.println("Which one do you wanna play?\n" +
                    "(1) [ROCK PAPER SCISSORS]\n" +
                    "(2) [ROCK PAPER SCISSORS LIZARD SPOCK]");
            int choose = Integer.parseInt(sc.nextLine());
            if(choose <= 0 || choose > 2){
                throw new NumberFormatException();
            }switch (choose){
                case 1:
                    gameRPS.startGame();
                    break;
                case 2:
                    gameRPS2.startGame2();
                    break;
            }
        }catch (NumberFormatException e){
            System.out.println("Enter correct data!");
            start();
        }
    }
}