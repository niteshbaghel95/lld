package testJAVA;

import java.util.ArrayList;
import java.util.List;

class Restr
{
    int id;
    String name;
    int quantity;
    float rating;
    String item;
    int price;
    private List<String> serviceablePincode;
    private List<Review> reviews=new ArrayList<>();

    
    
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
   
    public List<String> getServiceablePincode() {
        return serviceablePincode;
    }
    public void setServiceablePincode(List<String> serviceablePincode) {
        this.serviceablePincode = serviceablePincode;
    }
    public List<Review> getReviews() {
        return reviews;
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    public void setPrice(int price) {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }
   
}