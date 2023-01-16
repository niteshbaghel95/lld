package Services;

import java.util.List;

import Database.UserSlotCenterMap;
import modules.Booking;
import modules.Users;

public class UserBooking {
    private static UserBooking instance = null;
    UserSlotCenterMap userSlotCenterMap = UserSlotCenterMap.getInstance();
    UserServices userServices = UserServices.getInstance();
    
    public static UserBooking getInstance()
    {
        if(instance == null)
        {
            instance = new UserBooking();
        }
        return instance;
    }

    public void getUserSlots(String emailId)
    {
        if(userServices.getUser(emailId) != null)
        {
            Users user = userServices.getUser(emailId);
            List<Booking> bookings = userSlotCenterMap.getUserBooking(user);
            for(int i =0 ;i<bookings.size();i++)
            {
                Booking bk  = bookings.get(i);
                System.out.println(bk.getBookingId()+"  "+bk.getCenter().getCenterId()+" "+bk.getCenter().getCenterName()+" "+bk.getSlot().getSlotId()
                +" "+ bk.getSlot().getType()+" "+bk.getSlot().getStartTime());

            }

        }
    }
}
