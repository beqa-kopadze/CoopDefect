public class Player {
    private int score;
    private String name;
    private boolean choice;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, boolean choice){
        this.name = name;
        this.choice = choice;
    }

    public Boolean strategy(boolean previous){

        return choice;
    }

    public Boolean strategy(){
        return choice;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }
}