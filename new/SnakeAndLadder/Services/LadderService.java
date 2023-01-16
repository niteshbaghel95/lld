package Services;

import java.util.Map;

import database.LadderMap;
import models.Ladder;

public class LadderService {
    private static LadderService laderService = null;

    public static LadderService getInstance()
    {
        if(laderService == null)
        {
            laderService = new LadderService();
        }
        return laderService;
    }

    LadderMap ladderMap = LadderMap.getInstance();

    public Ladder addLadder(int start, int end)
    {
        return ladderMap.addLadder(start, end);
    }
    public Map<Integer,Ladder> getLadders()
    {
        return ladderMap.getLadderMap();
    }
    
}
