package tictacteo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public class GameWithFriendPage extends AnchorPane {

    protected final ImageView imageView;
    protected final DropShadow dropShadow;
    protected final Pane pane;
    protected final DropShadow dropShadow0;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final Button button;
    protected final InnerShadow innerShadow;
    protected final Button button0;
    protected final InnerShadow innerShadow0;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final DropShadow dropShadow1;
    protected final Line line;
    protected final Button button1;
    protected final InnerShadow innerShadow1;
    protected final Button button2;
    protected final InnerShadow innerShadow2;
    protected final Pane pane0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;
    protected final Button button11;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final Label label4;
    protected final DropShadow dropShadow2;
    protected final ImageView imageView6;
    protected final Label label5;
    protected final DropShadow dropShadow3;
    protected final DropShadow dropShadow4;

    public GameWithFriendPage() {

        imageView = new ImageView();
        dropShadow = new DropShadow();
        pane = new Pane();
        dropShadow0 = new DropShadow();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        button = new Button();
        innerShadow = new InnerShadow();
        button0 = new Button();
        innerShadow0 = new InnerShadow();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        dropShadow1 = new DropShadow();
        line = new Line();
        button1 = new Button();
        innerShadow1 = new InnerShadow();
        button2 = new Button();
        innerShadow2 = new InnerShadow();
        pane0 = new Pane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
        button11 = new Button();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        label4 = new Label();
        dropShadow2 = new DropShadow();
        imageView6 = new ImageView();
        label5 = new Label();
        dropShadow3 = new DropShadow();
        dropShadow4 = new DropShadow();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");

        imageView.setFitHeight(45.0);
        imageView.setFitWidth(45.0);
        imageView.setLayoutX(14.0);
        imageView.setLayoutY(11.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../images/tic-tac-toe.jpg").toExternalForm()));

        imageView.setEffect(dropShadow);

        pane.setLayoutX(78.0);
        pane.setLayoutY(138.0);
        pane.setPrefHeight(224.0);
        pane.setPrefWidth(344.0);
        pane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; -fx-display: none;");
        pane.setVisible(false);

        pane.setEffect(dropShadow0);

        imageView0.setFitHeight(168.0);
        imageView0.setFitWidth(335.0);
        imageView0.setLayoutX(5.0);
        imageView0.setLayoutY(4.0);
        imageView0.setImage(new Image(getClass().getResource("../images/gameMessages/win.png").toExternalForm()));

        imageView1.setFitHeight(45.0);
        imageView1.setFitWidth(45.0);
        imageView1.setLayoutX(144.0);
        imageView1.setLayoutY(-8.0);
        imageView1.setImage(new Image(getClass().getResource("../images/gameMessages/vs.png").toExternalForm()));

        imageView2.setFitHeight(45.0);
        imageView2.setFitWidth(72.0);
        imageView2.setLayoutX(107.0);
        imageView2.setLayoutY(-30.0);
        imageView2.setImage(new Image(getClass().getResource("../images/gameMessages/x.png").toExternalForm()));

        imageView3.setFitHeight(45.0);
        imageView3.setFitWidth(88.0);
        imageView3.setLayoutX(167.0);
        imageView3.setLayoutY(-29.0);
        imageView3.setImage(new Image(getClass().getResource("../images/gameMessages/o.png").toExternalForm()));

        button.setLayoutX(39.0);
        button.setLayoutY(193.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(17.0);
        button.setPrefWidth(88.0);
        button.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        button.getStyleClass().add("play-btn");
        button.setText("Play Again");
        button.setTextFill(javafx.scene.paint.Color.WHITE);

        button.setEffect(innerShadow);

        button0.setLayoutX(201.0);
        button0.setLayoutY(193.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(17.0);
        button0.setPrefWidth(88.0);
        button0.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        button0.getStyleClass().add("play-btn");
        button0.setText("Wach Video");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);

        button0.setEffect(innerShadow0);

        label.setLayoutX(54.0);
        label.setLayoutY(158.0);
        label.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label.setText("Player:");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label.setFont(new Font(15.0));

        label0.setLayoutX(203.0);
        label0.setLayoutY(158.0);
        label0.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label0.setText("Character:");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label0.setFont(new Font(15.0));

        label1.setLayoutX(123.0);
        label1.setLayoutY(159.0);
        label1.setPrefHeight(21.0);
        label1.setPrefWidth(32.0);
        label1.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label1.setFont(new Font(15.0));

        label2.setLayoutX(293.0);
        label2.setLayoutY(160.0);
        label2.setPrefHeight(21.0);
        label2.setPrefWidth(23.0);
        label2.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label2.setFont(new Font(15.0));

        label3.setLayoutX(85.0);
        label3.setLayoutY(23.0);
        label3.setPrefHeight(25.0);
        label3.setPrefWidth(84.0);
        label3.setText("Tic Tac Teo");
        label3.setTextFill(javafx.scene.paint.Color.WHITE);
        label3.setFont(new Font("SansSerif Bold", 15.0));

        dropShadow1.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        label3.setEffect(dropShadow1);

        line.setEndX(400.0);
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);

        button1.setLayoutX(143.0);
        button1.setLayoutY(353.0);
        button1.setMaxHeight(37.0);
        button1.setMaxWidth(129.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(25.0);
        button1.setPrefWidth(103.0);
        button1.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        button1.setText("Exit");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        button1.setFont(new Font(16.0));

        button1.setEffect(innerShadow1);

        button2.setLayoutX(257.0);
        button2.setLayoutY(353.0);
        button2.setMaxHeight(37.0);
        button2.setMaxWidth(129.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(25.0);
        button2.setPrefWidth(103.0);
        button2.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        button2.setText("Play again");
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        button2.setFont(new Font(16.0));

        button2.setEffect(innerShadow2);

        pane0.setLayoutX(141.0);
        pane0.setLayoutY(158.0);
        pane0.setPrefHeight(159.0);
        pane0.setPrefWidth(218.0);
        pane0.setStyle("-fx-background-color: #343F4B;");

        gridPane.setLayoutX(5.0);
        gridPane.setLayoutY(-8.0);
        gridPane.setPrefHeight(178.0);
        gridPane.setPrefWidth(221.0);
        gridPane.setStyle("-fx-background-color: #343F4B;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMaxHeight(59.200006103515626);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(59.200006103515626);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(69.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(56.799993896484374);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(69.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(52.19998779296874);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        button3.setLayoutX(178.0);
        button3.setLayoutY(11.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(48.0);
        button3.setPrefWidth(60.0);

        GridPane.setRowIndex(button4, 1);
        button4.setLayoutX(10.0);
        button4.setLayoutY(118.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(48.0);
        button4.setPrefWidth(60.0);

        GridPane.setRowIndex(button5, 2);
        button5.setLayoutX(10.0);
        button5.setLayoutY(11.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(48.0);
        button5.setPrefWidth(60.0);

        GridPane.setColumnIndex(button6, 1);
        button6.setLayoutX(10.0);
        button6.setLayoutY(63.0);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(48.0);
        button6.setPrefWidth(60.0);

        GridPane.setColumnIndex(button7, 1);
        GridPane.setRowIndex(button7, 1);
        button7.setLayoutX(94.0);
        button7.setLayoutY(11.0);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(48.0);
        button7.setPrefWidth(60.0);

        GridPane.setColumnIndex(button8, 1);
        GridPane.setRowIndex(button8, 2);
        button8.setLayoutX(94.0);
        button8.setLayoutY(63.0);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(48.0);
        button8.setPrefWidth(60.0);

        GridPane.setColumnIndex(button9, 2);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(48.0);
        button9.setPrefWidth(60.0);

        GridPane.setColumnIndex(button10, 2);
        GridPane.setRowIndex(button10, 1);
        button10.setLayoutX(178.0);
        button10.setLayoutY(11.0);
        button10.setMnemonicParsing(false);
        button10.setPrefHeight(48.0);
        button10.setPrefWidth(60.0);

        GridPane.setColumnIndex(button11, 2);
        GridPane.setRowIndex(button11, 2);
        button11.setLayoutX(178.0);
        button11.setLayoutY(11.0);
        button11.setMnemonicParsing(false);
        button11.setPrefHeight(48.0);
        button11.setPrefWidth(60.0);

        imageView4.setFitHeight(84.0);
        imageView4.setFitWidth(88.0);
        imageView4.setLayoutX(16.0);
        imageView4.setLayoutY(160.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("../images/options/x.jpg").toExternalForm()));

        imageView5.setFitHeight(84.0);
        imageView5.setFitWidth(88.0);
        imageView5.setLayoutX(392.0);
        imageView5.setLayoutY(160.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("../images/options/o.jpg").toExternalForm()));

        label4.setLayoutX(22.0);
        label4.setLayoutY(254.0);
        label4.setPrefHeight(26.0);
        label4.setPrefWidth(72.0);
        label4.setText("Your Turn");
        label4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label4.setTextFill(javafx.scene.paint.Color.WHITE);
        label4.setFont(new Font("SansSerif Bold", 15.0));

        dropShadow2.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        label4.setEffect(dropShadow2);

        imageView6.setFitHeight(78.0);
        imageView6.setFitWidth(83.0);
        imageView6.setLayoutX(209.0);
        imageView6.setLayoutY(70.0);
        imageView6.setImage(new Image(getClass().getResource("../images/gameMessages/vs.png").toExternalForm()));

        label5.setLayoutX(398.0);
        label5.setLayoutY(254.0);
        label5.setPrefHeight(26.0);
        label5.setPrefWidth(72.0);
        label5.setText("Your Turn");
        label5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label5.setTextFill(javafx.scene.paint.Color.WHITE);
        label5.setFont(new Font("SansSerif Bold", 15.0));

        dropShadow3.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        label5.setEffect(dropShadow3);

        setEffect(dropShadow4);

        getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);
        pane.getChildren().add(imageView3);
        pane.getChildren().add(button);
        pane.getChildren().add(button0);
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        getChildren().add(pane);
        getChildren().add(label3);
        getChildren().add(line);
        getChildren().add(button1);
        getChildren().add(button2);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        gridPane.getChildren().add(button8);
        gridPane.getChildren().add(button9);
        gridPane.getChildren().add(button10);
        gridPane.getChildren().add(button11);
        pane0.getChildren().add(gridPane);
        getChildren().add(pane0);
        getChildren().add(imageView4);
        getChildren().add(imageView5);
        getChildren().add(label4);
        getChildren().add(imageView6);
        getChildren().add(label5);

    }
}
