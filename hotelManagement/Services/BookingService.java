package Services;

import java.util.List;

import database.BookingMap;
import models.Booking;
import models.Room;
import models.RoomType;
import models.User;

public class BookingService {
    private static BookingService instance  = null;
    public static BookingService getInstance()
    {
        if(instance == null)
        {
            instance = new BookingService();
        }
        return instance;
    }

    private BookingService()
    {

    }

    BookingMap bookingMap = BookingMap.getInstance();

    public Room bookRoom(User user, String hotel, RoomType roomType, String checkIn, String checkOut)
    {
        return bookingMap.bookRoom(user,hotel,roomType,checkIn,checkOut);
    }
    public List<Booking> getBooking(User user)
    {
        return bookingMap.getBooking(user);
    }
}
