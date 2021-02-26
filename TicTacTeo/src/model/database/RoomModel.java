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
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.database.PlayerModel.connect;

/**
 *
 * @author 3com
 */
public class RoomModel {

    static final String DB_URL = "jdbc:mysql://localhost:3306/tiktaktoe";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "root@#123";

    public static Connection connect() throws SQLException {
        return (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    }

    public static int addRoom(Room room) {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("INSERT INTO roomsCrearion ( Room_Name , Player_1_Id ) values( ? , ? )");
            pst.setString(1, room.get_roomName());
            pst.setInt(2, room.get_player1_Id());
            int res = pst.executeUpdate();
            pst.close();
            con.close();
            if (res > 0);
            return room.get_roomId();
        } catch (SQLException ex) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static int UpdateRoom(String room_Name, int player2_Id) {
        int roomId = 0;
        try {

            Connection con = connect();
            Statement statement = (Statement) con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM roomsCrearion");
            while (res.next()) {
                if (res.getString("Room_Name").equals(room_Name)) {
                    roomId = res.getInt("Room_ID");
                    break;
                }
            }
            PreparedStatement pst = con.prepareStatement("UPDATE roomsCrearion SET Player_2_Id = ? where Room_Name = ?");
            pst.setInt(1, player2_Id);
            pst.setString(2, room_Name);
            pst.executeUpdate();
            res.close();
            pst.close();
            con.close();
            return roomId;
        } catch (SQLException ex) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roomId;

    }

    public static boolean DeleteRoom(int room_Id) {
        boolean checkDeleted = false;
        try {
            Connection con = connect();
            Statement statement = (Statement) con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM roomsCrearion");
            while (res.next()) {
                if (res.getInt("Room_ID") == (room_Id)) {

                    checkDeleted = true;
                    break;
                }
            }
            PreparedStatement pst = con.prepareStatement("DELETE FROM roomsCrearion where Room_ID = ?");
            pst.setInt(1, room_Id);
            pst.executeUpdate();
            res.close();
            pst.close();
            con.close();

            return checkDeleted;
        } catch (SQLException ex) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkDeleted;
    }
}
