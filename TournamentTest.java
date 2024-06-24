import java.util.ArrayList;

public class TournamentTest {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("beqa", true));
        players.add(new Player("gio", false));

        Tournament tournament = new Tournament(players, 10);
        tournament.run();
        tournament.result();
    }
}
