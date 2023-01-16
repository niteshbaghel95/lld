package testJAVA.LeaderBoard.database;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import testJAVA.LeaderBoard.modules.User;

public class Rank {
    private Map<String, PriorityQueue<User>> rankMap;
    private static Rank rank = null;
    public Map<String, PriorityQueue<User>> getRankMap() {
        return rankMap;
    }
    public void setRankMap(Map<String, PriorityQueue<User>> rankMap) {
        this.rankMap = rankMap;
    }
    public static Rank getRank() {
        return rank;
    }
    public static void setRank(Rank rank) {
        Rank.rank = rank;
    }
    
    public static Rank getInstance()
    {
        if(rank==null)
        {
            rank = new Rank();
        }
        return rank;
    }
    private Rank()
    {
        rankMap = new HashMap<>();
        rankMap.put("", new PriorityQueue<>((User u1, User u2) -> u2.getScore() - u1.getScore()));
    }

    public void updateRankMap(User user)
    {
        PriorityQueue<User> global = rankMap.get("");
        PriorityQueue<User> contry  = rankMap.getOrDefault(user.getCountry(),
         new PriorityQueue<>((User u1, User u2) -> u2.getScore() - u1.getScore()));

         global.remove(user);
         global.offer(user);
         contry.remove(user);
         contry.offer(user);
         rankMap.put("", global);
         rankMap.put(user.getCountry(), contry);
    }
}
