
package controller;

/**
 *
 * @author amalasaad
 */
public class History {
    private int historyID;
    private String date;
    private String vsPlayer;
    private String status;
    private int playerId;
    public History(){   
    }
    public History(int historyID,String date,String vsPlayer,String status,int playerId ){
        this.historyID=historyID;
        this.date=date; 
        this.vsPlayer=vsPlayer;
        this.status=status;
        this.playerId=playerId;
    }

    public int getHistoryID() {
        return historyID;
    }

    public void setHistoryID(int historyID) {
        this.historyID = historyID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVsPlayer() {
        return vsPlayer;
    }

    public void setVsPlayer(String vsPlayer) {
        this.vsPlayer = vsPlayer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    
    
    
}
