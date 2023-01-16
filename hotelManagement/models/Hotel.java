package models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    String hotelName;
    int starRating;
    String address;
    String city;
    List<Room> rooms = new ArrayList<>();
    
    public Hotel(String hotelId, int starRating,  String city, List<Room> rooms) {
        this.hotelName = hotelId;
        this.starRating = starRating;
        
        this.city = city;
        this.rooms = rooms;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelId) {
        this.hotelName = hotelId;
    }
    public int getStarRating() {
        return starRating;
    }
    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    
}
