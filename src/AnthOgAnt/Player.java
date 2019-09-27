package AnthOgAnt;

public class Player {
    private String name;
    private int score = 0;
    private boolean playerturn = false;

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
