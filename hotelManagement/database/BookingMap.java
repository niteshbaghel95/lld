package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import models.Booking;
import models.Hotel;
import models.Room;
import models.RoomType;
import models.User;

public class BookingMap {

    private static BookingMap instance = null;
    private static Map<User,List<Booking>> bookingMap;
    
    public static BookingMap getInstance()
    {
        if(instance == null)
        {
            instance = new BookingMap();
        }
        return instance;
    }

    private BookingMap()
    {
        bookingMap = new HashMap<>();
    }

    public Map<User, List<Booking>> getBookingMap() {
        return bookingMap;
    }

    HotelMap hotelMap = HotelMap.getInstance();
    public void setBookingMap(Map<User, List<Booking>> bookingMap) {
        BookingMap.bookingMap = bookingMap;
    }

    public Room bookRoom(User user, String hotel, RoomType roomType, String checkIn, String checkOut) {
        
        if(hotel.isEmpty() && checkIn.equals(checkOut))
        {
            System.out.println("Invalid Booking value");
            return null;
        }
        List<Hotel> hotels = hotelMap.getHotelList();

        for(int i=0;i<hotels.size();i++)
        {
            Hotel hote = hotels.get(i);
            if(hote.getHotelName().equals(hotel))
            {
                List<Room> room = hote.getRooms();
                for(int j=0;j<room.size();j++)
                {
                    Room r = room.get(j);
                    if(r.getRoomType().equals(roomType))
                    {
                        r.setCount(r.getCount()-1);

                        Booking book = new Booking(IDGenrator.getId(), hote, r, checkIn, checkOut);
                        List<Booking> list = new ArrayList<>();
                        list.add(book);
                        bookingMap.put(user, list);
                        return r;
                    }
                }
            }
        }
        return null;

    }

    public List<Booking> getBooking(User user)
    {
        return bookingMap.get(user);
    }
    
}
