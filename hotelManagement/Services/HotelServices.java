package Services;

import java.util.List;

import database.HotelMap;
import models.Hotel;
import models.Room;
import models.User;
import models.UserType;

public class HotelServices {
    private static HotelServices instance = null;

    public static HotelServices getInstance()
    {
        if(instance == null)
        {
            instance = new HotelServices();
        }
        return instance;
    }
    private HotelServices()
    {
        
    }
    
    HotelMap hotelMap = HotelMap.getInstance();

    public Hotel addHotel(User user, String name, String city, int star, List<Room> rooms)
    {
        if(user.getUserType() !=  UserType.OWNER)
        {
            System.out.println("User is not authoried to add hotel");
            return null;
        }
        if(name.isEmpty() || city.isEmpty()|| star <=0 || rooms.size()==0)
        {
            System.out.println("Please provide the right value");
            return null;
        }
        return hotelMap.addHotel(user, name,city,star,rooms);
    }

    public Hotel addInventry(User user, String hotelName, Room room, int price)
    {
        if(user.getUserType() !=  UserType.OWNER)
        {
            System.out.println("User is not authoried to add hotel");
            return null;
        }
        if(hotelName.isEmpty()|| price <=0)
        {
            System.out.println("Please provide the right value for hotelName and price");
            return null;
        }
       return hotelMap.addInventry(user,hotelName, room, price);
    }

    public void searchHotel(String city, int minPrice, int maxPrice)
    {
        if(city.isEmpty() || minPrice <=0 || maxPrice <=0)
        {
            System.out.println("Wrong values of city/price");
            return;
        }
         hotelMap.searchHotel(city,minPrice,maxPrice);
    }
}
