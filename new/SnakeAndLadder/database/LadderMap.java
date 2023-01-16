package database;


import java.util.HashMap;
import java.util.Map;

import models.Ladder;

public class LadderMap {
    private static LadderMap instance = null;
    private static Map<Integer,Ladder> ladderMap;

    public static  LadderMap getInstance()
    {
        if(instance == null)
        {
            instance =  new LadderMap();
        }
        return instance;
    }

    public  Map<Integer,Ladder> getLadderMap() {
        return ladderMap;
    }

    public static void setLadderMap(Map<Integer,Ladder> ladderMap) {
        LadderMap.ladderMap = ladderMap;
    }

    private LadderMap()
    {
        ladderMap = new HashMap<>();
    }

    public Ladder addLadder(int start, int end)
    {
        if(start <= 0 || end <= 0 )
        {
            System.out.println("start/end can not be zero or less than zero");
            return null;
        }
        Ladder ladder = new Ladder(start, end);
        ladderMap.put(start, ladder);
        return ladder;
    }
    
}
