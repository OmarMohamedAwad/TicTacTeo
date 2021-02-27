
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
        Thread thread = new Thread();
        thread.start();

        LogInPage root = new LogInPage(primaryStage , thread);
        Scene scene = new Scene(root, 490, 417);
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.resizableProperty().setValue(false);
        primaryStage.show();
        
//        Stage secondryStage = new Stage();
//        secondryStage.setTitle("Tic Tac Toe");
//        secondryStage.setScene(new Scene(new MyHistoryPage(primary, currentPlayer)));
//        secondryStage.resizableProperty().setValue(false);
//        secondryStage.show();
    }
    
}
