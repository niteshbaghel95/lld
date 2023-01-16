package models;

public class player {
    String playerName;
    int position;
    public player(String playerName, int position) {
        this.playerName = playerName;
        this.position = position;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    
}
