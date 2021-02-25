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
        PreparedStatement pst = con.prepareStatement("INSERT INTO roomsCrearion ( Room_ID , Room_Name , Player_1_Id ) values(? , ? , ? )");

        pst.setInt(1, room.get_roomId());
        pst.setString(2, room.get_roomName());
        pst.setInt(1, room.get_player1_Id());
        int res = pst.executeUpdate();
        pst.close();
        con.close();
        if (res > 0);

        return room.get_roomId();

    }

    public static int UpdateRoom(String room_Name, int player2_Id) throws SQLException {
        int roomId = 0;
        Connection con = connect();
        Statement statement = (Statement) con.createStatement();
        ResultSet res = statement.executeQuery("SELECT * FROM roomsCrearion");

        while (res.next()) {
            if (res.getString("Room_Name").equals(room_Name)) {
                res.getInt("Room_ID");
                PreparedStatement pst = con.prepareStatement("update roomsCrearion set player2_Id=? where Room_Name = roomName");

                break;
            }
        }
        res.close();
        con.close();
        return roomId;

    }

    public static boolean DeleteRoom(int room_Id) throws SQLException {
        boolean checkDeleted = false;
        try (Connection con = connect()) {
            Statement statement = (Statement) con.createStatement();
            try (ResultSet res = statement.executeQuery("SELECT * FROM roomsCrearion")) {
                while (res.next()) {
                    if (res.getInt("Room_ID") == (room_Id)) {
                        PreparedStatement pst = con.prepareStatement("DELETE FROM roomsCrearion where Room_ID = ?");
                        pst.setInt(1, room_Id);
                        checkDeleted = true;
                        break;
                    }
                }
            }
        }
        return checkDeleted ;
    }
}
