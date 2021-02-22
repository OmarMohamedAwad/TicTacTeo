package tictacteo;

import java.util.Arrays;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
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
import javax.imageio.ImageIO;

public class GamePage extends AnchorPane {

    List<String> record = new ArrayList<String>();
List<String> position = new ArrayList<String>();
    protected final ImageView logoImage;
    protected final DropShadow logoShadowImage;
    protected final Label gameName;
    protected final DropShadow gameNameShadow;
    protected final Line line;
    protected final Label scoreLabel;
    protected final DropShadow scoreLabelShadow;
    protected final ImageView scoreImage;
    protected final Button easyButton;
    protected final Glow easyButtonEffect;
    protected final Button middleButton;
    protected final Glow middleButtonEffect;
    protected final Button hardButton;
    protected final Glow hardButtonEffect;
    protected final ImageView xImage;
    protected final ImageView oImage;
    protected final Button exitButton;
    protected final InnerShadow exitButtonShadow;
    protected final Button playAgainButton;
    protected final InnerShadow playAgainButtonShadow;
    protected final Pane xOPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnGridPaneConstraints1;
    protected final ColumnConstraints columnGridPaneConstrains2;
    protected final ColumnConstraints columnGridPaneConstrains3;
    protected final RowConstraints rowGridPaneConstrains1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowGridPaneConstrains3;

    protected final Button Button00;
    protected final Button Button01;
    protected final Button Button02;
    protected final Button Button10;
    protected final Button Button11;
    protected final Button Button12;
    protected final Button Button20;
    protected final Button Button21;
    protected final Button Button22;
    protected final DropShadow anchorPaneShadow;

    public GamePage(Stage primary, int id) throws AWTException, IOException {

        logoImage = new ImageView();
        logoShadowImage = new DropShadow();
        gameName = new Label();
        gameNameShadow = new DropShadow();
        line = new Line();
        scoreLabel = new Label();
        scoreLabelShadow = new DropShadow();
        scoreImage = new ImageView();
        easyButton = new Button();
        easyButtonEffect = new Glow();
        middleButton = new Button();
        middleButtonEffect = new Glow();
        hardButton = new Button();
        hardButtonEffect = new Glow();
        xImage = new ImageView();
        oImage = new ImageView();
        exitButton = new Button();
        exitButtonShadow = new InnerShadow();
        playAgainButton = new Button();
        playAgainButtonShadow = new InnerShadow();
        xOPane = new Pane();
        gridPane = new GridPane();
        columnGridPaneConstraints1 = new ColumnConstraints();
        columnGridPaneConstrains2 = new ColumnConstraints();
        columnGridPaneConstrains3 = new ColumnConstraints();
        rowGridPaneConstrains1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowGridPaneConstrains3 = new RowConstraints();

        Button00 = new Button();
        Button01 = new Button();
        Button02 = new Button();
        Button10 = new Button();
        Button11 = new Button();
        Button12 = new Button();
        Button20 = new Button();
        Button21 = new Button();
        Button22 = new Button();
        anchorPaneShadow = new DropShadow();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");

        logoImage.setFitHeight(45.0);
        logoImage.setFitWidth(45.0);
        logoImage.setLayoutX(14.0);
        logoImage.setLayoutY(11.0);
        logoImage.setPickOnBounds(true);
        logoImage.setPreserveRatio(true);
        logoImage.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        logoImage.setEffect(logoShadowImage);

        gameName.setLayoutX(85.0);
        gameName.setLayoutY(23.0);
        gameName.setPrefHeight(25.0);
        gameName.setPrefWidth(84.0);
        gameName.setText("Tic Tac Teo");
        gameName.setTextFill(javafx.scene.paint.Color.WHITE);
        gameName.setFont(new Font("SansSerif Bold", 15.0));

        gameNameShadow.setColor(javafx.scene.paint.Color.BLACK);
        gameName.setEffect(gameNameShadow);

        line.setEndX(400.0);
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);

        scoreLabel.setLayoutX(423.0);
        scoreLabel.setLayoutY(21.0);
        scoreLabel.setPrefHeight(25.0);
        scoreLabel.setPrefWidth(65.0);
        scoreLabel.setText("Score : 60");
        scoreLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        scoreLabel.setFont(new Font("SansSerif Regular", 12.0));

        scoreLabelShadow.setColor(javafx.scene.paint.Color.BLACK);
        scoreLabel.setEffect(scoreLabelShadow);

        scoreImage.setFitHeight(25.0);
        scoreImage.setFitWidth(25.0);
        scoreImage.setLayoutX(388.0);
        scoreImage.setLayoutY(21.0);
        scoreImage.setPickOnBounds(true);
        scoreImage.setPreserveRatio(true);
        scoreImage.setImage(new Image(getClass().getResource("../view/images/myDashboard/star.png").toExternalForm()));

        easyButton.setLayoutX(413.0);
        easyButton.setLayoutY(166.0);
        easyButton.setMnemonicParsing(false);
        easyButton.setPrefHeight(30.0);
        easyButton.setPrefWidth(75.0);
        easyButton.setStyle("-fx-background-color: green;");
        easyButton.setText("Easy");
        easyButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        easyButton.setFont(new Font("System Bold", 14.0));

        easyButton.setEffect(easyButtonEffect);

        middleButton.setLayoutX(413.0);
        middleButton.setLayoutY(231.0);
        middleButton.setMnemonicParsing(false);
        middleButton.setPrefHeight(30.0);
        middleButton.setPrefWidth(75.0);
        middleButton.setStyle("-fx-background-color: grey;");
        middleButton.setText("Middle");
        middleButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        middleButton.setFont(new Font("System Bold", 14.0));

        middleButton.setEffect(middleButtonEffect);

        hardButton.setLayoutX(413.0);
        hardButton.setLayoutY(288.0);
        hardButton.setMnemonicParsing(false);
        hardButton.setPrefHeight(30.0);
        hardButton.setPrefWidth(75.0);
        hardButton.setStyle("-fx-background-color: red;");
        hardButton.setText("Hard");
        hardButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        hardButton.setFont(new Font("System Bold", 14.0));

        hardButton.setEffect(hardButtonEffect);

        xImage.setFitHeight(55.0);
        xImage.setFitWidth(55.0);
        xImage.setLayoutX(155.0);
        xImage.setLayoutY(89.0);
        xImage.setPickOnBounds(true);
        xImage.setPreserveRatio(true);
        xImage.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));

        oImage.setFitHeight(55.0);
        oImage.setFitWidth(55.0);
        oImage.setLayoutX(269.0);
        oImage.setLayoutY(89.0);
        oImage.setPickOnBounds(true);
        oImage.setPreserveRatio(true);
        oImage.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));

        exitButton.setLayoutX(127.0);
        exitButton.setLayoutY(353.0);
        exitButton.setMaxHeight(37.0);
        exitButton.setMaxWidth(129.0);
        exitButton.setMnemonicParsing(false);
        exitButton.setPrefHeight(25.0);
        exitButton.setPrefWidth(103.0);
        exitButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        exitButton.setText("Exit");
        exitButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        exitButton.setFont(new Font(16.0));

        for (int i = 0; i < 9; i++) {
            exitButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent ev) {
                    primary.setScene(new Scene(new OptionPage(primary, id)));
//        Robot r = null; 
//                try {
//                    r = new Robot();
//                } catch (AWTException ex) {
//                    Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               
//            String path = "C:\\Users\\3com\\Desktop\\javaaaa\\java project 2// Shot"+num+".jpg"; 
//            num++;
//            java.awt.Rectangle capture =  
//            new java.awt.Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
//            BufferedImage Image = r.createScreenCapture(capture); 
//             
//               System.out.println(num); 
//                try { 
//                    ImageIO.write(Image, "jpg", new File(path));
//                } catch (IOException ex) {
//                    Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               
//            System.out.println("Screenshot saved"); 
//            }

                }
            });
        }

        exitButton.setEffect(exitButtonShadow);

        playAgainButton.setLayoutX(251.0);
        playAgainButton.setLayoutY(353.0);
        playAgainButton.setMaxHeight(37.0);
        playAgainButton.setMaxWidth(129.0);
        playAgainButton.setMnemonicParsing(false);
        playAgainButton.setPrefHeight(25.0);
        playAgainButton.setPrefWidth(103.0);
        playAgainButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        playAgainButton.setText("Play again");
        playAgainButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        playAgainButton.setFont(new Font(16.0));

        playAgainButton.setEffect(playAgainButtonShadow);

        xOPane.setLayoutX(115.0);
        xOPane.setLayoutY(166.0);
        xOPane.setPrefHeight(160.0);
        xOPane.setPrefWidth(260.0);
        xOPane.setStyle("-fx-background-color: white;");

        gridPane.setLayoutX(0.0);
        gridPane.setLayoutY(0.0);
        gridPane.setPrefHeight(160.0);
        gridPane.setPrefWidth(260.0);

        columnGridPaneConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnGridPaneConstraints1.setMinWidth(10.0);
        columnGridPaneConstraints1.setPrefWidth(100.0);

        columnGridPaneConstrains2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnGridPaneConstrains2.setMinWidth(10.0);
        columnGridPaneConstrains2.setPrefWidth(100.0);

        columnGridPaneConstrains3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnGridPaneConstrains3.setMinWidth(10.0);
        columnGridPaneConstrains3.setPrefWidth(100.0);

        rowGridPaneConstrains1.setMaxHeight(50.0);
        rowGridPaneConstrains1.setMinHeight(10.0);
        rowGridPaneConstrains1.setPrefHeight(50.0);
        rowGridPaneConstrains1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(69.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(52.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowGridPaneConstrains3.setMaxHeight(68.0);
        rowGridPaneConstrains3.setMinHeight(10.0);
        rowGridPaneConstrains3.setPrefHeight(54.0);
        rowGridPaneConstrains3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        Button00.setLayoutX(178.0);
        Button00.setLayoutY(11.0);
        Button00.setMnemonicParsing(false);
        Button00.setPrefHeight(48.0);
        Button00.setPrefWidth(84.0);

        Button00.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("x");
                position.add("Button00");

            }
        });
        GridPane.setRowIndex(Button01, 1);
        Button01.setLayoutX(10.0);
        Button01.setLayoutY(118.0);
        Button01.setMnemonicParsing(false);
        Button01.setPrefHeight(48.0);
        Button01.setPrefWidth(84.0);
        Button01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("o");
                position.add("Button01");
            }
        });
        GridPane.setRowIndex(Button02, 2);
        Button02.setLayoutX(10.0);
        Button02.setLayoutY(11.0);
        Button02.setMnemonicParsing(false);
        Button02.setPrefHeight(48.0);
        Button02.setPrefWidth(84.0);
        Button02.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("x");
                position.add("Button02");
            }
        });
        GridPane.setColumnIndex(Button10, 1);
        Button10.setLayoutX(10.0);
        Button10.setLayoutY(63.0);
        Button10.setMnemonicParsing(false);
        Button10.setPrefHeight(48.0);
        Button10.setPrefWidth(84.0);
        Button10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("o");
                position.add("Button10");
            }
        });

        GridPane.setColumnIndex(Button11, 1);
        GridPane.setRowIndex(Button11, 1);
        Button11.setLayoutX(94.0);
        Button11.setLayoutY(11.0);
        Button11.setMnemonicParsing(false);
        Button11.setPrefHeight(48.0);
        Button11.setPrefWidth(84.0);
        Button11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("x");
                position.add("Button11");
            }
        });
        GridPane.setColumnIndex(Button12, 1);
        GridPane.setRowIndex(Button12, 2);
        Button12.setLayoutX(94.0);
        Button12.setLayoutY(63.0);
        Button12.setMnemonicParsing(false);
        Button12.setPrefHeight(48.0);
        Button12.setPrefWidth(84.0);
        Button12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("o");
                position.add("Button12");
            }
        });
        GridPane.setColumnIndex(Button20, 2);
        Button20.setMnemonicParsing(false);
        Button20.setPrefHeight(48.0);
        Button20.setPrefWidth(84.0);
        Button20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("x");
                position.add("Button20");
            }
        });
        GridPane.setColumnIndex(Button21, 2);
        GridPane.setRowIndex(Button21, 1);
        Button21.setLayoutX(178.0);
        Button21.setLayoutY(11.0);
        Button21.setMnemonicParsing(false);
        Button21.setPrefHeight(48.0);
        Button21.setPrefWidth(84.0);
        Button21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                record.add("x");
                position.add("Button21");
//                 for(int i =0 ; i<record.size(); i++){
//                System.out.println(record.get(i));
//                 }
            }
        });
        GridPane.setColumnIndex(Button22, 2);
        GridPane.setRowIndex(Button22, 2);
        Button22.setLayoutX(178.0);
        Button22.setLayoutY(11.0);
        Button22.setMnemonicParsing(false);
        Button22.setPrefHeight(48.0);
        Button22.setPrefWidth(84.0);
        Button22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                record.add("o");
                position.add("Button22");

                class Record extends Thread {

                    Thread th;

                    public Record() {
                        Thread th = new Thread();
                        th.start();
                    }
                    @Override
                    public void run() {
                        boolean pf = true;
                      
                            while (pf) {
                                for (int i = 0; i < record.size(); i ++) {
                                    System.out.println(record.get(i));
                                    try {
                                        Thread.sleep(1000);
                                           
                                    } catch (InterruptedException e) {
                                    }
                               if (record.size()-1 == i) {
                                
                                    pf = false;
                                }
                                }
                                    
                              
                            }
                        }
                }
                Record rd = new Record();
                rd.run();
            }
        });

        setEffect(anchorPaneShadow);

        getChildren().add(logoImage);
        getChildren().add(gameName);
        getChildren().add(line);
        getChildren().add(scoreLabel);
        getChildren().add(scoreImage);
        getChildren().add(easyButton);
        getChildren().add(middleButton);
        getChildren().add(hardButton);
        getChildren().add(xImage);
        getChildren().add(oImage);
        getChildren().add(exitButton);
        getChildren().add(playAgainButton);
        gridPane.getColumnConstraints().add(columnGridPaneConstraints1);
        gridPane.getColumnConstraints().add(columnGridPaneConstrains2);
        gridPane.getColumnConstraints().add(columnGridPaneConstrains3);
        gridPane.getRowConstraints().add(rowGridPaneConstrains1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowGridPaneConstrains3);

        gridPane.getChildren().add(Button00);
        gridPane.getChildren().add(Button01);
        gridPane.getChildren().add(Button02);
        gridPane.getChildren().add(Button10);
        gridPane.getChildren().add(Button11);
        gridPane.getChildren().add(Button12);
        gridPane.getChildren().add(Button20);
        gridPane.getChildren().add(Button21);
        gridPane.getChildren().add(Button22);
        xOPane.getChildren().add(gridPane);
        getChildren().add(xOPane);

    }

}
