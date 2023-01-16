package Services;

import java.util.List;

import database.PlayerLIst;
import models.player;

public class PlayerService {
    private static PlayerService instance = null;

    public static PlayerService getInstance()
    {
        if(instance == null)
        {
            instance = new PlayerService();
        }
        return instance;
    }

    PlayerLIst playList = PlayerLIst.getInstance();

    public player addPlayer(String name)
    {
        return playList.addPlayer(name);
    }
    
    public List<player> getPlayers()
    {
        return playList.getPlayers();
    }
}
