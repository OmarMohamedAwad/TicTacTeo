
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
        FXMLOptionpage root = new FXMLOptionpage();
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
