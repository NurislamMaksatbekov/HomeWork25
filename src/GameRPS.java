public class GameRPS {
    private int wins;
    private int loses;
    private int draws;
    private int totalGames;
    private double percentOfWins;

    public int getTotalGames() {
        return totalGames;
    }

    public double getPercentOfWins() {
        return percentOfWins;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public void game() {
        Player player = new Player();
        Computer computer = new Computer();
        player.playersTurn();
        computer.computersTurn();
        if (player.getPlayersMove() == 1 && computer.getRandom() == 2 ||
            player.getPlayersMove() == 2 && computer.getRandom() == 3 ||
            player.getPlayersMove() == 3 && computer.getRandom() == 1){
            System.out.println("Computer won!");
            loses++;
        }else if(player.getPlayersMove() == computer.getRandom()){
            System.out.println("Draw!");
            draws++;
        }else{
            System.out.println("You won!");
            wins++;
        }
        totalGames = wins + draws + loses;
        percentOfWins = (wins * 100) / totalGames;

        game();
    }
}