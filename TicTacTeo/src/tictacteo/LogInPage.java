package tictacteo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.database.Player;
import model.database.PlayerModel;

public class LogInPage extends Pane {

    protected final Rectangle recrangleSeparator;
    protected final Label lableGame;
    protected final Rectangle logInFormContainer;
    protected final Lighting lighting;
    protected final Label labelReady;
    protected final Label labelLogoContainer;
    protected final TextField playerNameTextField;
    protected final DropShadow dropShadow;
    protected final PasswordField playerPasswordTextPassword;
    protected final DropShadow dropShadow0;
    protected final Button buttonGo;
    protected final InnerShadow innerShadow;
    protected final Label label2;
    protected final ImageView welcomImage;
    protected final DropShadow dropShadow1;
    protected final Label label3;
    protected final ImageView joisticImage;
    protected final DropShadow dropShadow2;
    protected final ImageView lockImage;
    protected final DropShadow dropShadow3;
    protected final ImageView logoImage;
    protected final DropShadow dropShadow4;
    protected final DropShadow dropShadow5;

    public LogInPage(Stage primary) {

        recrangleSeparator = new Rectangle();
        lableGame = new Label();
        logInFormContainer = new Rectangle();
        lighting = new Lighting();
        labelReady = new Label();
        labelLogoContainer = new Label();
        playerNameTextField = new TextField();
        dropShadow = new DropShadow();
        playerPasswordTextPassword = new PasswordField();
        dropShadow0 = new DropShadow();
        ////////////////////////////////////ADD ACTION TO BUTTON GO TO GO TO DASHBOARD\\\\\\\\\\\\\\\\\\\\\\\\\\
        buttonGo = new Button();
        buttonGo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (!playerNameTextField.getText().isEmpty() && !playerPasswordTextPassword.getText().isEmpty()) {
                    String name = playerNameTextField.getText();
                    String password = playerPasswordTextPassword.getText();
                    int playerId = PlayerModel.loginPlayer(name, password);
                    if (playerId > 0 ) {
                        System.out.println("THIS IS positive case CASE ");
                        primary.setScene(new Scene(new MyDashboardPage(primary, playerId)));
                    } else if (playerId == -1) {
                        System.out.println("Please Enter Valid Password or Unique User Name");
                        
                    }
                }
            }
        });
        innerShadow = new InnerShadow();
        label2 = new Label();
        welcomImage = new ImageView();
        dropShadow1 = new DropShadow();
        label3 = new Label();
        joisticImage = new ImageView();
        dropShadow2 = new DropShadow();
        lockImage = new ImageView();
        dropShadow3 = new DropShadow();
        logoImage = new ImageView();
        dropShadow4 = new DropShadow();
        dropShadow5 = new DropShadow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(417.0);
        setPrefWidth(490.0);
        setStyle("-fx-background-color: #d4d6d8;");

        recrangleSeparator.setArcHeight(5.0);
        recrangleSeparator.setArcWidth(5.0);
        recrangleSeparator.setFill(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        recrangleSeparator.setHeight(3.0);
        recrangleSeparator.setLayoutY(65.0);
        recrangleSeparator.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        recrangleSeparator.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        recrangleSeparator.setStrokeWidth(2.0);
        recrangleSeparator.setWidth(490.0);

        lableGame.setLayoutX(213.0);
        lableGame.setLayoutY(79.0);
        lableGame.setStyle("-fx-font-weight: bold;");
        lableGame.setText("Games");
        lableGame.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        lableGame.setTextFill(javafx.scene.paint.Color.valueOf("#c31d1ded"));
        lableGame.setFont(new Font("SansSerif Regular", 23.0));

        logInFormContainer.setArcHeight(32.0);
        logInFormContainer.setArcWidth(32.0);
        logInFormContainer.setFill(javafx.scene.paint.Color.valueOf("#454e57"));
        logInFormContainer.setHeight(233.0);
        logInFormContainer.setLayoutX(137.0);
        logInFormContainer.setLayoutY(118.0);
        logInFormContainer.setStroke(javafx.scene.paint.Color.valueOf("#615f5f"));
        logInFormContainer.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        logInFormContainer.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        logInFormContainer.setWidth(248.0);

        //lighting.setBumpInput(javafx.scene.effect.Effect.$null);
        logInFormContainer.setEffect(lighting);

        labelReady.setLayoutX(227.0);
        labelReady.setLayoutY(140.0);
        labelReady.setStyle("-fx-font-weight: bold;");
        labelReady.setText("Ready!");
        labelReady.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        labelReady.setTextFill(javafx.scene.paint.Color.WHITE);
        labelReady.setFont(new Font(14.0));

        labelLogoContainer.setLayoutX(14.0);
        labelLogoContainer.setPrefHeight(45.0);
        labelLogoContainer.setPrefWidth(45.0);
        labelLogoContainer.setStyle("-fx-background-image: url(../view/images/login/logo.jpg);");

        playerNameTextField.setLayoutX(189.0);
        playerNameTextField.setLayoutY(181.0);
        playerNameTextField.setPrefHeight(25.0);
        playerNameTextField.setPrefWidth(160.0);
        playerNameTextField.setPromptText("Enter your name");

        playerNameTextField.setEffect(dropShadow);

        playerPasswordTextPassword.setLayoutX(189.0);
        playerPasswordTextPassword.setLayoutY(242.0);
        playerPasswordTextPassword.setPrefHeight(25.0);
        playerPasswordTextPassword.setPrefWidth(160.0);
        playerPasswordTextPassword.setPromptText("Enter Password");

        playerPasswordTextPassword.setEffect(dropShadow0);

        buttonGo.setLayoutX(210.0);
        buttonGo.setLayoutY(295.0);
        buttonGo.setMnemonicParsing(false);
        buttonGo.setPrefHeight(17.0);
        buttonGo.setPrefWidth(92.0);
        buttonGo.setStyle("-fx-background-color: #227fe3; -fx-background-radius: 15;");
        buttonGo.setText("Go");
        buttonGo.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        buttonGo.setTextFill(javafx.scene.paint.Color.WHITE);

        buttonGo.setEffect(innerShadow);

        label2.setLayoutX(203.0);
        label2.setLayoutY(18.0);
        label2.setPrefHeight(41.0);
        label2.setPrefWidth(218.0);

        welcomImage.setFitHeight(41.0);
        welcomImage.setFitWidth(206.0);
        welcomImage.setLayoutX(160.0);
        welcomImage.setLayoutY(13.0);
        welcomImage.setImage(new Image(getClass().getResource("../view/images/login/ClipartKey_97962.png").toExternalForm()));

        welcomImage.setEffect(dropShadow1);

        label3.setLayoutX(197.0);
        label3.setLayoutY(185.0);
        label3.setPrefHeight(17.0);
        label3.setPrefWidth(29.0);

        joisticImage.setFitHeight(27.0);
        joisticImage.setFitWidth(29.0);
        joisticImage.setLayoutX(146.0);
        joisticImage.setLayoutY(180.0);
        joisticImage.setImage(new Image(getClass().getResource("../view/images/login/joistic.png").toExternalForm()));

        joisticImage.setEffect(dropShadow2);

        lockImage.setFitHeight(20.0);
        lockImage.setFitWidth(22.0);
        lockImage.setLayoutX(150.0);
        lockImage.setLayoutY(245.0);
        lockImage.setImage(new Image(getClass().getResource("../view/images/login/lock.png").toExternalForm()));

        lockImage.setEffect(dropShadow3);

        logoImage.setFitHeight(45.0);
        logoImage.setFitWidth(45.0);
        logoImage.setLayoutX(14.0);
        logoImage.setLayoutY(11.0);
        logoImage.setImage(new Image(getClass().getResource("../view/images/logo.jpg").toExternalForm()));

        logoImage.setEffect(dropShadow4);

        setEffect(dropShadow5);

        getChildren().add(recrangleSeparator);
        getChildren().add(lableGame);
        getChildren().add(logInFormContainer);
        getChildren().add(labelReady);
        getChildren().add(labelLogoContainer);
        getChildren().add(playerNameTextField);
        getChildren().add(playerPasswordTextPassword);
        getChildren().add(buttonGo);
        getChildren().add(label2);
        getChildren().add(welcomImage);
        getChildren().add(label3);
        getChildren().add(joisticImage);
        getChildren().add(lockImage);
        getChildren().add(logoImage);

    }
}
