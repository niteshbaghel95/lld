package testJAVA.LeaderBoard.Services;


import testJAVA.LeaderBoard.modules.User;

import javax.jws.soap.SOAPBinding.Use;

public class UserServices {

    private static UserServices instance = null;
    private UserServices()
    {

    }

    public static UserServices getInstance()
    {
        if(instance==null)
        {
            instance = new UserServices();
        }
        return instance;
    }

    public User addUser(String name, String country, String emailId)
    {

    }
    public User addUser(String name, String emailId)
    {
        if(name.length()==0 || emailId.length()==0)
        {
            System.out.println("name/emailId can not be empty");
            return null;
        }
        
    }
    
}
