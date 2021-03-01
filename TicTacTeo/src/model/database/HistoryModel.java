package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.database.PlayerModel;

/**
 *
 * @author amalasaad
 */
public class HistoryModel {

    static final String DB_URL = "jdbc:mysql://omarawadtictacteo.hopto.org:3306/tiktaktoe";
    static final String DB_USER = "player";
    static final String DB_PASSWD = "player";

    public static Connection connect() throws SQLException {
        return (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    }

    public static boolean addHistory(History userHistory) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO history (Date,Vs_Player,Status,Player_ID) VALUES (now(),?,?,?)");
//            preparedStatement.setString(1, "now()");
            preparedStatement.setString(1, userHistory.getVsPlayer());
            preparedStatement.setString(2, userHistory.getStatus());
            preparedStatement.setInt(3, userHistory.getPlayerId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PlayerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static Vector<History> userHistory(int playerId) {
        try {
            Vector<History> tmp = new Vector<History>();

            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM history where Player_ID=" + playerId);

            while (resultSet.next()) {
                History currentHistory = new History(resultSet.getInt("History_ID"), resultSet.getString("Date"), resultSet.getString("Vs_Player"), resultSet.getString("Status"), resultSet.getInt("Player_ID"));
                tmp.add(currentHistory);
            }

            resultSet.close();
            connection.close();
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(PlayerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
