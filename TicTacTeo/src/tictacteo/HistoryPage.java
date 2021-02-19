package tictacteo;

import controller.Players;
import java.util.Iterator;
import java.util.Vector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import models.PlayersModels;

public class HistoryPage extends Pane {

    protected final Rectangle separatorRectangle;
    protected final Label gameNameLabelView;
    protected final DropShadow dropShadow;
    protected final Button backButton;
    protected final InnerShadow innerShadow;
    protected final Label gameProgressLabelView;
    protected final ImageView progrssImageView;
    protected final ImageView gameLogoImagView;
    protected final DropShadow dropShadow0;
    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane;
    protected final TableView topScoreTable;
    protected final TableColumn playerNumberColumn;
    protected final TableColumn playerNameColumn;
    protected final TableColumn playerScoreColumn;
    protected final DropShadow dropShadow1;
    protected final DropShadow dropShadow2;
    protected final DropShadow dropShadow3;

    public HistoryPage(Stage primary) {

        separatorRectangle = new Rectangle();
        gameNameLabelView = new Label();
        dropShadow = new DropShadow();
        /////////////////////////////////Back Again to Dahboard\\\\\\\\\\\\\\\\
        backButton = new Button();
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                primary.setScene(new Scene(new MyDashboardPage(primary)));
            }
        });
        innerShadow = new InnerShadow();
        gameProgressLabelView = new Label();
        progrssImageView = new ImageView();
        gameLogoImagView = new ImageView();
        dropShadow0 = new DropShadow();
        scrollPane = new ScrollPane();
        anchorPane = new AnchorPane();
        topScoreTable = new TableView();
        playerNumberColumn = new TableColumn();
        playerNameColumn = new TableColumn();
        playerScoreColumn = new TableColumn();
        dropShadow1 = new DropShadow();
        dropShadow2 = new DropShadow();
        dropShadow3 = new DropShadow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B; -fx-background-radius: 5;");

        separatorRectangle.setArcHeight(5.0);
        separatorRectangle.setArcWidth(5.0);
        separatorRectangle.setFill(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        separatorRectangle.setHeight(2.0);
        separatorRectangle.setLayoutX(-1.0);
        separatorRectangle.setLayoutY(67.0);
        separatorRectangle.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        separatorRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        separatorRectangle.setWidth(500.0);

        gameNameLabelView.setLayoutX(84.0);
        gameNameLabelView.setLayoutY(25.0);
        gameNameLabelView.setText("Tic Tac Toe");
        gameNameLabelView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameNameLabelView.setTextFill(javafx.scene.paint.Color.valueOf("#ffffffed"));
        gameNameLabelView.setFont(new Font("SansSerif Bold", 15.0));

        gameNameLabelView.setEffect(dropShadow);

        backButton.setLayoutX(193.0);
        backButton.setLayoutY(360.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(26.0);
        backButton.setPrefWidth(114.0);
        backButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15;");
        backButton.setText("Back");
        backButton.setTextFill(javafx.scene.paint.Color.WHITE);

        backButton.setEffect(innerShadow);

        gameProgressLabelView.setLayoutX(217.0);
        gameProgressLabelView.setLayoutY(91.0);
        gameProgressLabelView.setStyle("-fx-font-weight: bold; -fx-font-family: sans serif;");
        gameProgressLabelView.setText("Game Progress");
        gameProgressLabelView.setTextFill(javafx.scene.paint.Color.WHITE);
        gameProgressLabelView.setFont(new Font("System Bold", 18.0));

        progrssImageView.setFitHeight(30.0);
        progrssImageView.setFitWidth(35.0);
        progrssImageView.setLayoutX(169.0);
        progrssImageView.setLayoutY(90.0);
        progrssImageView.setImage(new Image(getClass().getResource("../view/images/myHistory/progress.PNG").toExternalForm()));

        gameLogoImagView.setFitHeight(45.0);
        gameLogoImagView.setFitWidth(45.0);
        gameLogoImagView.setLayoutX(14.0);
        gameLogoImagView.setLayoutY(11.0);
        gameLogoImagView.setImage(new Image(getClass().getResource("../view/images/myHistory/tic-tac-toe-game.jpg").toExternalForm()));

        gameLogoImagView.setEffect(dropShadow0);

        scrollPane.setLayoutX(60.0);
        scrollPane.setLayoutY(132.0);
        scrollPane.setPrefHeight(206.0);
        scrollPane.setPrefWidth(378.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(380.0);

        topScoreTable.setLayoutX(1.0);
        topScoreTable.setPrefHeight(206.0);
        topScoreTable.setPrefWidth(378.0);

        playerNumberColumn.setPrefWidth(65.0);
        playerNumberColumn.setText("#");

        playerNameColumn.setPrefWidth(158.0);
        playerNameColumn.setText("Player Name");

        playerScoreColumn.setPrefWidth(156.0);
        playerScoreColumn.setText("Score");

        topScoreTable.setEffect(dropShadow1);
        scrollPane.setContent(anchorPane);

        dropShadow2.setColor(javafx.scene.paint.Color.valueOf("#c95c0e"));
        scrollPane.setEffect(dropShadow2);

        setEffect(dropShadow3);

        getChildren().add(separatorRectangle);
        getChildren().add(gameNameLabelView);
        getChildren().add(backButton);
        getChildren().add(gameProgressLabelView);
        getChildren().add(progrssImageView);
        getChildren().add(gameLogoImagView);
        topScoreTable.getColumns().add(playerNumberColumn);
        topScoreTable.getColumns().add(playerNameColumn);
        topScoreTable.getColumns().add(playerScoreColumn);
        anchorPane.getChildren().add(topScoreTable);
        getChildren().add(scrollPane);

    }
}
