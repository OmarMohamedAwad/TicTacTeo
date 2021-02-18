package controller;

/**
 *
 * @author amalasaad
 */
public class Players {

    private int userID;
    private String userName;
    private String password;
    private int score;

    public Players(){   
    }
    public Players(int userId,String userName,String password,int score ){
        this.userID=userId;
        this.userName=userName; 
        this.password=password;
        this.score=score;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Players(String userName, int score) {
        this.userName = userName;
        this.score = score;
    }
    

}
