/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static model.database.PlayerModel.connect;

/**
 *
 * @author 3com
 */
public class RoomModel {

    static final String DB_URL = "jdbc:mysql://41.233.71.50:3306/tiktaktoe";
    static final String DB_USER = "player";
    static final String DB_PASSWD = "player";

    public static Connection connect() throws SQLException {
        return (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    }

    public static int addRoom(Room room) throws SQLException {
        Connection con = connect();
        PreparedStatement pst = con.prepareStatement("INSERT INTO roomCreation (roomId , roomName , player1_Id , player2_Id) values(? , ? , ? , ?)");

        pst.setInt(1, room.get_roomId());
        pst.setString(2, room.get_roomName());
        pst.setInt(1, room.get_player1_Id());
        pst.setInt(1, room.get_player2_Id());
        int res = pst.executeUpdate();
        pst.close();
        con.close();
        if (res > 0);
        
        return room.get_roomId();

    }

    public static boolean UpdateRoom(String room_Name ) throws SQLException {

        Connection con = connect();
        Statement statement = (Statement) con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM roomCreation");
            int player2_Id=0;
            while(res.next()){
            if(res.getString("roomName").equals(room_Name)){
        PreparedStatement pst = con.prepareStatement("update roomCreation set player2_Id=? where roomName = roomName");
        player2_Id = res.getInt(player2_Id);
        break;
            }
            }
        res.close();
        con.close();     
        return true;

    }
   
     public static boolean DeleteRoom(int room_Id) throws SQLException {
     Connection con = connect();
     Statement statement = (Statement) con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM roomCreation");
           int roomId=-1;
           while(res.next()){
            if(res.getInt("roomId")==(room_Id)){
    PreparedStatement pst = con.prepareStatement("DELETE FROM room ? where roomId = ?");
     room_Id = res.getInt(roomId);
            break;
            }
           }

       res.close();
        con.close();     
        return true;
}
}