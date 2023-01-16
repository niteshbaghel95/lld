package models;

public class Booking {

    int bookingId;
    Hotel hotelId;
    Room room;
    String startDate;
    String endDate;
    
    
    public Booking(int bookingId, Hotel hotelId, Room room, String startDate, String endDate) {
        this.bookingId = bookingId;
        this.hotelId = hotelId;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public Hotel getHotelId() {
        return hotelId;
    }
    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    
    
}
