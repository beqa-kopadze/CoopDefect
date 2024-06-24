import java.util.List;

public class Tournament {
    private List<Player> players;
    private Fight fight;
    private int rounds;
    public Tournament(List<Player> players, int rounds){
        this.players = players;
        this.rounds = rounds;
        fight = new Fight(rounds);
    }

    public void run(){
        for(Player player1 : players){
            for(Player player2 : players){
                fight.fight(player1,player2);
            }
        }
    }
    public void result(){
        for(Player player : players){
            System.out.println(player.getName() + " got this: " + player.getScore());
        }
    }
}
