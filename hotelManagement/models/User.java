package models;

public class User {
    String name;
    String emailId;
    UserType userType;
    
    public User(String name, String emailId,UserType userType) {
        this.name = name;
        this.emailId = emailId;
        this.userType = userType;
    }
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
 
    
    
}
