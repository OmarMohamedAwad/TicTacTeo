package tictacteo;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class MyDashboardPage extends AnchorPane {

    protected final StackPane logoStackPane;
    protected final ImageView logoImageView;
    protected final DropShadow logoDropShadow;
    protected final Circle circle;
    protected final InnerShadow circleInnerShadow;
    protected final Text firstCharText;
    protected final Text playerNameText;
    protected final Line line;
    protected final StackPane gameStackPane;
    protected final ImageView gameImageView;
    protected final DropShadow gameDropShadow;
    protected final Button playButton;
    protected final InnerShadow playButtonInnerShadow;
    protected final StackPane topScoreStackPane;
    protected final ImageView topScoreImageView;
    protected final DropShadow topScoreDropShadow;
    protected final Button topScoreButton;
    protected final InnerShadow topScoreinnerShadow;
    protected final StackPane myHistoryStackPane;
    protected final ImageView myHistoryImageView;
    protected final DropShadow myHistoryDropShadow;
    protected final Button myHistoryButton;
    protected final InnerShadow myHistoryInnerShadow;
    protected final Rectangle rectangle;
    protected final InnerShadow rectangleInnerShadow;
    protected final ImageView starImageView;
    protected final Text scoreText;
    protected final Text scoreValueText;
    protected final DropShadow anchorDropShadow;

    public MyDashboardPage() {

        logoStackPane = new StackPane();
        logoImageView = new ImageView();
        logoDropShadow = new DropShadow();
        circle = new Circle();
        circleInnerShadow = new InnerShadow();
        firstCharText = new Text();
        playerNameText = new Text();
        line = new Line();
        gameStackPane = new StackPane();
        gameImageView = new ImageView();
        gameDropShadow = new DropShadow();
        playButton = new Button();
        playButtonInnerShadow = new InnerShadow();
        topScoreStackPane = new StackPane();
        topScoreImageView = new ImageView();
        topScoreDropShadow = new DropShadow();
        topScoreButton = new Button();
        topScoreinnerShadow = new InnerShadow();
        myHistoryStackPane = new StackPane();
        myHistoryImageView = new ImageView();
        myHistoryDropShadow = new DropShadow();
        myHistoryButton = new Button();
        myHistoryInnerShadow = new InnerShadow();
        rectangle = new Rectangle();
        rectangleInnerShadow = new InnerShadow();
        starImageView = new ImageView();
        scoreText = new Text();
        scoreValueText = new Text();
        anchorDropShadow = new DropShadow();

        setMinHeight(USE_PREF_SIZE);
        setPrefHeight(417.0);
        setPrefWidth(504.0);
        setStyle("-fx-background-color: #343F4B;");
        getStylesheets().add("/view/fxm/../styles/MyDashboard.css");

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

        logoImageView.setEffect(logoDropShadow);

        AnchorPane.setRightAnchor(circle, 18.0);
        AnchorPane.setTopAnchor(circle, 26.0);
        circle.setFill(javafx.scene.paint.Color.valueOf("#006fb2"));
        circle.setLayoutX(471.0);
        circle.setLayoutY(41.0);
        circle.setRadius(17.0);
        circle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        circle.setEffect(circleInnerShadow);

        AnchorPane.setRightAnchor(firstCharText, 29.3);
        AnchorPane.setTopAnchor(firstCharText, 32.5);
        firstCharText.setFill(javafx.scene.paint.Color.valueOf("#f0eded"));
        firstCharText.setLayoutX(467.4);
        firstCharText.setLayoutY(47.0);
        firstCharText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstCharText.setStrokeWidth(0.0);
        firstCharText.setText("U");

        AnchorPane.setRightAnchor(playerNameText, 68.236328125);
        playerNameText.setFill(javafx.scene.paint.Color.WHITE);
        playerNameText.setLayoutX(377.0);
        playerNameText.setLayoutY(46.0);
        playerNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerNameText.setStrokeWidth(0.0);
        playerNameText.setText("User Name");
        playerNameText.setFont(new Font("System Bold", 12.0));

        AnchorPane.setLeftAnchor(line, 0.0);
        AnchorPane.setRightAnchor(line, 0.0);
        AnchorPane.setTopAnchor(line, 75.0);
        line.setEndX(390.0);
        line.setLayoutX(115.5);
        line.setLayoutY(68.0);
        line.setStartX(-115.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);
        line.setStyle("-fx-stroke: #6b6b6b;");

        gameStackPane.setLayoutX(26.0);
        gameStackPane.setLayoutY(152.0);
        gameStackPane.setPrefHeight(113.0);
        gameStackPane.setPrefWidth(114.0);
        gameStackPane.getStyleClass().add("game-container");

        gameImageView.setFitHeight(106.0);
        gameImageView.setFitWidth(106.0);
        gameImageView.getStyleClass().add("game-image");
        gameImageView.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        gameImageView.setEffect(gameDropShadow);

        playButton.setLayoutX(26.0);
        playButton.setLayoutY(285.0);
        playButton.setMnemonicParsing(false);
        playButton.setPrefHeight(26.0);
        playButton.setPrefWidth(114.0);
        playButton.setStyle("-fx-background-radius: 15;");
        playButton.getStyleClass().add("play-btn");
        playButton.setText("Play");
        playButton.setTextFill(javafx.scene.paint.Color.WHITE);

        playButton.setEffect(playButtonInnerShadow);

        topScoreStackPane.setLayoutX(194.0);
        topScoreStackPane.setLayoutY(154.0);
        topScoreStackPane.setPrefHeight(113.0);
        topScoreStackPane.setPrefWidth(114.0);
        topScoreStackPane.getStyleClass().add("topscore-container");

        topScoreImageView.setFitHeight(107.0);
        topScoreImageView.setFitWidth(96.0);
        topScoreImageView.getStyleClass().add("top-score-image");
        topScoreImageView.setImage(new Image(getClass().getResource("../view/images/myDashboard/top-score.png").toExternalForm()));

        topScoreDropShadow.setHeight(58.54);
        topScoreDropShadow.setRadius(29.5125);
        topScoreDropShadow.setWidth(61.51);
        topScoreImageView.setEffect(topScoreDropShadow);

        topScoreButton.setLayoutX(197.0);
        topScoreButton.setLayoutY(285.0);
        topScoreButton.setMnemonicParsing(false);
        topScoreButton.setPrefHeight(26.0);
        topScoreButton.setPrefWidth(114.0);
        topScoreButton.setStyle("-fx-background-radius: 15;");
        topScoreButton.getStyleClass().add("play-btn");
        topScoreButton.setText("Top Score");
        topScoreButton.setTextFill(javafx.scene.paint.Color.WHITE);

        topScoreButton.setEffect(topScoreinnerShadow);

        myHistoryStackPane.setLayoutX(366.0);
        myHistoryStackPane.setLayoutY(154.0);
        myHistoryStackPane.setPrefHeight(114.0);
        myHistoryStackPane.setPrefWidth(111.0);
        myHistoryStackPane.getStyleClass().add("topscore-container");

        myHistoryImageView.setFitHeight(104.0);
        myHistoryImageView.setFitWidth(104.0);
        myHistoryImageView.getStyleClass().add("history-image");
        myHistoryImageView.setImage(new Image(getClass().getResource("../view/images/myDashboard/my-history.jpg").toExternalForm()));

        myHistoryImageView.setEffect(myHistoryDropShadow);

        myHistoryButton.setLayoutX(365.0);
        myHistoryButton.setLayoutY(285.0);
        myHistoryButton.setMnemonicParsing(false);
        myHistoryButton.setPrefHeight(26.0);
        myHistoryButton.setPrefWidth(114.0);
        myHistoryButton.setStyle("-fx-background-radius: 15;");
        myHistoryButton.getStyleClass().add("play-btn");
        myHistoryButton.setText("My History");
        myHistoryButton.setTextFill(javafx.scene.paint.Color.WHITE);

        myHistoryButton.setEffect(myHistoryInnerShadow);

        AnchorPane.setBottomAnchor(rectangle, 0.0);
        AnchorPane.setLeftAnchor(rectangle, 0.0);
        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#006fb2"));
        rectangle.setHeight(24.0);
        rectangle.setLayoutX(-1.0);
        rectangle.setLayoutY(392.0);
        rectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(507.0);

        rectangleInnerShadow.setColor(javafx.scene.paint.Color.BLACK);
        rectangle.setEffect(rectangleInnerShadow);

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

        setEffect(anchorDropShadow);

        logoStackPane.getChildren().add(logoImageView);
        getChildren().add(logoStackPane);
        getChildren().add(circle);
        getChildren().add(firstCharText);
        getChildren().add(playerNameText);
        getChildren().add(line);
        gameStackPane.getChildren().add(gameImageView);
        getChildren().add(gameStackPane);
        getChildren().add(playButton);
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
