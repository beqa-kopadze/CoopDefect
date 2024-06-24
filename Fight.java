public class Fight {
    private int count;

    public Fight(int count){
        this.count = count;
    }
    public void fight(Player player1, Player player2){
        for(int i = 0; i < count; i++) {
            boolean p1_choice = player1.strategy();
            boolean p2_choice = player2.strategy();

            if (p1_choice && p2_choice) {
                player1.setScore(player1.getScore() + 3);
                player2.setScore(player2.getScore() + 3);
            } else if (!p1_choice && p2_choice) {
                player1.setScore(player1.getScore() + 5);
            } else if (p1_choice) {
                player2.setScore(player2.getScore() + 5);
            } else {
                player1.setScore(player1.getScore() + 1);
                player2.setScore(player2.getScore() + 1);
            }
        }
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
