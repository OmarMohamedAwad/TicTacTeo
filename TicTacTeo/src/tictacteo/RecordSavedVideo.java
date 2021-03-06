package tictacteo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
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
import javafx.stage.Stage;
import model.database.Player;

public class RecordSavedVideo extends AnchorPane {
  static List<String> recordFromFile = new ArrayList<String>();
   static List<String> positionFromFile = new ArrayList<String>();
    static String name = "omar";
  
    boolean xSelected = true;
    protected final ImageView LogoImage;
    protected final DropShadow LogoImageShadow;
    protected final Label TicTacTeo;
    protected final DropShadow TicTacTeoShadow;
    protected final Line line;
    protected final Label ScoreName;
    protected final DropShadow ScoreNameShadow;
    protected final Label ScoreNumber;
    protected final DropShadow ScoreNumberShadow;
    protected final ImageView Star;
    protected final ImageView XImage;
    protected final ImageView OImage;
    protected final Button ExitButton;
    protected final InnerShadow ExitButtonInnerShadow;
    protected final Button WatchButton;
    protected final InnerShadow WatchButtonShadow;

    protected final Pane pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints Coulmn0;
    protected final ColumnConstraints Column1;
    protected final ColumnConstraints Coulmn2;
    protected final RowConstraints Row0;
    protected final RowConstraints Row1;
    protected final RowConstraints Row2;
    protected final Button Button00;
    protected final Button Button01;
    protected final Button Button02;
    protected final Button Button10;
    protected final Button Button11;
    protected final Button Button12;
    protected final Button Button20;
    protected final Button Button21;
    protected final Button Button22;
    protected final DropShadow dropShadow3;
    static int index = 0;
    static Thread thread2 = new Thread();
    Player currentPlayer;

    public RecordSavedVideo(Stage primary, Player currentPlayer, List<String> record, List<String> position, Thread thread, String page) {
        recordFromFile = new ArrayList<String>();
        positionFromFile = new ArrayList<String>();
        this.currentPlayer = currentPlayer;
        index = 0;
        thread2 = thread;
        LogoImage = new ImageView();
        LogoImageShadow = new DropShadow();
        TicTacTeo = new Label();
        TicTacTeoShadow = new DropShadow();
        line = new Line();
        ScoreName = new Label();
        ScoreNameShadow = new DropShadow();
        ScoreNumber = new Label();
        ScoreNumberShadow = new DropShadow();
        Star = new ImageView();
        XImage = new ImageView();
        OImage = new ImageView();
        ExitButton = new Button();
        ExitButtonInnerShadow = new InnerShadow();
        WatchButton = new Button();
        WatchButtonShadow = new InnerShadow();

        pane = new Pane();
        gridPane = new GridPane();
        Coulmn0 = new ColumnConstraints();
        Column1 = new ColumnConstraints();
        Coulmn2 = new ColumnConstraints();
        Row0 = new RowConstraints();
        Row1 = new RowConstraints();
        Row2 = new RowConstraints();
        Button00 = new Button();
        Button01 = new Button();
        Button02 = new Button();
        Button10 = new Button();
        Button11 = new Button();
        Button12 = new Button();
        Button20 = new Button();
        Button21 = new Button();
        Button22 = new Button();
        dropShadow3 = new DropShadow();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");

        LogoImage.setFitHeight(45.0);
        LogoImage.setFitWidth(45.0);
        LogoImage.setLayoutX(14.0);
        LogoImage.setLayoutY(11.0);
        LogoImage.setPickOnBounds(true);
        LogoImage.setPreserveRatio(true);
        LogoImage.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        LogoImage.setEffect(LogoImageShadow);

        TicTacTeo.setLayoutX(85.0);
        TicTacTeo.setLayoutY(23.0);
        TicTacTeo.setPrefHeight(25.0);
        TicTacTeo.setPrefWidth(84.0);
        TicTacTeo.setText("Tic Tac Teo");
        TicTacTeo.setTextFill(javafx.scene.paint.Color.WHITE);
        TicTacTeo.setFont(new Font("SansSerif Bold", 15.0));

        TicTacTeoShadow.setColor(javafx.scene.paint.Color.BLACK);
        TicTacTeo.setEffect(TicTacTeoShadow);

        line.setEndX(400.0);
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);

        ScoreName.setLayoutX(423.0);
        ScoreName.setLayoutY(21.0);
        ScoreName.setPrefHeight(25.0);
        ScoreName.setPrefWidth(45.0);
        ScoreName.setText("Score : ");
        ScoreName.setTextFill(javafx.scene.paint.Color.WHITE);
        ScoreName.setFont(new Font("SansSerif Regular", 12.0));

        ScoreNameShadow.setColor(javafx.scene.paint.Color.BLACK);
        ScoreName.setEffect(ScoreNameShadow);

        ScoreNumber.setLayoutX(468.0);
        ScoreNumber.setLayoutY(23.0);
        ScoreNumber.setPrefHeight(25.0);
        ScoreNumber.setPrefWidth(25.0);
        ScoreNumber.setText("0");
        ScoreNumber.setTextFill(javafx.scene.paint.Color.WHITE);
        ScoreNumber.setFont(new Font("SansSerif Regular", 12.0));

        ScoreNumberShadow.setColor(javafx.scene.paint.Color.BLACK);
        ScoreNumber.setEffect(ScoreNumberShadow);

        Star.setFitHeight(25.0);
        Star.setFitWidth(25.0);
        Star.setLayoutX(388.0);
        Star.setLayoutY(21.0);
        Star.setPickOnBounds(true);
        Star.setPreserveRatio(true);
        Star.setImage(new Image(getClass().getResource("../view/images/myDashboard/star.png").toExternalForm()));

        XImage.setFitHeight(55.0);
        XImage.setFitWidth(55.0);
        XImage.setLayoutX(145.0);
        XImage.setLayoutY(89.0);
        XImage.setPickOnBounds(true);
        XImage.setPreserveRatio(true);
        XImage.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));

        OImage.setFitHeight(55.0);
        OImage.setFitWidth(55.0);
        OImage.setLayoutX(250.0);
        OImage.setLayoutY(89.0);
        OImage.setPickOnBounds(true);
        OImage.setPreserveRatio(true);
        OImage.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));

        ExitButton.setLayoutX(115.0);
        ExitButton.setLayoutY(353.0);
        ExitButton.setMaxHeight(37.0);
        ExitButton.setMaxWidth(129.0);
        ExitButton.setMnemonicParsing(false);
        ExitButton.setPrefHeight(25.0);
        ExitButton.setPrefWidth(103.0);
        ExitButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        ExitButton.setText("Exit");
        ExitButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        ExitButton.setFont(new Font(16.0));

        ExitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent ev) {
                primary.setScene(new Scene(new MyDashboardPage(primary, currentPlayer.getUserID(), thread)));
            }
        });
        ExitButton.setEffect(ExitButtonInnerShadow);

        WatchButton.setLayoutX(230.0);
        WatchButton.setLayoutY(353.0);
        WatchButton.setMaxHeight(37.0);
        WatchButton.setMaxWidth(129.0);
        WatchButton.setMnemonicParsing(false);
        WatchButton.setPrefHeight(25.0);
        WatchButton.setPrefWidth(103.0);
        WatchButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        WatchButton.setText("Watch");
        WatchButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        WatchButton.setFont(new Font(16.0));

        WatchButton.setEffect(WatchButtonShadow);

        pane.setLayoutX(
                114.0);
        pane.setLayoutY(
                160.0);
        pane.setPrefHeight(
                159.0);
        pane.setPrefWidth(
                260.0);
        pane.setStyle(
                "-fx-background-color:  #343F4B;");

        gridPane.setLayoutX(
                5.0);
        gridPane.setLayoutY(
                -8.0);
        gridPane.setPrefHeight(
                178.0);
        gridPane.setPrefWidth(
                221.0);

        Coulmn0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);

        Coulmn0.setMinWidth(
                10.0);
        Coulmn0.setPrefWidth(
                100.0);

        Column1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);

        Column1.setMinWidth(
                10.0);
        Column1.setPrefWidth(
                100.0);

        Coulmn2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);

        Coulmn2.setMinWidth(
                10.0);
        Coulmn2.setPrefWidth(
                100.0);

        Row0.setMaxHeight(
                53.0);
        Row0.setMinHeight(
                10.0);
        Row0.setPrefHeight(
                53.0);
        Row0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        Row1.setMaxHeight(
                69.0);
        Row1.setMinHeight(
                10.0);
        Row1.setPrefHeight(
                49.0);
        Row1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        Row2.setMaxHeight(
                69.0);
        Row2.setMinHeight(
                10.0);
        Row2.setPrefHeight(
                54.0);
        Row2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        Button00.setLayoutX(
                178.0);
        Button00.setLayoutY(
                11.0);
        Button00.setMnemonicParsing(
                false);
        Button00.setPrefHeight(
                48.0);
        Button00.setPrefWidth(
                60.0);

        GridPane.setRowIndex(Button01,
                1);
        Button01.setLayoutX(
                10.0);
        Button01.setLayoutY(
                118.0);
        Button01.setMnemonicParsing(
                false);
        Button01.setPrefHeight(
                48.0);
        Button01.setPrefWidth(
                60.0);

        GridPane.setRowIndex(Button02,
                2);
        Button02.setLayoutX(
                10.0);
        Button02.setLayoutY(
                11.0);
        Button02.setMnemonicParsing(
                false);
        Button02.setPrefHeight(
                48.0);
        Button02.setPrefWidth(
                60.0);

        GridPane.setColumnIndex(Button10,
                1);
        Button10.setLayoutX(
                10.0);
        Button10.setLayoutY(
                63.0);
        Button10.setMnemonicParsing(
                false);
        Button10.setPrefHeight(
                48.0);
        Button10.setPrefWidth(
                60.0);

        GridPane.setColumnIndex(Button11,
                1);
        GridPane.setRowIndex(Button11,
                1);
        Button11.setLayoutX(
                94.0);
        Button11.setLayoutY(
                11.0);
        Button11.setMnemonicParsing(
                false);
        Button11.setPrefHeight(
                48.0);
        Button11.setPrefWidth(
                60.0);

        GridPane.setColumnIndex(Button12,
                1);
        GridPane.setRowIndex(Button12,
                2);
        Button12.setLayoutX(
                94.0);
        Button12.setLayoutY(
                63.0);
        Button12.setMnemonicParsing(
                false);
        Button12.setPrefHeight(
                48.0);
        Button12.setPrefWidth(
                60.0);

        GridPane.setColumnIndex(Button20,
                2);
        Button20.setMnemonicParsing(
                false);
        Button20.setPrefHeight(
                48.0);
        Button20.setPrefWidth(
                60.0);

        GridPane.setColumnIndex(Button21,
                2);
        GridPane.setRowIndex(Button21,
                1);
        Button21.setLayoutX(
                178.0);
        Button21.setLayoutY(
                11.0);
        Button21.setMnemonicParsing(
                false);
        Button21.setPrefHeight(
                48.0);
        Button21.setPrefWidth(
                60.0);

        GridPane.setColumnIndex(Button22,
                2);
        GridPane.setRowIndex(Button22,
                2);
        Button22.setLayoutX(
                178.0);
        Button22.setLayoutY(
                11.0);
        Button22.setMnemonicParsing(
                false);
        Button22.setPrefHeight(
                48.0);
        Button22.setPrefWidth(
                60.0);

        setEffect(dropShadow3);

        getChildren()
                .add(LogoImage);
        getChildren()
                .add(TicTacTeo);
        getChildren()
                .add(line);
        getChildren()
                .add(ScoreName);
        getChildren()
                .add(ScoreNumber);
        getChildren()
                .add(Star);
        getChildren()
                .add(XImage);
        getChildren()
                .add(OImage);
        getChildren()
                .add(ExitButton);
        getChildren()
                .add(WatchButton);

        gridPane.getColumnConstraints()
                .add(Coulmn0);
        gridPane.getColumnConstraints()
                .add(Column1);
        gridPane.getColumnConstraints()
                .add(Coulmn2);
        gridPane.getRowConstraints()
                .add(Row0);
        gridPane.getRowConstraints()
                .add(Row1);
        gridPane.getRowConstraints()
                .add(Row2);
        gridPane.getChildren()
                .add(Button00);
        gridPane.getChildren()
                .add(Button01);
        gridPane.getChildren()
                .add(Button02);
        gridPane.getChildren()
                .add(Button10);
        gridPane.getChildren()
                .add(Button11);
        gridPane.getChildren()
                .add(Button12);
        gridPane.getChildren()
                .add(Button20);
        gridPane.getChildren()
                .add(Button21);
        gridPane.getChildren()
                .add(Button22);
        pane.getChildren()
                .add(gridPane);
        getChildren()
                .add(pane);
        
        try {

            BufferedReader reader = new BufferedReader(new FileReader("AYA.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[10];
            while (reader.read(buffer) != -1) {
                stringBuilder.append(new String(buffer));
                buffer = new char[10];
            }
            reader.close();
            String content = stringBuilder.toString();
           
            String[] str = content.split(" ");
            for (int i = 0; i < str.length; i++) {
                if (str[i].equalsIgnoreCase("X") || str[i].equalsIgnoreCase("O")) {
                    recordFromFile.add(str[i]);
                } else {
                    positionFromFile.add(str[i]);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(RecordSavedVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        WatchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                clearButtons();
                index = 0;
                thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        boolean pf = true;
                        while (pf) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }
                            if (index >= recordFromFile.size() - 1) {
                                pf = false;
                            }
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (positionFromFile.get(index).equals("00")) {
                                        Button00.setText(recordFromFile.get(index));
                                        Button00.setFont(new Font("SansSerif Bold", 15.0));                               
                                    } else if (positionFromFile.get(index).equals("01")) {
                                        Button01.setText(recordFromFile.get(index));
                                        Button01.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("02")) {
                                        Button02.setText(recordFromFile.get(index));
                                        Button02.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("10")) {
                                        Button10.setText(recordFromFile.get(index));
                                        Button10.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("11")) {
                                        Button11.setText(recordFromFile.get(index));
                                        Button11.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("12")) {
                                        Button12.setText(recordFromFile.get(index));
                                        Button12.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("20")) {
                                        Button20.setText(recordFromFile.get(index));
                                        Button20.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("21")) {
                                        Button21.setText(recordFromFile.get(index));
                                        Button21.setFont(new Font("SansSerif Bold", 15.0));
                                    } else if (positionFromFile.get(index).equals("22")) {

                                        Button22.setText(recordFromFile.get(index));
                                        Button22.setFont(new Font("SansSerif Bold", 15.0));

                                    }

                                    index++;
                                }
                            });

                        }

                    }

                }
                );
                thread2.start();
            }

        });
    }

    public void clearButtons() {

        Button00.setText("");
        Button01.setText("");
        Button02.setText("");
        Button10.setText("");
        Button11.setText("");
        Button12.setText("");
        Button20.setText("");
        Button21.setText("");
        Button22.setText("");

    }

}
