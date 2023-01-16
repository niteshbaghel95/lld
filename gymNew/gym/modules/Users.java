package modules;

public class Users {
    int userId;
    String name;
    public Users(int userId, String name, String emailId, int phoneNumber, String password) {
        this.userId = userId;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        Password = password;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    String emailId;
    int phoneNumber;
    String Password;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    
}
