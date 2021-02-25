package model.database;

import java.sql.Date;
import javafx.beans.property.SimpleStringProperty;

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

    private SimpleStringProperty id;
    private SimpleStringProperty tableDate;
    private SimpleStringProperty tableVsPlayer;
    private SimpleStringProperty tableStatus;
    private SimpleStringProperty tablePlayerid;
    public History() {
    }

    public History(int historyID, String date, String vsPlayer, String status, int playerId) {
        this.historyID = historyID;
        this.date = date;
        this.vsPlayer = vsPlayer;
        this.status = status;
        this.playerId = playerId;
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
    public History(String tableHistoryId, String tableDate, String tableVsPlayer, String tableStatus, String tablePlayerid) {
        this.id = new SimpleStringProperty(tableHistoryId);
        this.tableDate = new SimpleStringProperty(tableDate);
        this.tableVsPlayer = new SimpleStringProperty(tableVsPlayer);
        this.tableStatus = new SimpleStringProperty(tableStatus);
        this.tablePlayerid = new SimpleStringProperty(tablePlayerid);
    }

    public String getTableDate() {
        return tableDate.get();
    }
    public void setTablDate(String tableDate) {
        this.tableDate.set(tableDate);
    }
    public String getTableVsPlayer() {
        return tableVsPlayer.get();
    }
    public String getTableStatus() {
        return tableStatus.get();
    }
    public void setTableStatus(String tableStatus) {
        this.tableStatus.set(tableStatus);
    }
    public String getTablePlayerId() {
        return tablePlayerid.get();
    }
    public void setTablePlayerId(String tablePlayerid) {
        this.tablePlayerid.set(tablePlayerid);
    }
    public String getId() {
        return id.get();
    }
    public void setId(String tableHistoryId) {
        id.set(tableHistoryId);
    }
     public void setTableVsPlayer(String tableVsPlayer) {
        this.tableVsPlayer.set(tableVsPlayer);
    }

}
