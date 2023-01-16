package testJAVA;

import java.util.List;

public class OrderService
{
    private static OrderService orderservice = null;
    private OrderService()
    {

    }
    public static OrderService getInstance()
    {
        if(orderservice==null)
        {
            orderservice = new OrderService();
        }
        return orderservice;
    }

    UserDao userdao = UserDao.getInstance();

    public Order placeOrder(String name, int quantity)
    {
        if(quantity<=0)
        {
            System.out.println("Enter Valid Quantity");
            return null;
        }
        return userdao.placeOrder(name,quantity);
    }

    public List<Order> listOrder()
    {
        return userdao.listOrder();
    }
}