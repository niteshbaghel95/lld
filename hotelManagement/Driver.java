import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.Holder;

import Services.BookingService;
import Services.HotelServices;
import Services.UserService;
import models.Booking;
import models.Hotel;
import models.Room;
import models.RoomType;
import models.User;
import models.UserType;

public class Driver {
    public static void main(String[] args) {
        BookingService bookingService = BookingService.getInstance();
        HotelServices hotelServices = HotelServices.getInstance();
        UserService userService = UserService.getInstance();
        User nitesh = userService.addUser("nitesh", "niteshBaghel", UserType.OWNER);
        User palsash = userService.addUser("palash", "emailIdda", UserType.CUSTOMER);

        List<Room> room = new ArrayList<>();
        room.add(new Room(100, RoomType.Deluxe, false, 2));
        hotelServices.addHotel(nitesh, "My Place", "bangalore", 3, room);
        bookingService.bookRoom(palsash, "My Place", RoomType.Deluxe,"12-04-1995", "13-04-1995");

        List<Booking>bookings= bookingService.getBooking(palsash);
       for(int i=0;i<bookings.size();i++)
       {
        Booking book = bookings.get(i);
        System.out.println(book.getBookingId() +" "+book.getStartDate()+" "+book.getEndDate()+book.getHotelId());
       }


    }
    
}
