package testJAVA;

public class Order {
    private int id;
    private int RestId;
    private int quantity;
    private int userId;
    private int cost;
    private long timeStamp;
    private String item;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRestId() {
        return RestId;
    }
    public void setRestId(int restId) {
        RestId = restId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(long l) {
        this.timeStamp = l;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    
  
}
