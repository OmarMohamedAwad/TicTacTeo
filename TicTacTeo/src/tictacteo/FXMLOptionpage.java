package tictacteo;

import java.awt.Window;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javax.swing.ButtonGroup;

public class FXMLOptionpage extends AnchorPane {

    protected final Line line;
    protected final ImageView TicTacTeo;
    protected final ImageView Computer;
    protected final ImageView Friend;
    protected final ImageView X;
    protected final RadioButton ComputerRB;
    protected final RadioButton FriendRB;
    protected final RadioButton XRB;
    protected final RadioButton ORB;
    protected final ImageView O;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Button PlayNow;

    public FXMLOptionpage() {

        line = new Line();
        TicTacTeo = new ImageView();
        Computer = new ImageView();
        Friend = new ImageView();
        X = new ImageView();
        ComputerRB = new RadioButton();
        FriendRB = new RadioButton();
        XRB = new RadioButton();
        ORB = new RadioButton();
        O = new ImageView();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        PlayNow = new Button();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: #343F4B;");
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/view/styles/fxml.css");
        
        line.setEndX(500.0);
        line.setLayoutX(101.0);
        line.setLayoutY(75.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#8492a6"));

        TicTacTeo.setFitHeight(59.0);
        TicTacTeo.setFitWidth(87.0);
        TicTacTeo.setLayoutX(14.0);
        TicTacTeo.setLayoutY(11.0);
        TicTacTeo.setPickOnBounds(true);
        TicTacTeo.setPreserveRatio(true);
        TicTacTeo.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        Computer.setFitHeight(106.0);
        Computer.setFitWidth(141.0);
        Computer.setLayoutX(139.0);
        Computer.setLayoutY(86.0);
        Computer.setPickOnBounds(true);
        Computer.setPreserveRatio(true);
        Computer.setImage(new Image(getClass().getResource("../view/images/options/computer.jpg").toExternalForm()));

        Friend.setFitHeight(106.0);
        Friend.setFitWidth(141.0);
        Friend.setLayoutX(376.0);
        Friend.setLayoutY(86.0);
        Friend.setPickOnBounds(true);
        Friend.setPreserveRatio(true);
        Friend.setImage(new Image(getClass().getResource("../view/images/options/frind.jpg").toExternalForm()));

        X.setFitHeight(106.0);
        X.setFitWidth(141.0);
        X.setLayoutX(158.0);
        X.setLayoutY(236.0);
        X.setPickOnBounds(true);
        X.setPreserveRatio(true);
        X.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));
   
        ComputerRB.setLayoutX(164.0);
        ComputerRB.setLayoutY(200.0);
        ComputerRB.setMnemonicParsing(false);
        ComputerRB.setStyle("-fx-text-fill: wheate;");
        ComputerRB.setText("Computer");
        ComputerRB.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));

        FriendRB.setLayoutX(400.0);
        FriendRB.setLayoutY(200.0);
        FriendRB.setMnemonicParsing(false);
        FriendRB.setStyle("-fx-text-fill: wheate;");
        FriendRB.setText("Friend");
        FriendRB.setTextFill(javafx.scene.paint.Color.valueOf("#fcf9f9"));
     
        XRB.setLayoutX(186.0);
        XRB.setLayoutY(343.0);
        XRB.setMnemonicParsing(false);
        XRB.setStyle("-fx-text-fill: wheate;");
        XRB.setText("X");
        XRB.setTextFill(javafx.scene.paint.Color.valueOf("#f8f6f6"));
        XRB.setFont(new Font(18.0));

        ORB.setLayoutX(411.0);
        ORB.setLayoutY(343.0);
        ORB.setMnemonicParsing(false);
        ORB.setStyle("-fx-text-fill: wheate;");
        ORB.setText("O");
        ORB.setTextFill(javafx.scene.paint.Color.valueOf("#f8f6f6"));
        ORB.setFont(new Font(18.0));
  
        
        O.setFitHeight(106.0);
        O.setFitWidth(141.0);
        O.setLayoutX(376.0);
        O.setLayoutY(236.0);
        O.setPickOnBounds(true);
        O.setPreserveRatio(true);
        O.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        text.setLayoutX(94.0);
        text.setLayoutY(44.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Teo");
        text.setFont(new Font(15.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        text0.setLayoutX(14.0);
        text0.setLayoutY(133.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(" Play Against :");
        text0.setWrappingWidth(106.00000024214387);
        text0.setFont(new Font(17.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        text1.setLayoutX(11.0);
        text1.setLayoutY(285.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Your Charcter :");
        text1.setFont(new Font(17.0));

        PlayNow.setLayoutX(493.0);
        PlayNow.setLayoutY(357.0);
        PlayNow.setMnemonicParsing(false);
        PlayNow.setPrefHeight(32.0);
        PlayNow.setPrefWidth(95.0);
        PlayNow.setStyle("-fx-border-radius: 100px;");
        PlayNow.setText("Play Now");
        PlayNow.setFont(new Font(16.0));
        PlayNow.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent ev){
     //   FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sedondFXML.fxml"));
     // test
     //jhghg
        }
         });
    
        
        getChildren().add(line);
        getChildren().add(TicTacTeo);
        getChildren().add(Computer);
        getChildren().add(Friend);
        getChildren().add(X);
        getChildren().add(ComputerRB);
        getChildren().add(FriendRB);
        getChildren().add(XRB);
        getChildren().add(ORB);
        getChildren().add(O);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(PlayNow);

    }

    private void setOnAction(EventHandler<ActionEvent> eventHandler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
