package Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modules.Users;
import modules.Booking;

public class UserSlotCenterMap {
    private static Map<Users,List<Booking>> userBooking ;
    private static UserSlotCenterMap instance;

    public static Map<Users, List<Booking>> getUserBooking() {
        return userBooking;
    }

    public static void setUserBooking(Map<Users, List<Booking>> userBooking) {
        UserSlotCenterMap.userBooking = userBooking;
    }

    public static UserSlotCenterMap getInstance()
    {
        if(instance == null)
        {
            instance = new UserSlotCenterMap();
        }
        return instance;
    }

    private UserSlotCenterMap()
    {
        userBooking = new HashMap<>();
    }
    
    public  void setUserBooking(Users user, Booking booking)
    {
        if(userBooking.containsKey(user))
        {
            List<Booking> oldBooking  = userBooking.get(user);
            oldBooking.add(booking);
            userBooking.put(user,oldBooking);
        }
        else
        {
            List<Booking> newBooking = new ArrayList<>();
            newBooking.add(booking);
            userBooking.put(user, newBooking);
        }
    }

    public List<Booking> getUserBooking(Users user)
    {
        return userBooking.get(user);
    }
}
