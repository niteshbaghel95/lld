package models;

public class Room {
  
    int nightPrice;
    RoomType roomType;
    boolean occupied;
    int count;
    
    public Room(int nightPrice, RoomType roomType, boolean occupied, int count) {
        this.nightPrice = nightPrice;
        this.roomType = roomType;
        this.occupied = occupied;
        this.count = count;
    }
    public int getNightPrice() {
        return nightPrice;
    }
    public void setNightPrice(int nightPrice) {
        this.nightPrice = nightPrice;
    }
    public RoomType getRoomType() {
        return roomType;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    
    
    
    
    
   
}
