package testJAVA.LeaderBoard.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import testJAVA.LeaderBoard.modules.User;

public class ScoreMap {
    private static Map<Integer,List<User>> scoreUserMap;
    public static Map<Integer, List<User>> getScoreUserMap() {
        return scoreUserMap;
    }
    public static void setScoreUserMap(Map<Integer, List<User>> scoreUserMap) {
        ScoreMap.scoreUserMap = scoreUserMap;
    }
    private static ScoreMap scoreMap;
    public static ScoreMap getInstance()
    {
        if(scoreMap == null)
        {
            scoreMap = new ScoreMap();
        }
        return scoreMap;
    }
    private ScoreMap()
    {
        scoreUserMap = new HashMap<>();
    }
    public void updateScoreMap(User user)
    {
        List<User> list = scoreUserMap.getOrDefault(user.getScore(), new ArrayList<>());
        list.add(user);
        scoreUserMap.put(user.getScore(), list);
    }
}
