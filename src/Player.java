public class Player {
    private String name;
    private int score;
    private boolean playerturn;

    public Player(String name, int score, boolean playerturn) {
        this.name = name;
        this.score = score;
        this.playerturn = playerturn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isPlayerturn() {
        return playerturn;
    }

    public void setPlayerturn(boolean playerturn) {
        this.playerturn = playerturn;
    }
}
