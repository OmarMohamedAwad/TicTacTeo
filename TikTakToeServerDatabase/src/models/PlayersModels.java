package models;

/**
 *
 * @author amalasaad
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.Players;
import java.util.Vector;

public class PlayersModels {

    static final String DB_URL = "jdbc:mysql:localhost:3306/tiktaktoe";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "root@#123";

    public static Connection connect() throws SQLException {
        return (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    }

    public static boolean addPlayer(Players user) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users ( User_Name,Password,Score) VALUES (?,?,?)");
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, user.getScore());
            int res = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return res > 0;
        } catch (SQLException ex) {
            Logger.getLogger(PlayersModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static int loginPlayer(String username, String password) {
        try {
            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users order by Score DESC");
            boolean playerFound = false;
            int userId = 0;
            while (resultSet.next()) {
                if ((resultSet.getString("User_Name").equals(username)) && (resultSet.getString("Password").equals(password))) {
                    playerFound = true;
                    userId = resultSet.getInt("User_ID");
                    break;
                }
            }
            if (!playerFound) {
                Players newPlayer = new Players();
                newPlayer.setUserName(username);
                newPlayer.setPassword(password);
                boolean addedSucess = addPlayer(newPlayer);
                if (addedSucess) {
                    ResultSet result = statement.executeQuery("SELECT User_ID FROM users where User_Name=" + username);
                    userId = result.getInt("User_ID");
                }
            }
            resultSet.close();
            connection.close();
            return userId;
        } catch (SQLException ex) {
            Logger.getLogger(PlayersModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static boolean updatePlayerScore(int userid, String gameResult) {
        try {
            Connection connection = connect();
            int lastScore = 0;
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            if ("Win".equals(gameResult)) {
                while (resultSet.next()) {
                    if (resultSet.getInt("User_ID") == userid) {
                        lastScore = resultSet.getInt("Score");
                        break;
                    }
                }
                lastScore++;
            }
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET Score = ? where User_ID=? ");

            preparedStatement.setInt(1, lastScore);
            preparedStatement.setInt(2, userid);
            int res = preparedStatement.executeUpdate();
            resultSet.close();
            preparedStatement.close();
            connection.close();
            return res > 0;
        } catch (SQLException ex) {
            Logger.getLogger(PlayersModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static Vector<Players> gameHistory() {
        try {
            Vector<Players> tmp = new Vector<Players>();

            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT User_Name,Score FROM users order by Score DESC limit 5");
            while (resultSet.next()) {
                Players currentPlayer = new Players(resultSet.getString("User_Name"), resultSet.getInt("Score"));
                tmp.add(currentPlayer);
            }
            resultSet.close();
            connection.close();
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(PlayersModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Players playerInfo(int userId) {
        try {
            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {

                if (resultSet.getInt("User_ID") == userId) {

                    Players user = new Players(resultSet.getInt("User_ID"), resultSet.getString("User_Name"), resultSet.getString("Password"), resultSet.getInt("Score"));
                    resultSet.close();
                    connection.close();
                    return user;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlayersModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
