package tictacteo;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyDashboardGUI extends AnchorPane {

    protected final StackPane logoStackPane;
    protected final ImageView logoImageView;
    protected final Circle circle;
    protected final Text firstCharText;
    protected final Text userNameText;
    protected final Line line;
    protected final StackPane gameStackPane0;
    protected final ImageView gameImageView;
    protected final Button playbutton;
    protected final StackPane topScoreStackPane;
    protected final ImageView topScoreImageView;
    protected final Button topScoreButton;
    protected final StackPane myHistoryStackPane;
    protected final ImageView myHistoryImageView;
    protected final Button myHistoryButton;
    protected final Rectangle rectangle;
    protected final ImageView starImageView;
    protected final Text scoreText;
    protected final Text scoreValueText;

    public MyDashboardGUI(Stage stage) {

        logoStackPane = new StackPane();
        logoImageView = new ImageView();
        circle = new Circle();
        firstCharText = new Text();
        userNameText = new Text();
        line = new Line();
        gameStackPane0 = new StackPane();
        gameImageView = new ImageView();
        playbutton = new Button();
        topScoreStackPane = new StackPane();
        topScoreImageView = new ImageView();
        topScoreButton = new Button();
        myHistoryStackPane = new StackPane();
        myHistoryImageView = new ImageView();
        myHistoryButton = new Button();
        rectangle = new Rectangle();
        starImageView = new ImageView();
        scoreText = new Text();
        scoreValueText = new Text();

        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");
        getStylesheets().add("/view/styles/MyDashboard.css");

        AnchorPane.setLeftAnchor(logoStackPane, 15.0);
        AnchorPane.setTopAnchor(logoStackPane, 15.0);
        logoStackPane.setLayoutX(14.0);
        logoStackPane.setLayoutY(11.0);
        logoStackPane.setPrefHeight(47.0);
        logoStackPane.setPrefWidth(46.0);
        logoStackPane.getStyleClass().add("logo-containers");

        logoImageView.setFitHeight(45.0);
        logoImageView.setFitWidth(45.0);
        logoImageView.setPickOnBounds(true);
        logoImageView.setPreserveRatio(true);
        logoImageView.getStyleClass().add("logo");
        logoImageView.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        AnchorPane.setRightAnchor(circle, 15.0);
        AnchorPane.setTopAnchor(circle, 25.0);
        circle.setFill(javafx.scene.paint.Color.valueOf("#006fb2"));
        circle.setLayoutX(550.0);
        circle.setLayoutY(40.0);
        circle.setRadius(15.0);
        circle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        AnchorPane.setRightAnchor(firstCharText, 26.0);
        firstCharText.setFill(javafx.scene.paint.Color.valueOf("#f0eded"));
        firstCharText.setLayoutX(566.0);
        firstCharText.setLayoutY(45.0);
        firstCharText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstCharText.setStrokeWidth(0.0);
        firstCharText.setText("U");

        AnchorPane.setRightAnchor(userNameText, 65.0);
        userNameText.setFill(javafx.scene.paint.Color.WHITE);
        userNameText.setLayoutX(480.0);
        userNameText.setLayoutY(45.0);
        userNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameText.setStrokeWidth(0.0);
        userNameText.setText("User Name");

        AnchorPane.setLeftAnchor(line, 0.0);
        AnchorPane.setRightAnchor(line, 0.0);
        AnchorPane.setTopAnchor(line, 75.0);
        line.setEndX(500.0);
        line.setLayoutX(115.5);
        line.setLayoutY(68.0);
        line.setStartX(-115.0);
        line.setStyle("-fx-stroke: #ffffff;");

        gameStackPane0.setLayoutX(66.0);
        gameStackPane0.setLayoutY(151.0);
        gameStackPane0.setPrefHeight(113.0);
        gameStackPane0.setPrefWidth(114.0);
        gameStackPane0.getStyleClass().add("game-container");

        gameImageView.setFitHeight(106.0);
        gameImageView.setFitWidth(106.0);
        gameImageView.getStyleClass().add("game-image");
        gameImageView.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        playbutton.setLayoutX(67.0);
        playbutton.setLayoutY(285.0);
        playbutton.setMnemonicParsing(false);
        playbutton.setPrefHeight(26.0);
        playbutton.setPrefWidth(114.0);
        playbutton.getStyleClass().add("play-btn");
        playbutton.setText("Play");
        playbutton.setTextFill(javafx.scene.paint.Color.WHITE);

        topScoreStackPane.setLayoutX(251.0);
        topScoreStackPane.setLayoutY(151.0);
        topScoreStackPane.setPrefHeight(113.0);
        topScoreStackPane.setPrefWidth(114.0);
        topScoreStackPane.getStyleClass().add("topscore-container");

        topScoreImageView.setFitHeight(107.0);
        topScoreImageView.setFitWidth(96.0);
        topScoreImageView.getStyleClass().add("top-score-image");
        topScoreImageView.setImage(new Image(getClass().getResource("../view/images/myDashboard/top-score.png").toExternalForm()));

        topScoreButton.setLayoutX(252.0);
        topScoreButton.setLayoutY(285.0);
        topScoreButton.setMnemonicParsing(false);
        topScoreButton.setPrefHeight(26.0);
        topScoreButton.setPrefWidth(114.0);
        topScoreButton.getStyleClass().add("play-btn");
        topScoreButton.setText("Top Score");
        topScoreButton.setTextFill(javafx.scene.paint.Color.WHITE);

        myHistoryStackPane.setLayoutX(437.0);
        myHistoryStackPane.setLayoutY(151.0);
        myHistoryStackPane.setPrefHeight(114.0);
        myHistoryStackPane.setPrefWidth(111.0);
        myHistoryStackPane.getStyleClass().add("topscore-container");

        myHistoryImageView.setFitHeight(104.0);
        myHistoryImageView.setFitWidth(104.0);
        myHistoryImageView.getStyleClass().add("history-image");
        myHistoryImageView.setImage(new Image(getClass().getResource("../view/images/myDashboard/my-history.jpg").toExternalForm()));

        myHistoryButton.setLayoutX(437.0);
        myHistoryButton.setLayoutY(285.0);
        myHistoryButton.setMnemonicParsing(false);
        myHistoryButton.setPrefHeight(26.0);
        myHistoryButton.setPrefWidth(114.0);
        myHistoryButton.getStyleClass().add("play-btn");
        myHistoryButton.setText("My History");
        myHistoryButton.setTextFill(javafx.scene.paint.Color.WHITE);

        AnchorPane.setBottomAnchor(rectangle, 0.0);
        AnchorPane.setLeftAnchor(rectangle, 0.0);
        AnchorPane.setRightAnchor(rectangle, 0.0);
        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#006fb2"));
        rectangle.setHeight(24.0);
        rectangle.setLayoutX(-7.0);
        rectangle.setLayoutY(392.0);
        rectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(616.0);

        AnchorPane.setLeftAnchor(starImageView, 70.0);
        starImageView.setFitHeight(25.0);
        starImageView.setFitWidth(25.0);
        starImageView.setLayoutX(71.0);
        starImageView.setLayoutY(28.0);
        starImageView.setImage(new Image(getClass().getResource("../view/images/myDashboard/star.png").toExternalForm()));

        AnchorPane.setLeftAnchor(scoreText, 100.0);
        scoreText.setFill(javafx.scene.paint.Color.WHITE);
        scoreText.setLayoutX(101.0);
        scoreText.setLayoutY(44.0);
        scoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreText.setStrokeWidth(0.0);
        scoreText.setText("Score: ");

        AnchorPane.setLeftAnchor(scoreValueText, 140.0);
        scoreValueText.setFill(javafx.scene.paint.Color.WHITE);
        scoreValueText.setLayoutX(145.0);
        scoreValueText.setLayoutY(45.0);
        scoreValueText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreValueText.setStrokeWidth(0.0);
        scoreValueText.setText("80");

        logoStackPane.getChildren().add(logoImageView);
        getChildren().add(logoStackPane);
        getChildren().add(circle);
        getChildren().add(firstCharText);
        getChildren().add(userNameText);
        getChildren().add(line);
        gameStackPane0.getChildren().add(gameImageView);
        getChildren().add(gameStackPane0);
        getChildren().add(playbutton);
        topScoreStackPane.getChildren().add(topScoreImageView);
        getChildren().add(topScoreStackPane);
        getChildren().add(topScoreButton);
        myHistoryStackPane.getChildren().add(myHistoryImageView);
        getChildren().add(myHistoryStackPane);
        getChildren().add(myHistoryButton);
        getChildren().add(rectangle);
        getChildren().add(starImageView);
        getChildren().add(scoreText);
        getChildren().add(scoreValueText);

    }
}
