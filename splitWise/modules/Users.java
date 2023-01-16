package modules;
public class Users {

    int userId;
    String name;
    String emailId;
    String phoneNo;
    
    public Users(int userId, String name, String emailId, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
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
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
  
    
}
