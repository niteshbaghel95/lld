package modules;

public class Slots {
    int slotId;
    int startTime;
    WorkoutType type;
    boolean occupied;   
    int capacity;
    
    public Slots(int slotId, int startTime, WorkoutType type, boolean occupied, int capacity) {
        this.slotId = slotId;
        this.startTime = startTime;
        this.type = type;
        this.occupied = occupied;
        this.capacity = capacity;
    }
    public int getSlotId() {
        return slotId;
    }
    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }
    public int getStartTime() {
        return startTime;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public WorkoutType getType() {
        return type;
    }
    public void setType(WorkoutType type) {
        this.type = type;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
