package testJAVA.LeaderBoard.database;

import java.util.HashMap;
import java.util.Map;

import testJAVA.LeaderBoard.modules.User;

public class UserMap {
    public static Map<String, User> getEmailToUser() {
        return emailToUser;
    }
    public static void setEmailToUser(Map<String, User> emailToUser) {
        UserMap.emailToUser = emailToUser;
    }
    private static Map<String, User> emailToUser;
    private static UserMap userMap = null;
    
    public static UserMap getInstance()
    {
        if(userMap == null)
        {
            userMap = new UserMap();
        }
        return userMap;
    } 
    private UserMap()
    {
        emailToUser = new HashMap<>();
    }

    public void updateUser(User user)
    {
        emailToUser.put(user.getEmailId(), user);
    }
    
}
