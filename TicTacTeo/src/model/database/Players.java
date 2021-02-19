package model.database;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author amalasaad
 */
public class Players {

    private int userID;
    private String userName;
    private String password;
    private int score;
    
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty userScore;
    
    public Players(){   
    }
    public Players(int userId,String userName,String password,int score ){
        this.userID=userId;
        this.userName=userName; 
        this.password=password;
        this.score=score;
    }
    
    public Players(String id, String name, String score) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.userScore = new SimpleStringProperty(score);
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
    
    public String getId() {
        return id.get();
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getUserScore() {
        return userScore.get();
    }

    public void setUserScore(String score) {
        userScore.set(score);
    }

    public Players(String userName, int score) {
        this.userName = userName;
        this.score = score;
    }
}
