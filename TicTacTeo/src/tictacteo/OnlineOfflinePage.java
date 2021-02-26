package tictacteo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.database.Player;
import model.database.PlayerModel;
import model.database.Room;
import model.database.RoomModel;
import static tictacteo.MyDashboardPage.currentPlayer;

public class OnlineOfflinePage extends AnchorPane {
    protected final Line line;
    protected final ImageView logoImageView;
    protected final DropShadow logoDropShadow;
    protected final Text gametext;
    protected final DropShadow gameTitleDropShadow;
    protected final ImageView offlineImageView;
    protected final DropShadow offlineDropShadow;
    protected final Button offlineButton;
    protected final InnerShadow offlineButtonInnerShadow;
    protected final ImageView vsImageView;
    protected final Pane onlinePane;
    protected final TextField roomTextField;
    protected final TextField enterOnlineRoomTextField;
    protected final Button onlineButton;
    protected final InnerShadow onlineButtonInnerShadow;
    protected final StackPane stackPane;
    protected final ImageView onlineImageView;
    protected final DropShadow onlineImageDropShadow;
    protected final Button backButton;
    protected final InnerShadow backButtonInnerShadow;
    protected final DropShadow anchorDropShadow;
    boolean xSelected;
    public static Player currentPlayer;
    Thread thread;
    int player1ID;
    int roomid;

    public OnlineOfflinePage(Stage primary, Player currentPlayer, boolean xSelected, Thread thread) {
        this.thread = thread;
        this.xSelected = xSelected;
        this.currentPlayer = currentPlayer;
        player1ID = currentPlayer.getUserID();

        line = new Line();
        logoImageView = new ImageView();
        logoDropShadow = new DropShadow();
        gametext = new Text();
        gameTitleDropShadow = new DropShadow();
        offlineImageView = new ImageView();
        offlineDropShadow = new DropShadow();
        offlineButton = new Button();
        offlineButtonInnerShadow = new InnerShadow();
        vsImageView = new ImageView();
        onlinePane = new Pane();
        roomTextField = new TextField();
        enterOnlineRoomTextField = new TextField();
        onlineButton = new Button();
        onlineButtonInnerShadow = new InnerShadow();
        stackPane = new StackPane();
        backButton = new Button();
        onlineImageView = new ImageView();
        onlineImageDropShadow = new DropShadow();
        backButtonInnerShadow = new InnerShadow();
        anchorDropShadow = new DropShadow();

        setDesignProperty();
        setActions(primary);

    }

    public void setDesignProperty() {
        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");
        getStyleClass().add("mainFxmlClass");

        line.setEndX(400.0);
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);
        line.setStyle("-fx-stroke: #6b6b6b;");

        logoImageView.setFitHeight(45.0);
        logoImageView.setFitWidth(45.0);
        logoImageView.setLayoutX(14.0);
        logoImageView.setLayoutY(11.0);
        logoImageView.setPickOnBounds(true);
        logoImageView.setPreserveRatio(true);
        logoImageView.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        logoImageView.setEffect(logoDropShadow);

        gametext.setFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        gametext.setLayoutX(83.0);
        gametext.setLayoutY(39.0);
        gametext.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gametext.setStrokeWidth(0.0);
        gametext.setText("Tic Tac Teo");
        gametext.setFont(new Font("System Bold", 15.0));

        gametext.setEffect(gameTitleDropShadow);

        offlineImageView.setFitHeight(106.0);
        offlineImageView.setFitWidth(141.0);
        offlineImageView.setLayoutX(329.0);
        offlineImageView.setLayoutY(198.0);
        offlineImageView.setPickOnBounds(true);
        offlineImageView.setPreserveRatio(true);
        offlineImageView.setImage(new Image(getClass().getResource("../view/images/onlineOffline/offline.jpg").toExternalForm()));

        offlineImageView.setEffect(offlineDropShadow);

        offlineButton.setLayoutX(325.0);
        offlineButton.setLayoutY(329.0);
        offlineButton.setMnemonicParsing(false);
        offlineButton.setPrefHeight(26.0);
        offlineButton.setPrefWidth(114.0);
        offlineButton.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        offlineButton.getStyleClass().add("mainFxmlClass");
        offlineButton.setText("Play Offline");
        offlineButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        offlineButton.setEffect(offlineButtonInnerShadow);

        vsImageView.setFitHeight(140.0);
        vsImageView.setFitWidth(200.0);
        vsImageView.setLayoutX(282.0);
        vsImageView.setLayoutY(-1.0);
        vsImageView.setImage(new Image(getClass().getResource("../view/images/onlineOffline/vs.png").toExternalForm()));

        onlinePane.setLayoutX(14.0);
        onlinePane.setLayoutY(155.0);
        onlinePane.setPrefHeight(200.0);
        onlinePane.setPrefWidth(200.0);
        onlinePane.setStyle("-fx-border-color: #ffffff; -fx-border-radius: 5;");

        roomTextField.setLayoutX(20.0);
        roomTextField.setLayoutY(75.0);
        roomTextField.setPrefHeight(26.0);
        roomTextField.setPrefWidth(160.0);
        roomTextField.setPromptText("Create New Rome");
        roomTextField.setStyle("-fx-border-radius: 10;");

        enterOnlineRoomTextField.setLayoutX(20.0);
        enterOnlineRoomTextField.setLayoutY(115.0);
        enterOnlineRoomTextField.setPrefHeight(26.0);
        enterOnlineRoomTextField.setPrefWidth(160.0);
        enterOnlineRoomTextField.setPromptText("Or Enter Room Name");
        enterOnlineRoomTextField.setStyle("-fx-border-radius: 10;");

        onlineButton.setLayoutX(44.0);
        onlineButton.setLayoutY(160.0);
        onlineButton.setMnemonicParsing(false);
        onlineButton.setPrefHeight(26.0);
        onlineButton.setPrefWidth(114.0);
        onlineButton.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        onlineButton.getStyleClass().add("mainFxmlClass");
        onlineButton.setText("Play Online");
        onlineButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        onlineButton.setEffect(onlineButtonInnerShadow);

        stackPane.setLayoutX(59.0);
        stackPane.setLayoutY(90.0);
        stackPane.setPrefHeight(106.0);
        stackPane.setPrefWidth(106.0);

        onlineImageView.setFitHeight(110.0);
        onlineImageView.setFitWidth(109.0);
        onlineImageView.setImage(new Image(getClass().getResource("../view/images/onlineOffline/online.jpg").toExternalForm()));

        onlineImageView.setEffect(onlineImageDropShadow);

        backButton.setLayoutX(194.0);
        backButton.setLayoutY(375.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(26.0);
        backButton.setPrefWidth(114.0);
        backButton.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        backButton.getStyleClass().add("mainFxmlClass");
        backButton.setText("Back");
        backButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        backButton.setEffect(backButtonInnerShadow);

        setEffect(anchorDropShadow);

        getChildren().add(line);
        getChildren().add(logoImageView);
        getChildren().add(gametext);
        getChildren().add(offlineImageView);
        getChildren().add(offlineButton);
        getChildren().add(vsImageView);
        onlinePane.getChildren().add(roomTextField);
        onlinePane.getChildren().add(enterOnlineRoomTextField);
        onlinePane.getChildren().add(onlineButton);
        getChildren().add(onlinePane);
        stackPane.getChildren().add(onlineImageView);
        getChildren().add(stackPane);
        getChildren().add(backButton);
    }

    public void setActions(Stage primary) {

        offlineButton.setOnAction(e
                -> primary.setScene(new Scene(new GameWithFriendPage(primary, currentPlayer, xSelected, thread)))
        );

        onlineButton.setOnAction(e -> onlinePlayDatabaseHandler(primary));

        backButton.setOnAction(e
                -> primary.setScene(new Scene(new OptionPage(primary, currentPlayer, thread)))
        );
    }

    public void onlinePlayDatabaseHandler(Stage primary) {
        if (!roomTextField.getText().isEmpty() && enterOnlineRoomTextField.getText().isEmpty()) {
            String newRoom = roomTextField.getText();
            int roomId;
            Room room = new Room();
            room.set_roomName(newRoom);
            room.setplayer1_Id(player1ID);
            Room createdRoom = RoomModel.addRoom(room);
            createdRoom.get_roomId();
            primary.setScene(new Scene(new OnLineGamePage(primary, currentPlayer, xSelected, thread,createdRoom)));
        } else if (roomTextField.getText().isEmpty() && !enterOnlineRoomTextField.getText().isEmpty()) {
            String enterExistRoom = enterOnlineRoomTextField.getText();
            Room room = RoomModel.UpdateRoom(enterExistRoom, player1ID);
            System.out.println(room.get_roomId());
            room.get_player2_Id();
            if (room == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle(" Not Found Room!");
                alert.setContentText("Room Not Exist ,Please Create One");
                alert.showAndWait();
            } else {
                primary.setScene(new Scene(new OnLineGamePage(primary, currentPlayer, xSelected, thread,room)));

            }

        } else if (roomTextField.getText().isEmpty() && enterOnlineRoomTextField.getText().isEmpty()) {
            roomTextField.setStyle("-fx-text-box-border: red ; -fx-background-color: #ffe2f5;");
            roomTextField.setPromptText("Please enter room");
            enterOnlineRoomTextField.setStyle("-fx-text-box-border: red ; -fx-background-color: #ffe2f5;");
            enterOnlineRoomTextField.setPromptText("Or please enter name");

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Room Validation");
            alert.setContentText("Pleas Create New Room Or Enter Exist Room To Play");
            alert.showAndWait();
        }

    }

}
