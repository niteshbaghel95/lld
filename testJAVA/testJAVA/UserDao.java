package testJAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;



public class UserDao {
    private static UserDao userDao = null;
    private UserDao()
    {

    }

    public static UserDao getInstance()
    {
        if(userDao==null)
        {
            userDao = new UserDao();
        }
        return userDao;
    }

    private HashMap<Integer,User> users = new HashMap<>();
    private HashMap<Long,Integer> phoneMap = new HashMap<>();
    private HashMap<String,Restr> restMap = new HashMap<>();
    
    private User loginUser = null;

    public User registerUser(Long phone, String name, Long pincode, Gender gender)
    {
        if(phoneMap.containsKey(phone))
        {
            System.out.println("User alreday exist");
            return users.get(phoneMap.get(phone));
        }
        User usr = new User(IDgenratore.getId(), phone, name, pincode,gender);
        phoneMap.put(phone, usr.getId());
        users.put(usr.getId(), usr);
        System.out.println("user has been added with id: "+usr.getId());
        return usr;

    }

    public User login(Long phone)
    {
        if(!phoneMap.containsKey(phone))
        {
            System.out.println("no user exits");
            return null;
        }
        User usr = users.get(phoneMap.get(phone));
        loginUser = usr;
        return usr;
    }

    public Restr registerRestr(String name, String type, int quantity,int price, String pincode)
    {
        if(loginUser==null)
        {
            System.out.println("no login user ");
            return null;
        }
        if(restMap.containsKey(name))
        {
            System.out.println("Name already taken");
            return null;
        }

        List<String> pins = Arrays.asList(pincode.split(","));
        List<String> serviceAblePin = new ArrayList<>();

        if(!pincode.isEmpty())
        {
            
            for(String s:pins)
            {
                if(!s.chars().allMatch(Character::isDigit))
                {
                    System.out.println("Invalid pinCode");
                    return null;
                }
                serviceAblePin.add(s);

            }
        }
        Restr rst = new Restr();
        rst.setId(IDgenratore.getId());
        rst.setItem(type);
        rst.setName(name);
        rst.setQuantity(quantity);
        rst.setServiceablePincode(serviceAblePin);
        rst.setPrice(price);
        restMap.put(name, rst);
        System.out.println("Successfully registered the Restarunt");
        return rst;
    }

    public Review addReview(String name , int rating , String comment)
    {
        if(!restMap.containsKey(name))
        {
            System.out.println("NO restaraunt with this name exist");
            return null;
        }
        Review review = new Review();
        review.setRating(rating);
        review.setComment(comment);
        Restr rst = restMap.get(name);
        rst.getReviews().add(review);
        float oldRating = rst.getRating();
        float newRating  = (rst.getReviews().size()*oldRating + rating)/(rst.getReviews().size() + 1);
        rst.setRating(newRating);
        return review;
    }

    public Restr updateQuantity(String name,int quantity)
    {
        if(!restMap.containsKey(name))
        {
            System.out.println("NO rest with this name is present");
            return null;
        }
        if(quantity ==0)
        {
            System.out.println("quantity can not be null");
            return null;
        }

        Restr rest = restMap.get(name);
        rest.setQuantity(rest.getQuantity() + quantity);
        return rest;
    }

    class SortByPrice implements Comparator<Restr>
    {
        @Override
        public int compare(Restr r1, Restr r2)
        {
            return r1.getPrice()-r2.getPrice();
        }
    }

    class SortByRating implements Comparator<Restr>
    {
        @Override
        public int compare(Restr r1, Restr r2)
        {
            if(r1.getRating()>r2.getRating())
            {
                return 1;
            }
            else if(r1.getRating()==r2.getRating())
            {
                return 0;
            }
            else 
            {
                return -1;
            }
        }
    }

    public List<Restr> showRestrs(String sortBy)
    {
        List<Restr> rest = loginUser.getRest();
        List<Restr> restrs = new ArrayList<>(rest);
        if(sortBy.equals("SortByPrice"))
        {
            Collections.sort(restrs,new SortByPrice());
            return restrs;
        }
        if(sortBy.equals("SortByRating"))
        {
            Collections.sort(restrs,new SortByRating());
            System.out.println("Sorted by Rating");
            return restrs;
        }
        System.out.println("Not a supported sort type");
        return restrs;
    }

    public Order placeOrder(String name, int quantity) {
        
        if(restMap.containsKey(name))
        {
            Restr restr = restMap.get(name);
            Order order = new Order();
            order.setCost(restr.getPrice()*quantity);
            order.setId(IDgenratore.getId());
            order.setUserId(loginUser.getId());
            order.setQuantity(quantity);
            order.setRestId(restr.getId());
            order.setItem(restr.getItem());
            order.setTimeStamp(System.currentTimeMillis());
            restr.setQuantity(restr.getQuantity()-quantity);
            loginUser.getOrders().add(order);
            return order;
        }
        return null;
    }

    public List<Order> listOrder() {
        return loginUser.getOrders();
    }


}
