package testJAVA;

import java.util.List;

public class RestService
{
    private static RestService restService= null;
    private RestService()
    {

    }
    public static RestService getInstance()
    {
        if(restService==null)
        {
            restService = new RestService();
        }
        return restService;
    }

    UserDao userDao = UserDao.getInstance();

    public Restr addRestr(String name, String item, int price, int quantity, String pingCode)
    {
        if(price <=0 || quantity <=0)
        {
            System.out.println("invalid price/quantity");
            return null;
        }
        if(name.length()==0)
        {
            System.out.println("name can not be null");
            return null;
        }
        return userDao.registerRestr(name,item,price,quantity, pingCode);
    }

    public Review addReview(String name,int rating, String comment)
    {
        if(comment.isEmpty() || rating <=0)
        {
            System.out.println("invalid review");
            return null;
        }
        return userDao.addReview(name, rating, comment);
    }

    public Restr updateQuantity(String name, int quantity )
    {
        if(quantity<=0)
        {
            System.out.println("invalid quantity");
            return null;
        }
        return userDao.updateQuantity(name,quantity);
    }

    public List<Restr> showRestr(String sortBy)
    {
       return userDao.showRestrs(sortBy);
    }
}