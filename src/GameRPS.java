public class GameRPS {
    public void game() {
        Player player = new Player();
        Computer computer = new Computer();
        player.playersTurn();
        computer.computersTurn();
        if (player.getPlayersMove() == 1 && computer.getRandom() == 2 ||
            player.getPlayersMove() == 2 && computer.getRandom() == 3 ||
            player.getPlayersMove() == 3 && computer.getRandom() == 1){
            System.out.println("Computer won!");
        }else if(player.getPlayersMove() == computer.getRandom()){
            System.out.println("Draw!");
        }else{
            System.out.println("You won!");
        }
        game();
    }
}