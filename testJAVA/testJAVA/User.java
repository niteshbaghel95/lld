package testJAVA;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private String name;
    private int id;
    private Long phone;
    private Long pincode;
    public User(int id,Long phone, String name, Long pincode, Gender gender)
    {
        this.id=id;
        this.phone=phone;
        this.name=name;
        this.pincode=pincode;
        this.gender = gender;
    }
    public List<Restr> getRest() {
        return rest;
    }
    public void setRest(List<Restr> rest) {
        this.rest = rest;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    private Gender gender;
    private List<Restr> rest = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public Long getPincode() {
        return pincode;
    }
    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public User()
    {
        System.out.println("ss");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}