
package tictacteo;
/**
 *
 * @author Omar Awad
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacTeo extends Application{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //MyDashboardPage root = new MyDashboardPage();
        //HistoryPage root = new HistoryPage();
        //OptionPage root = new OptionPage();
        //PlayerHistoryPage root = new PlayerHistoryPage();
        LogInPage root = new  LogInPage(primaryStage);
        Scene scene = new Scene(root, 490, 417);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.resizableProperty().setValue(false);
        primaryStage.show();
    }
    
}
