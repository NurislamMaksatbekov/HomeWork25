import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    public void playersTurn() {
        try {
            int playersTurn = Integer.parseInt(sc.nextLine());
            if(playersTurn > 3 || playersTurn <=0) {
                throw new NumberFormatException();}
                switch (playersTurn) {
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
        }catch (NumberFormatException e){
            System.out.println("Enter the correct data!");
            playersTurn();
        }
    }



}
