package modules;

public class Booking {
    int bookingId;
    Users user;
    Slots slot;
    Center center;
    
    public Booking(int bookingId, Users user, Slots slot, Center center) {
        this.bookingId = bookingId;
        this.user = user;
        this.slot = slot;
        this.center = center;
    }
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    public Slots getSlot() {
        return slot;
    }
    public void setSlot(Slots slot) {
        this.slot = slot;
    }
    public Center getCenter() {
        return center;
    }
    public void setCenter(Center center) {
        this.center = center;
    }
    
}
