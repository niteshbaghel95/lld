package Services;

import database.UserMap;
import models.User;
import models.UserType;

public class UserService {
    private static UserService instance = null;
    
    public static UserService getInstance()
    {
        if(instance == null)
        {
            instance = new UserService();
        }
        return instance;
    }
    private UserService()
    {

    }
    UserMap userMap = UserMap.getInstance();
    public User addUser(String name, String emailID, UserType userType)
    {
        if(name.isEmpty() || emailID.isEmpty())
        {
            System.out.println("Name and emailId can not be empty");
            return null;
        }
        if(userType != UserType.CUSTOMER && userType != UserType.OWNER)
        {
            System.out.println("Invalid UserType");
            return null;
        }
        return userMap.addUser(name, emailID, userType);
    }
    
}
