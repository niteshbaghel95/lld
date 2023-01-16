package database;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Hotel;
import models.User;
import models.UserType;

public class UserMap {
    private static UserMap instance = null;
    private static Map<String, User>userList;

    public static UserMap getInstance()
    {
        if(instance == null)
        {
            instance = new UserMap();
        }
        return instance;
    }

    private UserMap()
    {
        userList = new HashMap<>();
    }

 
    public Map<String, User> getUserList() {
        return userList;
    }

    public void setUserList(Map<String, User> userList) {
        UserMap.userList = userList;
    }
    HotelMap hotelMap = HotelMap.getInstance();
    public User addUser(String name, String emailId, UserType userType)
    {
        User newUser = new User(name, emailId, userType);
        if(userList.containsKey(newUser.getName()))
        {
            System.out.println("User already exits");
            return null;
        }
        Map<User,List<Hotel>> map = hotelMap.getHoteOwnerlList();
        List<Hotel> hot = new ArrayList<>();
        map.put(newUser,hot);
        hotelMap.setHotelOwnerList(map);
        userList.put(newUser.getName(), newUser);
        return newUser;
    }
}
