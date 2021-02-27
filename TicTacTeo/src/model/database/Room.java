package model.database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3com
 */
public class Room {

    private int roomId;
    private String roomName;
    private int player1_Id;
    private int player2_Id;
    private String player1_char;

    public Room() {

    }

    public Room(int roomId, String roomName, int player1_Id, int player2_id, String player1_char) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.player1_Id = player1_Id;
        this.player2_Id = player2_Id;
        this.player1_char = player1_char;
    }
    
    public Room(int roomId, String roomName, int player1_Id, String player1_char) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.player1_Id = player1_Id;
        this.player1_char = player1_char;
    }
    
    public Room(int roomId, String roomName, int player1_Id) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.player1_Id = player1_Id;
    }

    public void set_roomId(int roomId) {
        this.roomId = roomId;

    }

    public int get_roomId() {
        return roomId;

    }

    public void set_roomName(String roomName) {
        this.roomName = roomName;
    }

    public String get_roomName() {
        return roomName;
    }

    public void setplayer1_Id(int player1_Id) {

        this.player1_Id = player1_Id;

    }

    public int get_player1_Id() {
        return player1_Id;
    }

    public void setplayer2_Id(int player2_Id) {
        this.player2_Id = player2_Id;
    }

    public int get_player2_Id() {
        return player2_Id;
    }
    
    public void setplayer1_Char(String player1_char) {
        this.player1_char = player1_char;
    }

    public String get_player1_Char() {
        return player1_char;
    }

}
