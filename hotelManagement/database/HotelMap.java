package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Hotel;
import models.Room;
import models.User;

public class HotelMap {

    private static HotelMap instance = null;
    private static Map<User,List<Hotel>> hotelOwnerList;
    private static List<Hotel> hotelList;
    
    public  Map<User,List<Hotel>> getHoteOwnerlList() {
        return hotelOwnerList;
    }

    public  void setHotelOwnerList(Map<User, List<Hotel>> hotelList) {
        HotelMap.hotelOwnerList = hotelList;
    }

    public static HotelMap getInstance()
    {
        if(instance == null)
        {
            instance = new HotelMap();
        }
        return instance;
    }

    public  Map<User, List<Hotel>> getHotelOwnerList() {
        return hotelOwnerList;
    }

    public  List<Hotel> getHotelList() {
        return hotelList;
    }

    public  void setHotelList(List<Hotel> hotelList) {
        HotelMap.hotelList = hotelList;
    }

    private HotelMap()
    {
        hotelList = new ArrayList<>();
        hotelOwnerList = new HashMap<>();
    }
    //UserMap userMap = UserMap.getInstance();
    public Hotel addHotel(User user, String name, String city, int star, List<Room> rooms) {
        if(hotelOwnerList.containsKey(user))
        {
            List<Hotel> hotels = hotelOwnerList.get(user);
            Hotel newHotel = new Hotel(name,  star, city,  rooms);
            hotels.add(newHotel);
            hotelList.add(newHotel);
            hotelOwnerList.put(user, hotels);
            return newHotel;
        }
        else
        {
            System.out.println("User is not registerd addHotel");
            return null;
        }
    }

    public Hotel addInventry(User user, String hotelName, Room room, int price) {
        if(hotelOwnerList.containsKey(user))
        {
            List<Hotel> hotels = hotelOwnerList.get(user);
            List<Hotel> toadd = new ArrayList<>();
            for(int i=0;i<hotels.size();i++)
            {
                Hotel hotel = hotels.get(i);
                if(hotel.getHotelName().equals(hotelName))
                {
                    List<Room> rooms = hotel.getRooms();
                    if(rooms.contains(room))
                    {
                        List<Room> newRooms = new ArrayList<>();
                        for(int j =0;j<rooms.size();j++)
                        {
                            if(rooms.get(j).equals(room))
                            {
                                room = rooms.get(j);
                                room.setCount(room.getCount()+room.getCount());
                                newRooms.add(room);
                                break;
                            }
                            else
                            {
                                newRooms.add(rooms.get(j));
                            }
                        }
                        
                    }
                    else
                    {
                        rooms.add(room);
                        hotel.setRooms(rooms);
                        break;
                    }
                    hotel.setRooms(rooms);
                    return hotel;
                }
            }
        }
        else
        {
            System.out.println("User is not registerd addInventory" );
            return null;
        }
        return null;
    }

    public void searchHotel(String city, int minPrice, int maxPrice) {


        for(int i=0;i<hotelList.size();i++)
        {
            Hotel hotel = hotelList.get(i);
            if(hotel.getCity().equals(city))
            {
                List<Room> rooms = hotel.getRooms();
                for(int j =0 ;j<rooms.size();j++)
                {
                    Room room = rooms.get(j);
                    if((room.getNightPrice()>=minPrice && room.getNightPrice()<=maxPrice) && room.getCount() > 0)
                    {
                        System.out.println("Hotel Name: "+ hotel.getHotelName() + " RoomType: "+ room.getRoomType() +" price: "+ room.getNightPrice());
                    }
                }
            }
        }
        
    }
   
    
}
