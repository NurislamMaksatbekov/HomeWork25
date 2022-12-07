import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    public void playersTurn() {
        try {
            int playersTurn = Integer.parseInt(sc.nextLine());
            if(playersTurn > 3 || playersTurn <=0){
                throw new NumberFormatException();
            }
        }catch (NumberFormatException e){
            System.out.println("Enter the correct data!");
            playersTurn();
        }
    }



}
