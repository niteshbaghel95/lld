package testJAVA.LeaderBoard.modules;
public class User
{
    String name;
    String country;
    String emailId;
    int score;
    public String getName() {
        return name;
    }
    public User(String name, String country, String emailId) {
        this.name = name;
        this.country = country;
        this.emailId = emailId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}