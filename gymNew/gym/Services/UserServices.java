package Services;


import java.util.HashMap;
import java.util.Map;

import Database.IdGenrator;
import modules.Users;

public class UserServices {

    private static UserServices instance = null;
    private static Map<String,Users> users;

    public static UserServices getInstance()
    {
        if(instance == null)
        {
            instance = new UserServices();
        }
        return instance;
    }

    private UserServices()
    {
        users = new HashMap<>();
    }
    
    public int registerUser(String name, String emailId, int phoneNumber, String pass)
    {
        if(name.isEmpty() || emailId.isEmpty() || pass.isEmpty())
        {
            System.out.println("name/email/pass can not be empty");
            return -1;
        }

        if(users.containsKey(emailId))
        {
            System.out.println("User already Exits");
            return users.get(emailId).getUserId();
        }
        Users user = new Users(IdGenrator.getId(), name, emailId,phoneNumber,pass);
        users.put(emailId, user);
        return user.getUserId();

    }
    public Users getUser(String emailId)
    {
        if(users.containsKey(emailId))
        {
            return users.get(emailId);
        }
        return null;
    }

}
