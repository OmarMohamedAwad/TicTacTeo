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

public class MyDashboardGUI extends AnchorPane {

    protected final StackPane stackPane;
    protected final ImageView imageView;
    protected final Circle circle;
    protected final Text text;
    protected final Text text0;
    protected final Line line;
    protected final StackPane stackPane0;
    protected final ImageView imageView0;
    protected final Button button;
    protected final StackPane stackPane1;
    protected final ImageView imageView1;
    protected final Button button0;
    protected final StackPane stackPane2;
    protected final ImageView imageView2;
    protected final Button button1;
    protected final Rectangle rectangle;
    protected final ImageView imageView3;
    protected final Text text1;
    protected final Text text2;

    public MyDashboardGUI() {

        stackPane = new StackPane();
        imageView = new ImageView();
        circle = new Circle();
        text = new Text();
        text0 = new Text();
        line = new Line();
        stackPane0 = new StackPane();
        imageView0 = new ImageView();
        button = new Button();
        stackPane1 = new StackPane();
        imageView1 = new ImageView();
        button0 = new Button();
        stackPane2 = new StackPane();
        imageView2 = new ImageView();
        button1 = new Button();
        rectangle = new Rectangle();
        imageView3 = new ImageView();
        text1 = new Text();
        text2 = new Text();

        setPrefHeight(417.0);
        setPrefWidth(597.0);
        setStyle("-fx-background-color: #343F4B;");
        getStylesheets().add("/tictacteo/styles/MyDashboard.css");

        AnchorPane.setLeftAnchor(stackPane, 15.0);
        AnchorPane.setTopAnchor(stackPane, 15.0);
        stackPane.setLayoutX(14.0);
        stackPane.setLayoutY(11.0);
        stackPane.setPrefHeight(47.0);
        stackPane.setPrefWidth(46.0);
        stackPane.getStyleClass().add("logo-containers");

        imageView.setFitHeight(45.0);
        imageView.setFitWidth(45.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.getStyleClass().add("logo");
        imageView.setImage(new Image(getClass().getResource("../images/myDashboard/logo.jpg").toExternalForm()));

        AnchorPane.setRightAnchor(circle, 19.59999999999991);
        AnchorPane.setTopAnchor(circle, 25.0);
        circle.setFill(javafx.scene.paint.Color.valueOf("#006fb2"));
        circle.setLayoutX(566.4000000000001);
        circle.setLayoutY(40.0);
        circle.setRadius(15.0);
        circle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        text.setFill(javafx.scene.paint.Color.valueOf("#f0eded"));
        text.setLayoutX(561.0);
        text.setLayoutY(45.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("U");

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(483.0);
        text0.setLayoutY(45.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("User Name");

        AnchorPane.setLeftAnchor(line, 0.0);
        AnchorPane.setRightAnchor(line, 0.0);
        AnchorPane.setTopAnchor(line, 75.0);
        line.setEndX(485.0);
        line.setLayoutX(115.5);
        line.setLayoutY(68.0);
        line.setStartX(-115.0);
        line.setStyle("-fx-stroke: #ffffff;");

        stackPane0.setLayoutX(66.0);
        stackPane0.setLayoutY(151.0);
        stackPane0.setPrefHeight(113.0);
        stackPane0.setPrefWidth(114.0);
        stackPane0.getStyleClass().add("game-container");

        imageView0.setFitHeight(106.0);
        imageView0.setFitWidth(106.0);
        imageView0.getStyleClass().add("game-image");
        imageView0.setImage(new Image(getClass().getResource("../images/myDashboard/tic-tac-toe.jpg").toExternalForm()));

        button.setLayoutX(67.0);
        button.setLayoutY(285.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(26.0);
        button.setPrefWidth(114.0);
        button.getStyleClass().add("play-btn");
        button.setText("Play");
        button.setTextFill(javafx.scene.paint.Color.WHITE);

        stackPane1.setLayoutX(251.0);
        stackPane1.setLayoutY(151.0);
        stackPane1.setPrefHeight(113.0);
        stackPane1.setPrefWidth(114.0);
        stackPane1.getStyleClass().add("topscore-container");

        imageView1.setFitHeight(107.0);
        imageView1.setFitWidth(96.0);
        imageView1.getStyleClass().add("top-score-image");
        imageView1.setImage(new Image(getClass().getResource("../images/myDashboard/top-score.png").toExternalForm()));

        button0.setLayoutX(252.0);
        button0.setLayoutY(285.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(26.0);
        button0.setPrefWidth(114.0);
        button0.getStyleClass().add("play-btn");
        button0.setText("Top Score");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);

        stackPane2.setLayoutX(437.0);
        stackPane2.setLayoutY(151.0);
        stackPane2.setPrefHeight(114.0);
        stackPane2.setPrefWidth(111.0);
        stackPane2.getStyleClass().add("topscore-container");

        imageView2.setFitHeight(104.0);
        imageView2.setFitWidth(104.0);
        imageView2.getStyleClass().add("history-image");
        imageView2.setImage(new Image(getClass().getResource("../images/myDashboard/my-history.jpg").toExternalForm()));

        button1.setLayoutX(437.0);
        button1.setLayoutY(285.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(26.0);
        button1.setPrefWidth(114.0);
        button1.getStyleClass().add("play-btn");
        button1.setText("My History");
        button1.setTextFill(javafx.scene.paint.Color.WHITE);

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
        rectangle.setWidth(601.0);

        imageView3.setFitHeight(24.0);
        imageView3.setFitWidth(23.0);
        imageView3.setLayoutX(71.0);
        imageView3.setLayoutY(28.0);
        imageView3.setImage(new Image(getClass().getResource("../images/myDashboard/star.png").toExternalForm()));

        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(101.0);
        text1.setLayoutY(44.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Score: ");

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(138.0);
        text2.setLayoutY(45.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("80");

        stackPane.getChildren().add(imageView);
        getChildren().add(stackPane);
        getChildren().add(circle);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(line);
        stackPane0.getChildren().add(imageView0);
        getChildren().add(stackPane0);
        getChildren().add(button);
        stackPane1.getChildren().add(imageView1);
        getChildren().add(stackPane1);
        getChildren().add(button0);
        stackPane2.getChildren().add(imageView2);
        getChildren().add(stackPane2);
        getChildren().add(button1);
        getChildren().add(rectangle);
        getChildren().add(imageView3);
        getChildren().add(text1);
        getChildren().add(text2);

    }
}
