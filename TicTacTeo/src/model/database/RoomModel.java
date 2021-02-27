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


    static final String DB_URL = "jdbc:mysql://127.0.0.1/tiktaktoe";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "1234abjd";

    public static Connection connect() throws SQLException {
        return (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    }

    public static Room addRoom(Room room) {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("INSERT INTO roomsCrearion ( Room_Name , Player_1_Id, Player_1_char) values( ? , ? , ? )");
            Statement statement = (Statement) con.createStatement();
            pst.setString(1, room.get_roomName());
            pst.setInt(2, room.get_player1_Id());
            pst.setString(3, room.get_player1_Char());
            int res = pst.executeUpdate();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM roomsCrearion where Room_Name='"+ room.get_roomName() +"'");

            while (resultSet.next()) {
               room.set_roomId(resultSet.getInt("Room_ID"));
               room.set_roomName(resultSet.getString("Room_Name"));
               room.setplayer1_Id(resultSet.getInt("Player_1_Id"));
               room.setplayer1_Char(resultSet.getString("Player_1_char"));
            }
            pst.close();
            con.close();
            return room;
        } catch (SQLException ex) {
            System.out.println("You Should Enter Unique Name");
        }
        return null;
    }

    public static Room UpdateRoom(String room_Name, int player2_Id) {
        int roomId = 0;
        Room room = null;
        try {

            Connection con = connect();
            Statement statement = (Statement) con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM roomsCrearion");
            while (res.next()) {
                if (res.getString("Room_Name").equals(room_Name)) {
                    roomId = res.getInt("Room_ID");
                    room = new Room(roomId, res.getString("Room_Name"), res.getInt("Player_1_Id"), res.getString("Player_1_char"));
                    System.out.println(room.get_roomName());

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
            return room;
        } catch (SQLException ex) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return room;

    }

    public static int showRoom(int roomId) {
        //Room room = null;
        try {

            Connection con = connect();
            Statement statement = (Statement) con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM roomsCrearion where Room_ID ="+roomId);
            
            int id = -1;
            while (res.next()) {
                Room room = new Room(roomId, res.getString("Room_Name"), res.getInt("Player_1_Id"), res.getInt("Player_2_Id"), res.getString("Player_1_char"));
                if(res.getInt("Player_2_Id") != 0)
                    id = res.getInt("Player_2_Id");
            }
            res.close();
            con.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

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
