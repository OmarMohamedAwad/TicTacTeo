package model.database;

/**
 *
 * @author amalasaad
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;
import model.database.Player;

public class PlayerModel {
    static final String DB_URL = "jdbc:mysql://41.233.71.50:3306/tiktaktoe";

    static final String DB_USER = "player";
    static final String DB_PASSWD = "player";

   
    public static Connection connect() throws SQLException {
        return (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    }

    public static boolean addPlayer(Player user) {
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
            System.out.println(ex.getMessage());
//            Logger.getLogger(PlayersModels.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static int loginPlayer(String username, String password) {
        try {
            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users order by Score DESC");
            boolean playerFound = false;
            int userId = -1;
            while (resultSet.next()) {
                if ((resultSet.getString("User_Name").equals(username)) && (resultSet.getString("Password").equals(password))) {
                    playerFound = true;
                    userId = resultSet.getInt("User_ID");
                    break;
                }
            }
            if (!playerFound) {
                Player newPlayer = new Player();
                newPlayer.setUserName(username);
                newPlayer.setPassword(password);
                boolean addedSucess = addPlayer(newPlayer);
                if (addedSucess) {
                    ResultSet result = statement.executeQuery("SELECT User_ID FROM users where User_Name='" + username +"'");
                    while (result.next()) {
                        userId = result.getInt("User_ID");
                    }
                }
            }
            resultSet.close();
            connection.close();
            return userId;
        } catch (SQLException ex) {
            Logger.getLogger(PlayerModel.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PlayerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static Vector<Player> gameHistory() {
        try {
            Vector<Player> tmp = new Vector<Player>();

            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT User_Name,Score FROM users order by Score DESC limit 5");
            while (resultSet.next()) {
                Player currentPlayer = new Player(resultSet.getString("User_Name"), resultSet.getInt("Score"));
                tmp.add(currentPlayer);
            }
            resultSet.close();
            connection.close();
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(PlayerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Player playerInfo(int userId) {
        try {
            Connection connection = connect();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {

                if (resultSet.getInt("User_ID") == userId) {

                    Player user = new Player(resultSet.getInt("User_ID"), resultSet.getString("User_Name"), resultSet.getString("Password"), resultSet.getInt("Score"));
                    resultSet.close();
                    connection.close();
                    return user;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlayerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
