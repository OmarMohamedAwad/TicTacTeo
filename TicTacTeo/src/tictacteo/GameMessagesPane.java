package tictacteo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class GameMessagesPane extends AnchorPane {

    protected final Pane pane;
    protected final Pane pane0;
    protected final DropShadow dropShadow;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Button button;
    protected final InnerShadow innerShadow;
    protected final Button button0;
    protected final InnerShadow innerShadow0;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Pane pane1;
    protected final DropShadow dropShadow0;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView imageView6;
    protected final Button button1;
    protected final InnerShadow innerShadow1;
    protected final Button button2;
    protected final InnerShadow innerShadow2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final DropShadow dropShadow1;
    protected final Pane pane2;
    protected final DropShadow dropShadow2;
    protected final ImageView imageView7;
    protected final ImageView imageView8;
    protected final ImageView imageView9;
    protected final ImageView imageView10;
    protected final Button button3;
    protected final InnerShadow innerShadow3;
    protected final Button button4;
    protected final InnerShadow innerShadow4;
    protected final Label label8;
    protected final Label label9;
    protected final Label label10;
    protected final Label label11;
    protected final Label label12;
    protected final DropShadow dropShadow3;

    public GameMessagesPane() {

        pane = new Pane();
        pane0 = new Pane();
        dropShadow = new DropShadow();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        button = new Button();
        innerShadow = new InnerShadow();
        button0 = new Button();
        innerShadow0 = new InnerShadow();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        pane1 = new Pane();
        dropShadow0 = new DropShadow();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        button1 = new Button();
        innerShadow1 = new InnerShadow();
        button2 = new Button();
        innerShadow2 = new InnerShadow();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        dropShadow1 = new DropShadow();
        pane2 = new Pane();
        dropShadow2 = new DropShadow();
        imageView7 = new ImageView();
        imageView8 = new ImageView();
        imageView9 = new ImageView();
        imageView10 = new ImageView();
        button3 = new Button();
        innerShadow3 = new InnerShadow();
        button4 = new Button();
        innerShadow4 = new InnerShadow();
        label8 = new Label();
        label9 = new Label();
        label10 = new Label();
        label11 = new Label();
        label12 = new Label();
        dropShadow3 = new DropShadow();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(490.0);
        setStyle("-fx-background-color: #343F4B;");

        pane.setLayoutX(23.0);
        pane.setLayoutY(69.0);
        pane.setOpacity(0.3);
        pane.setPrefHeight(335.0);
        pane.setPrefWidth(451.0);
        pane.setStyle("-fx-background-color: #0c0721;");

        pane0.setLayoutX(78.0);
        pane0.setLayoutY(132.0);
        pane0.setPrefHeight(224.0);
        pane0.setPrefWidth(344.0);
        pane0.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

        pane0.setEffect(dropShadow);

        imageView.setFitHeight(168.0);
        imageView.setFitWidth(335.0);
        imageView.setLayoutX(5.0);
        imageView.setLayoutY(4.0);
        imageView.setImage(new Image(getClass().getResource("../images/gameMessages/win.png").toExternalForm()));

        imageView0.setFitHeight(45.0);
        imageView0.setFitWidth(72.0);
        imageView0.setLayoutX(107.0);
        imageView0.setLayoutY(-30.0);
        imageView0.setImage(new Image(getClass().getResource("../images/gameMessages/x.png").toExternalForm()));

        imageView1.setFitHeight(45.0);
        imageView1.setFitWidth(88.0);
        imageView1.setLayoutX(167.0);
        imageView1.setLayoutY(-29.0);
        imageView1.setImage(new Image(getClass().getResource("../images/gameMessages/o.png").toExternalForm()));

        imageView2.setFitHeight(45.0);
        imageView2.setFitWidth(45.0);
        imageView2.setLayoutX(148.0);
        imageView2.setLayoutY(-8.0);
        imageView2.setImage(new Image(getClass().getResource("../images/gameMessages/vs.png").toExternalForm()));

        button.setLayoutX(46.0);
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

        label.setLayoutX(58.0);
        label.setLayoutY(158.0);
        label.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label.setText("Player:");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label.setFont(new Font(15.0));

        label0.setLayoutX(204.0);
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

        pane1.setLayoutX(68.0);
        pane1.setLayoutY(144.0);
        pane1.setPrefHeight(224.0);
        pane1.setPrefWidth(344.0);
        pane1.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

        pane1.setEffect(dropShadow0);

        imageView3.setFitHeight(186.0);
        imageView3.setFitWidth(335.0);
        imageView3.setLayoutX(5.0);
        imageView3.setLayoutY(6.0);
        imageView3.setImage(new Image(getClass().getResource("../images/gameMessages/drawc.jpg").toExternalForm()));

        imageView4.setFitHeight(45.0);
        imageView4.setFitWidth(72.0);
        imageView4.setLayoutX(107.0);
        imageView4.setLayoutY(-30.0);
        imageView4.setImage(new Image(getClass().getResource("../images/gameMessages/x.png").toExternalForm()));

        imageView5.setFitHeight(45.0);
        imageView5.setFitWidth(88.0);
        imageView5.setLayoutX(167.0);
        imageView5.setLayoutY(-29.0);
        imageView5.setImage(new Image(getClass().getResource("../images/gameMessages/o.png").toExternalForm()));

        imageView6.setFitHeight(45.0);
        imageView6.setFitWidth(45.0);
        imageView6.setLayoutX(148.0);
        imageView6.setLayoutY(-8.0);
        imageView6.setImage(new Image(getClass().getResource("../images/gameMessages/vs.png").toExternalForm()));

        button1.setLayoutX(46.0);
        button1.setLayoutY(193.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(17.0);
        button1.setPrefWidth(88.0);
        button1.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        button1.getStyleClass().add("play-btn");
        button1.setText("Play Again");
        button1.setTextFill(javafx.scene.paint.Color.WHITE);

        button1.setEffect(innerShadow1);

        button2.setLayoutX(201.0);
        button2.setLayoutY(193.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(17.0);
        button2.setPrefWidth(88.0);
        button2.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        button2.getStyleClass().add("play-btn");
        button2.setText("Wach Video");
        button2.setTextFill(javafx.scene.paint.Color.WHITE);

        button2.setEffect(innerShadow2);

        label3.setLayoutX(58.0);
        label3.setLayoutY(158.0);
        label3.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label3.setText("Player:");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label3.setFont(new Font(15.0));

        label4.setLayoutX(204.0);
        label4.setLayoutY(158.0);
        label4.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label4.setText("Character:");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label4.setFont(new Font(15.0));

        label5.setLayoutX(123.0);
        label5.setLayoutY(159.0);
        label5.setPrefHeight(21.0);
        label5.setPrefWidth(32.0);
        label5.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label5.setFont(new Font(15.0));

        label6.setLayoutX(293.0);
        label6.setLayoutY(160.0);
        label6.setPrefHeight(21.0);
        label6.setPrefWidth(23.0);
        label6.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label6.setFont(new Font(15.0));

        label7.setLayoutX(116.0);
        label7.setLayoutY(26.0);
        label7.setStyle("-fx-font-weight: bolder;");
        label7.setText("DRAW");
        label7.setTextFill(javafx.scene.paint.Color.valueOf("#d300b4"));

        label7.setEffect(dropShadow1);
        label7.setFont(new Font("Microsoft Sans Serif", 37.0));

        pane2.setLayoutX(71.0);
        pane2.setLayoutY(150.0);
        pane2.setPrefHeight(224.0);
        pane2.setPrefWidth(344.0);
        pane2.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: true;");

        pane2.setEffect(dropShadow2);

        imageView7.setFitHeight(168.0);
        imageView7.setFitWidth(335.0);
        imageView7.setLayoutX(5.0);
        imageView7.setLayoutY(19.0);
        imageView7.setImage(new Image(getClass().getResource("../images/gameMessages/loos.png").toExternalForm()));

        imageView8.setFitHeight(45.0);
        imageView8.setFitWidth(72.0);
        imageView8.setLayoutX(107.0);
        imageView8.setLayoutY(-30.0);
        imageView8.setImage(new Image(getClass().getResource("../images/gameMessages/x.png").toExternalForm()));

        imageView9.setFitHeight(45.0);
        imageView9.setFitWidth(88.0);
        imageView9.setLayoutX(167.0);
        imageView9.setLayoutY(-29.0);
        imageView9.setImage(new Image(getClass().getResource("../images/gameMessages/o.png").toExternalForm()));

        imageView10.setFitHeight(45.0);
        imageView10.setFitWidth(45.0);
        imageView10.setLayoutX(148.0);
        imageView10.setLayoutY(-8.0);
        imageView10.setImage(new Image(getClass().getResource("../images/gameMessages/vs.png").toExternalForm()));

        button3.setLayoutX(46.0);
        button3.setLayoutY(193.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(17.0);
        button3.setPrefWidth(88.0);
        button3.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        button3.getStyleClass().add("play-btn");
        button3.setText("Play Again");
        button3.setTextFill(javafx.scene.paint.Color.WHITE);

        button3.setEffect(innerShadow3);

        button4.setLayoutX(201.0);
        button4.setLayoutY(193.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(17.0);
        button4.setPrefWidth(88.0);
        button4.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        button4.getStyleClass().add("play-btn");
        button4.setText("Wach Video");
        button4.setTextFill(javafx.scene.paint.Color.WHITE);

        button4.setEffect(innerShadow4);

        label8.setLayoutX(58.0);
        label8.setLayoutY(158.0);
        label8.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label8.setText("Player:");
        label8.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label8.setFont(new Font(15.0));

        label9.setLayoutX(204.0);
        label9.setLayoutY(158.0);
        label9.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label9.setText("Character:");
        label9.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label9.setFont(new Font(15.0));

        label10.setLayoutX(123.0);
        label10.setLayoutY(159.0);
        label10.setPrefHeight(21.0);
        label10.setPrefWidth(32.0);
        label10.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label10.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label10.setFont(new Font(15.0));

        label11.setLayoutX(293.0);
        label11.setLayoutY(160.0);
        label11.setPrefHeight(21.0);
        label11.setPrefWidth(23.0);
        label11.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        label11.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        label11.setFont(new Font(15.0));

        label12.setLayoutX(116.0);
        label12.setLayoutY(26.0);
        label12.setStyle("-fx-font-weight: bolder;");
        label12.setText("Looser");
        label12.setTextFill(javafx.scene.paint.Color.valueOf("#d300b4"));

        label12.setEffect(dropShadow3);
        label12.setFont(new Font("Microsoft Sans Serif", 37.0));

        getChildren().add(pane);
        pane0.getChildren().add(imageView);
        pane0.getChildren().add(imageView0);
        pane0.getChildren().add(imageView1);
        pane0.getChildren().add(imageView2);
        pane0.getChildren().add(button);
        pane0.getChildren().add(button0);
        pane0.getChildren().add(label);
        pane0.getChildren().add(label0);
        pane0.getChildren().add(label1);
        pane0.getChildren().add(label2);
        getChildren().add(pane0);
        pane1.getChildren().add(imageView3);
        pane1.getChildren().add(imageView4);
        pane1.getChildren().add(imageView5);
        pane1.getChildren().add(imageView6);
        pane1.getChildren().add(button1);
        pane1.getChildren().add(button2);
        pane1.getChildren().add(label3);
        pane1.getChildren().add(label4);
        pane1.getChildren().add(label5);
        pane1.getChildren().add(label6);
        pane1.getChildren().add(label7);
        getChildren().add(pane1);
        pane2.getChildren().add(imageView7);
        pane2.getChildren().add(imageView8);
        pane2.getChildren().add(imageView9);
        pane2.getChildren().add(imageView10);
        pane2.getChildren().add(button3);
        pane2.getChildren().add(button4);
        pane2.getChildren().add(label8);
        pane2.getChildren().add(label9);
        pane2.getChildren().add(label10);
        pane2.getChildren().add(label11);
        pane2.getChildren().add(label12);
        getChildren().add(pane2);

    }
}
