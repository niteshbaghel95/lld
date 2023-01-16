package Services;
import java.util.ArrayList;
import java.util.List;

import Database.IdGenrator;
import Database.UserSlotCenterMap;
import javafx.util.Pair;
import modules.Booking;
import modules.Center;
import modules.Slots;
import modules.Users;
public class BookingService {
    private static BookingService instance = null;
    private static List<Booking> bookingList;

    public static BookingService getInstance()
    {
        if(instance==null)
        {
            instance = new BookingService();
        }
        return instance;
    }

    private BookingService()
    {
        bookingList = new ArrayList<>();
    }

    UserServices userServices = UserServices.getInstance();
    CenterSlotService centerSlotService = CenterSlotService.getInstance();
    UserSlotCenterMap userSlotCenterMap = UserSlotCenterMap.getInstance();

    public Booking BookSlot(String emailId, int centerId, int slotId)
    {
        if(userServices.getUser(emailId) != null)
        {
            Users user =  userServices.getUser(emailId);
            Pair <Center,Slots> pair = centerSlotService.checkAndBook(centerId,slotId);
            if(pair.getValue() !=null)
            {
                Booking newbooking =  new Booking(IdGenrator.getId(), user, pair.getValue(), pair.getKey());
                System.out.println("Booking id: "+ newbooking.getBookingId() + "Slot Information: "+ pair.getKey().getCenterId() 
                + " Center Information: "+ pair.getValue().getSlotId());
                bookingList.add(newbooking);
                userSlotCenterMap.setUserBooking(user, newbooking);
                return newbooking;
            }
            else
            {
                System.out.println("Not slot is available");
                return null;
            }
        }
        else
        {
            System.out.println("Not a registert User");
            return null;
        }
    }


}
