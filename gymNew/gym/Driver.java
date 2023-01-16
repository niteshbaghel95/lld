import Services.BookingService;
import Services.CenterSlotService;
import Services.UserBooking;
import Services.UserServices;


public class Driver {
    public static void main(String[] args) {
        UserServices userServices = UserServices.getInstance();
        BookingService bookingService = BookingService.getInstance();
        UserBooking userBooking = UserBooking.getInstance();
        CenterSlotService centerSlotService = CenterSlotService.getInstance();
        userServices.registerUser("Nitesh", "nitesh", 98276364, "jjjj");
        centerSlotService.getSlots();
        bookingService.BookSlot("nitesh", 13, 2);
        bookingService.BookSlot("nitesh", 13, 2);
        bookingService.BookSlot("nitesh", 13, 2);
        centerSlotService.getSlots();

        userBooking.getUserSlots("nitesh");
    }
}
