package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.player;

public class PlayerLIst {
    private static PlayerLIst instance = null;
    private static List<player> playerLIst;
    private static Map<player,Integer> playerMap;

    public  Map<player, Integer> getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(Map<player, Integer> playerMap) {
        PlayerLIst.playerMap = playerMap;
    }

    public static PlayerLIst getInstance()
    {
        if(instance == null)
        {
            instance = new PlayerLIst();
        }
        return instance;
    }

    private PlayerLIst()
    {
        playerLIst = new ArrayList<>();
    }

    public player addPlayer(String name)
    {
        if(name.isEmpty())
        {
            System.out.println("Name can not be empty");
            return null;
        }
        player plr = new player(name, 0 );
        if(playerLIst.contains(plr))
        {
            System.out.println("player already exist");
            return null;
        }
        playerLIst.add(plr);
        return plr;
    }

    public List<player> getPlayers()
    {
        return playerLIst;
    }
    
}