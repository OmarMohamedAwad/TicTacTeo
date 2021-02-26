package tictacteo;

import java.util.Arrays;
import java.util.Random;
import java.awt.AWTException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
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
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import model.database.Player;
import model.database.History;
import model.database.HistoryModel;
import model.database.Player;
import model.database.PlayerModel;

public class GamePage extends AnchorPane {

    Button[][] board;
    Thread thread;
    static boolean stopThread = true;
    List<String> record = new ArrayList<String>();
    List<String> position = new ArrayList<String>();
    boolean computerTurn = false;
    Random random = new Random();
    Random rand = new Random();
    protected final DropShadow ds;
    String first;
    String userChar;
    String computerChar;
    int num = 0;
    boolean xSelected;
    int id;
    int userCount;
    Player user;
    int score = 0;
    String status = "";
    History newUserHistory = new History();
    String gameLevel;
    boolean gameOver;

    protected final ImageView logoImage;
    protected final DropShadow logoShadowImage;
    protected final Label gameName;
    protected final DropShadow gameNameShadow;
    protected final Line line;
    protected final Label scoreLabel;
    protected final Label you;
    protected final Label computer;

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
    protected final DropShadow anchorPaneShadow;
    protected final ColumnConstraints columnGridPaneConstraints1;
    protected final ColumnConstraints columnGridPaneConstrains2;
    protected final ColumnConstraints columnGridPaneConstrains3;
    protected final RowConstraints rowGridPaneConstrains1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowGridPaneConstrains3;

    protected final DropShadow dropShadow;
    protected final DropShadow dropShadow0;
    protected final InnerShadow innerShadow1;

    protected final DropShadow dropShadow1;
    protected final DropShadow dropShadow2;

    protected final InnerShadow innerShadow3;

    protected final InnerShadow innerShadow4;
    protected final Button Button00;
    protected final Button Button01;
    protected final Button Button02;
    protected final Button Button10;
    protected final Button Button11;
    protected final Button Button12;
    protected final Button Button20;
    protected final Button Button21;
    protected final Button Button22;
    protected final DropShadow looserDropShadow;
    protected final ImageView vsImageView;
    protected final DropShadow dropShadow3;
    protected final DropShadow dropShadow4;
    protected final Pane backPane;
    protected final Pane endGamePane;
    protected final ImageView endGameImageView;
    protected final ImageView xIcone;
    protected final ImageView yIcone;
    protected final ImageView vsIcon;
    protected final Button playAgainEnd;
    protected final Button watchVideoEndGame;
    protected final InnerShadow innerShadow0;
    protected final Label playerNameLabel;
    protected final Label playerCharacter;
    protected final Label playerNameEndGameLabel;
    protected final Label characterEndGameLable;
    protected final InnerShadow innerShadow;
    protected final Pane containerPane;
    protected final ColumnConstraints firstColumnConstraints;
    protected final ColumnConstraints secondColumnConstraints;
    protected final ColumnConstraints thirdColumnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
   

    public GamePage(Stage primary, Player currentPlayer, boolean xSelected, Thread thread) {
        this.user = currentPlayer;
        this.thread = thread;
        stopThread = true;
        this.xSelected = xSelected;
        ds = new DropShadow(20, Color.AQUA);
        backPane = new Pane();
        this.id = id;
        String userName = user.getUserName();
        newUserHistory.setVsPlayer("Computer" + computerChar);
        newUserHistory.setPlayerId(id);
        this.id = id;

        logoImage = new ImageView();
        logoShadowImage = new DropShadow();
        gameName = new Label();
        you = new Label();
        computer = new Label();
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
        dropShadow = new DropShadow();
        xIcone = new ImageView();
        yIcone = new ImageView();
        vsIcon = new ImageView();
        innerShadow = new InnerShadow();
        innerShadow0 = new InnerShadow();
        playerNameLabel = new Label();
        playerCharacter = new Label();
        dropShadow0 = new DropShadow();
        innerShadow1 = new InnerShadow();
        dropShadow1 = new DropShadow();
        dropShadow2 = new DropShadow();
        innerShadow3 = new InnerShadow();
        innerShadow4 = new InnerShadow();
        dropShadow3 = new DropShadow();
        anchorPaneShadow = new DropShadow();

        Button00 = new Button();
        Button01 = new Button();
        Button02 = new Button();
        Button10 = new Button();
        Button11 = new Button();
        Button12 = new Button();
        Button20 = new Button();
        Button21 = new Button();
        Button22 = new Button();

        containerPane = new Pane();
        firstColumnConstraints = new ColumnConstraints();
        secondColumnConstraints = new ColumnConstraints();
        thirdColumnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        looserDropShadow = new DropShadow();
        vsImageView = new ImageView();
        dropShadow4 = new DropShadow();
        endGamePane = new Pane();
        endGameImageView = new ImageView();
        playAgainEnd = new Button();
        watchVideoEndGame = new Button();
        playerNameEndGameLabel = new Label();
        characterEndGameLable = new Label();
        easyButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (gameLevel.equals("unknown")) {
                    System.out.println("You choose Easy");
                    gameLevel = "easy";

                }

            }
        });
        middleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (gameLevel.equals("unknown")) {
                    System.out.println("You choose Middle");
                    gameLevel = "Middle";

                }
            }
        });
        hardButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (gameLevel.equals("unknown")) {
                    System.out.println("You choose Hard");
                    gameLevel = "hard";
                }

            }
        });
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                PlayerModel.updatePlayerScore(id, score);
                primary.setScene(new Scene(new OptionPage(primary, currentPlayer, thread)));
            }
        });
        playAgainButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                gameReset();
                startGame();
            }
        });

        if (xSelected) {
            you.setText("YOU");
            you.setTextFill(javafx.scene.paint.Color.WHITE);
            you.setFont(new Font("SansSerif Bold", 15.0));
        } else {
            computer.setText("YOU");
            computer.setTextFill(javafx.scene.paint.Color.WHITE);
            computer.setFont(new Font("SansSerif Bold", 15.0));
        }
        Button00.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (Button00.getText() == "") {
                    Button00.setText(first);
                    Button00.setFont(new Font("SansSerif Bold", 15.0));
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }
            }
        });
        Button01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (Button01.getText() == "") {
                    Button01.setText(first);
                    Button01.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("01");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);

                }

            }

        });
        Button02.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev
            ) {
                if (Button02.getText() == "") {
                    Button02.setText(first);
                    Button02.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("02");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }
        });
        Button10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (Button10.getText() == "") {
                    Button10.setText(first);
                    Button10.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("10");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }
        });

        Button11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (Button11.getText() == "") {
                    Button11.setText(first);
                    Button11.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("11");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }
        });
        Button12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                if (Button12.getText() == "") {
                    Button12.setText(first);
                    Button12.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("12");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }

        });
        Button20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                if (Button20.getText() == "") {
                    Button20.setText(first);
                    Button20.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("20");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }
        });
        Button21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                if (Button21.getText() == "") {
                    Button21.setText(first);
                    Button21.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("21");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }
        });
        Button22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                if (Button22.getText() == "") {
                    Button22.setText(first);
                    Button22.setFont(new Font("SansSerif Bold", 15.0));
                    record.add(first);
                    position.add("22");
                    switchTurns();
                    computerAlgorithm();
                    check(userName);
                }

            }
        });

        playAgainEnd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                backPane.setStyle("-fx-background-color: #0c0721;visibility: false;");
                endGamePane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

                gameReset();

            }
        });

        watchVideoEndGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                primary.setScene(new Scene(new RecordPage(primary, currentPlayer, record, position, thread, "computer")));
            }
        });
        setDesignProperty();
        endGameDesign();
        startGame();
    }

    public void initialize() {
        board = new Button[3][3];
        board[0][0] = Button00;
        board[0][1] = Button01;
        board[0][2] = Button02;
        board[1][0] = Button10;
        board[1][1] = Button11;
        board[1][2] = Button12;
        board[2][0] = Button20;
        board[2][1] = Button21;
        board[2][2] = Button22;
        gameLevel = "unknown";
        gameOver = false;
        first="";

    }

    public void computerAlgorithm() {
        boolean empty = false;
        int row, column;
        String num1, num2, num3;
        if (first == computerChar) {
            while (!empty) {
                row = rand.nextInt((2 - 0) + 1) + 0;
                column = rand.nextInt((2 - 0) + 1) + 0;
                if (board[row][column].getText() == "") {
                    board[row][column].setText(computerChar);
                    num1 = Integer.toString(row);
                    num2 = Integer.toString(column);
                    num3 = num1 + num2;
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(num3);
                    record.add(first);
                    position.add(num3);
                    empty = true;
                }
            }
            switchTurns();
        }
    }

    public String firstTurn() {
        if (random.nextInt(2) == 0) {
            computerTurn = true;
            if (computerChar == "O") {
                oImage.setEffect(ds);
                first = computerChar;
                return first;
            } else if (computerChar == "X") {
                xImage.setEffect(ds);
                first = computerChar;
                return first;
            }
            return null;
        } else {
            computerTurn = false;
            switch (userChar) {
                case "X":
                    xImage.setEffect(ds);
                    first = userChar;
                    return first;
                case "O":
                    oImage.setEffect(ds);
                    first = userChar;
                    return first;
                default:
                    return null;
            }

        }

    }
    public void decorateWin() {
    }
    public void check(String userName) {

        String b1 = Button00.getText();
        String b2 = Button01.getText();
        String b3 = Button02.getText();
        String b4 = Button10.getText();
        String b5 = Button11.getText();
        String b6 = Button12.getText();
        String b7 = Button20.getText();
        String b8 = Button21.getText();
        String b9 = Button22.getText();

        if (b1 == "X" && b2 == "X" && b3 == "X") {
            Button00.setStyle("-fx-background-color: yellow; ");
            Button01.setStyle("-fx-background-color: yellow; ");
            Button02.setStyle("-fx-background-color: yellow; ");
            userXWin(status);
        } else if (b4 == "X" && b5 == "X" && b6 == "X") {

            Button10.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button12.setStyle("-fx-background-color: yellow; ");
            userXWin(userName);

        } else if (b7 == "X" && b8 == "X" && b9 == "X") {

            Button20.setStyle("-fx-background-color: yellow; ");
            Button21.setStyle("-fx-background-color: yellow; ");
            Button22.setStyle("-fx-background-color: yellow; ");
            userXWin(userName);

        } else if (b1 == "X" && b4 == "X" && b7 == "X") {

            Button00.setStyle("-fx-background-color: yellow; ");
            Button10.setStyle("-fx-background-color: yellow; ");
            Button20.setStyle("-fx-background-color: yellow; ");
            userXWin(userName);

        } else if (b2 == "X" && b5 == "X" && b8 == "X") {

            Button01.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button21.setStyle("-fx-background-color: yellow; ");
            userXWin(userName);

        } else if (b3 == "X" && b6 == "X" && b9 == "X") {

            Button02.setStyle("-fx-background-color: yellow; ");
            Button12.setStyle("-fx-background-color: yellow; ");
            Button22.setStyle("-fx-background-color: yellow; ");

            userXWin(userName);
        } else if (b1 == "X" && b5 == "X" && b9 == "X") {

            Button00.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button22.setStyle("-fx-background-color: yellow; ");

            userXWin(userName);
        } else if (b3 == "X" && b5 == "X" && b7 == "X") {

            Button02.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button20.setStyle("-fx-background-color: yellow; ");

            userXWin(userName);
        } else if (b1 == "O" && b2 == "O" && b3 == "O") {

            Button00.setStyle("-fx-background-color: yellow; ");
            Button01.setStyle("-fx-background-color: yellow; ");
            Button02.setStyle("-fx-background-color: yellow; ");
            userOWin(userName);

        } else if (b4 == "O" && b5 == "O" && b6 == "O") {

            Button10.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button12.setStyle("-fx-background-color: yellow; ");
            userOWin(userName);

        } else if (b7 == "O" && b8 == "O" && b9 == "O") {

            Button20.setStyle("-fx-background-color: yellow; ");
            Button21.setStyle("-fx-background-color: yellow; ");
            Button22.setStyle("-fx-background-color: yellow; ");
            userOWin(userName);

        } else if (b1 == "O" && b4 == "O" && b7 == "O") {
            Button00.setStyle("-fx-background-color: yellow; ");
            Button10.setStyle("-fx-background-color: yellow; ");
            Button20.setStyle("-fx-background-color: yellow; ");

            userOWin(userName);
        } else if (b2 == "O" && b5 == "O" && b8 == "O") {
            Button01.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button21.setStyle("-fx-background-color: yellow; ");

            userOWin(userName);

        } else if (b3 == "O" && b6 == "O" && b9 == "O") {
            Button02.setStyle("-fx-background-color: yellow; ");
            Button12.setStyle("-fx-background-color: yellow; ");
            Button22.setStyle("-fx-background-color: yellow; ");

            userOWin(userName);
        } else if (b1 == "O" && b5 == "O" && b9 == "O") {
            Button00.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button22.setStyle("-fx-background-color: yellow; ");

            userOWin(userName);
        } else if (b3 == "O" && b5 == "O" && b7 == "O") {
            Button02.setStyle("-fx-background-color: yellow; ");
            Button11.setStyle("-fx-background-color: yellow; ");
            Button20.setStyle("-fx-background-color: yellow; ");

            userOWin(status);

        } else if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "") {
            userEqual(userName);
        }

    }

    public void userXWin(String userName) {
        if (userChar == "X") {
            score++;
            status = "winner";
            oImage.setEffect(null);
            xImage.setEffect(null);
            scoreLabel.setText("Score :" + score);
            newUserHistory.setStatus(status);
            HistoryModel.addHistory(newUserHistory);
            displayEndGame("../view/images/gameMessages/win.png");
            playerNameEndGameLabel.setText(userName);
            characterEndGameLable.setText(userChar);

        } else {
            status = "looser";
            oImage.setEffect(null);
            xImage.setEffect(null);
            displayEndGame("../view/images/gameMessages/loos.png");
            playerNameEndGameLabel.setText(userName);
            characterEndGameLable.setText(userChar);
            newUserHistory.setStatus(status);
            HistoryModel.addHistory(newUserHistory);

        }
    }

    public void userOWin(String userName) {
        if (userChar == "O") {
            score++;
            status = "winner";
            scoreLabel.setText("Score :" + score);
            oImage.setEffect(null);
            xImage.setEffect(null);
            displayEndGame("../view/images/gameMessages/win.png");
            playerNameEndGameLabel.setText(userName);
            characterEndGameLable.setText(userChar);
            newUserHistory.setStatus(status);
            HistoryModel.addHistory(newUserHistory);

        } else {
            status = "loose";
            oImage.setEffect(null);
            xImage.setEffect(null);
            displayEndGame("../view/images/gameMessages/loos.png");
            playerNameEndGameLabel.setText(userName);
            characterEndGameLable.setText(userChar);
            newUserHistory.setStatus(status);
            HistoryModel.addHistory(newUserHistory);

        }
    }

    public void userEqual(String userName) {
        status = "draw";
        displayEndGame("../view/images/gameMessages/drawc.jpg");
        playerNameEndGameLabel.setText(userName);
        characterEndGameLable.setText(userChar);
        newUserHistory.setStatus(status);
        HistoryModel.addHistory(newUserHistory);

    }

    public void displayEndGame(String img) {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (stopThread) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            backPane.setStyle("-fx-background-color: #0c0721; visibility: true;");
                            endGameImageView.setImage(new Image(getClass().getResource(img).toExternalForm()));
                            endGamePane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: true;");
                            stopThread = false;
                        }
                    });

                }

            }

        });
        thread.start();
    }

    public void gameReset() {
        stopThread=true;
        record.clear();
        position.clear();
        xImage.setEffect(null);
        oImage.setEffect(null);
        first = firstTurn();
        xImage.setEffect(null);
        oImage.setEffect(null);
        first = firstTurn();
        Button00.setText("");
        Button01.setText("");
        Button02.setText("");
        Button10.setText("");
        Button11.setText("");
        Button12.setText("");
        Button20.setText("");
        Button21.setText("");
        Button22.setText("");
        Button00.setStyle("-fx-background-color: #ececec;");
        Button01.setStyle("-fx-background-color: #ececec;");
        Button02.setStyle("-fx-background-color: #ececec;");
        Button10.setStyle("-fx-background-color: #ececec;");
        Button11.setStyle("-fx-background-color: #ececec; ");
        Button12.setStyle("-fx-background-color:  #ececec ;");
        Button20.setStyle("-fx-background-color:  #ececec ;");
        Button21.setStyle("-fx-background-color:  #ececec ;");
        Button22.setStyle("-fx-background-color:  #ececec ;");
        startGame();

    }

    public String userChar() {
        String userChar;
        if (xSelected) {
            userChar = "X";
            computerChar = "O";
            return userChar;
        } else {
            userChar = "O";
            computerChar = "X";
            return userChar;
        }

    }

    public void switchTurns() {
        if (oImage.getEffect() == ds) {
            oImage.setEffect(null);
            xImage.setEffect(ds);
            first = "X";

        } else if (xImage.getEffect() == ds) {
            xImage.setEffect(null);
            oImage.setEffect(ds);
            first = "O";

        }

    }

    public void startGame() {
        userChar = userChar();
        initialize();
        
    }
    public void easyLevel(){
        firstTurn();
        computerAlgorithm();
        
    }

    public void setDesignProperty() {
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
        scoreLabel.setText("Score : 0");
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
        xImage.setLayoutX(145.0);
        xImage.setLayoutY(89.0);
        you.setLayoutX(115.0);
        you.setLayoutY(105.0);
        xImage.setPickOnBounds(true);
        xImage.setPreserveRatio(true);
        xImage.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));
        oImage.setFitHeight(55.0);
        oImage.setFitWidth(55.0);
        computer.setLayoutX(330.0);
        computer.setLayoutY(105.0);
        oImage.setLayoutX(250.0);
        oImage.setLayoutY(89.0);
        oImage.setPickOnBounds(true);
        oImage.setPreserveRatio(true);
        oImage.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));
        exitButton.setLayoutX(110.0);
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

        exitButton.setEffect(exitButtonShadow);
        exitButton.setEffect(exitButtonShadow);
        playAgainButton.setLayoutX(230.0);
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
        

        Button00.setLayoutX(178.0);
        Button00.setLayoutY(11.0);
        Button00.setMnemonicParsing(false);
        Button00.setPrefHeight(48.0);
        Button00.setPrefWidth(60.0);
        GridPane.setRowIndex(Button01, 1);
        Button01.setLayoutX(10.0);
        Button01.setLayoutY(118.0);
        Button01.setMnemonicParsing(false);
        Button01.setPrefHeight(48.0);
        Button01.setPrefWidth(60.0);

        GridPane.setRowIndex(Button02, 2);
        Button02.setLayoutX(10.0);
        Button02.setLayoutY(11.0);
        Button02.setMnemonicParsing(false);
        Button02.setPrefHeight(48.0);
        Button02.setPrefWidth(60.0);
        GridPane.setColumnIndex(Button10, 1);
        Button10.setLayoutX(10.0);
        Button10.setLayoutY(63.0);
        Button10.setMnemonicParsing(false);
        Button10.setPrefHeight(48.0);
        Button10.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button10, 1);
        Button10.setLayoutX(10.0);
        Button10.setLayoutY(63.0);
        Button10.setMnemonicParsing(false);
        Button10.setPrefHeight(48.0);
        Button10.setPrefWidth(60.0);
        GridPane.setColumnIndex(Button11, 1);
        GridPane.setRowIndex(Button11, 1);
        Button11.setLayoutX(94.0);
        Button11.setLayoutY(11.0);
        Button11.setMnemonicParsing(false);
        Button11.setPrefHeight(48.0);
        Button11.setPrefWidth(60.0);
        GridPane.setColumnIndex(Button12, 1);
        GridPane.setRowIndex(Button12, 2);
        Button12.setLayoutX(94.0);
        Button12.setLayoutY(63.0);
        Button12.setMnemonicParsing(false);
        Button12.setPrefHeight(48.0);
        Button12.setPrefWidth(60.0);
        GridPane.setColumnIndex(Button20, 2);
        Button20.setMnemonicParsing(false);
        Button20.setPrefHeight(48.0);
        Button20.setPrefWidth(60.0);
        GridPane.setColumnIndex(Button21, 2);
        GridPane.setRowIndex(Button21, 1);
        Button21.setLayoutX(178.0);
        Button21.setLayoutY(11.0);
        Button21.setMnemonicParsing(false);
        Button21.setPrefHeight(48.0);
        Button21.setPrefWidth(60.0);
        GridPane.setColumnIndex(Button22, 2);
        GridPane.setRowIndex(Button22, 2);
        Button22.setLayoutX(178.0);
        Button22.setLayoutY(11.0);
        Button22.setMnemonicParsing(false);
        Button22.setPrefHeight(48.0);
        Button22.setPrefWidth(60.0);
        setEffect(anchorPaneShadow);
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
        getChildren().add(you);
        getChildren().add(computer);
        getChildren().add(exitButton);
        getChildren().add(playAgainButton);
        gridPane.setLayoutX(5.0);
        gridPane.setLayoutY(-8.0);
        gridPane.setPrefHeight(178.0);
        gridPane.setPrefWidth(221.0);
        gridPane.setStyle("-fx-background-color: #343F4B;");

        containerPane.setLayoutX(141.0);
        containerPane.setLayoutY(158.0);
        containerPane.setPrefHeight(159.0);
        containerPane.setPrefWidth(218.0);
        containerPane.setStyle("-fx-background-color: #343F4B;");

       

        firstColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        firstColumnConstraints.setMinWidth(10.0);
        firstColumnConstraints.setPrefWidth(100.0);

        secondColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        secondColumnConstraints.setMinWidth(10.0);
        secondColumnConstraints.setPrefWidth(100.0);

        thirdColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        thirdColumnConstraints.setMinWidth(10.0);
        thirdColumnConstraints.setPrefWidth(100.0);

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
        gridPane.getColumnConstraints().add(firstColumnConstraints);
        gridPane.getColumnConstraints().add(secondColumnConstraints);
        gridPane.getColumnConstraints().add(thirdColumnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(Button00);
        gridPane.getChildren().add(Button01);
        gridPane.getChildren().add(Button02);
        gridPane.getChildren().add(Button10);
        gridPane.getChildren().add(Button11);
        gridPane.getChildren().add(Button12);
        gridPane.getChildren().add(Button20);
        gridPane.getChildren().add(Button21);
        gridPane.getChildren().add(Button22);
        containerPane.getChildren().add(gridPane);
        getChildren().add(containerPane);
    }

    public void endGameDesign() {
        backPane.setLayoutX(0.0);
        backPane.setLayoutY(69.0);
        backPane.setOpacity(0.7);
        backPane.setPrefHeight(360.0);
        backPane.setPrefWidth(500.0);
        backPane.setStyle("-fx-background-color: #0c0721; visibility: false;");

        endGamePane.setLayoutX(78.0);
        endGamePane.setLayoutY(132.0);
        endGamePane.setPrefHeight(224.0);
        endGamePane.setPrefWidth(344.0);
        endGamePane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

        endGameImageView.setFitHeight(168.0);
        endGameImageView.setFitWidth(335.0);
        endGameImageView.setLayoutX(5.0);
        endGameImageView.setLayoutY(4.0);
        //endGameImageView.setImage(new Image(getClass().getResource("../view/images/gameMessages/win.jpg").toExternalForm()));

        xIcone.setFitHeight(45.0);
        xIcone.setFitWidth(72.0);
        xIcone.setLayoutX(107.0);
        xIcone.setLayoutY(-30.0);
        xIcone.setImage(new Image(getClass().getResource("../view/images/gameMessages/x.png").toExternalForm()));

        yIcone.setFitHeight(45.0);
        yIcone.setFitWidth(88.0);
        yIcone.setLayoutX(167.0);
        yIcone.setLayoutY(-29.0);
        yIcone.setImage(new Image(getClass().getResource("../view/images/gameMessages/o.png").toExternalForm()));

        vsIcon.setFitHeight(45.0);
        vsIcon.setFitWidth(45.0);
        vsIcon.setLayoutX(148.0);
        vsIcon.setLayoutY(-8.0);
        vsIcon.setImage(new Image(getClass().getResource("../view/images/gameMessages/vs.png").toExternalForm()));

        playAgainEnd.setLayoutX(35.0);
        playAgainEnd.setLayoutY(185.0);
        playAgainEnd.setMnemonicParsing(false);
        playAgainEnd.setPrefHeight(17.0);
        playAgainEnd.setPrefWidth(100.0);
        playAgainEnd.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        playAgainEnd.getStyleClass().add("play-btn");
        playAgainEnd.setText("Play Again");
        playAgainEnd.setTextFill(javafx.scene.paint.Color.WHITE);

        playAgainEnd.setEffect(innerShadow);

        watchVideoEndGame.setLayoutX(190.0);
        watchVideoEndGame.setLayoutY(185.0);
        watchVideoEndGame.setMnemonicParsing(false);
        watchVideoEndGame.setPrefHeight(17.0);
        watchVideoEndGame.setPrefWidth(100.0);
        watchVideoEndGame.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        watchVideoEndGame.getStyleClass().add("play-btn");
        watchVideoEndGame.setText("Wach Video");
        watchVideoEndGame.setTextFill(javafx.scene.paint.Color.WHITE);

        watchVideoEndGame.setEffect(innerShadow0);

        playerNameLabel.setLayoutX(40.0);
        playerNameLabel.setLayoutY(150.0);
        playerNameLabel.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerNameLabel.setText("Player:");
        playerNameLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerNameLabel.setFont(new Font(15.0));

        playerCharacter.setLayoutX(195.0);
        playerCharacter.setLayoutY(150.0);
        playerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerCharacter.setText("Character:");
        playerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerCharacter.setFont(new Font(15.0));

        playerNameEndGameLabel.setLayoutX(100.0);
        playerNameEndGameLabel.setText(user.getUserName());
        playerNameEndGameLabel.setLayoutY(150.0);
        playerNameEndGameLabel.setPrefHeight(21.0);
        playerNameEndGameLabel.setPrefWidth(80.0);
        playerNameEndGameLabel.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerNameEndGameLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerNameEndGameLabel.setFont(new Font(13.0));

        characterEndGameLable.setLayoutX(275.0);
        characterEndGameLable.setLayoutY(150.0);
        characterEndGameLable.setPrefHeight(21.0);
        characterEndGameLable.setPrefWidth(50.0);
        characterEndGameLable.setText(userChar);
        characterEndGameLable.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        characterEndGameLable.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        characterEndGameLable.setFont(new Font(13.0));

        getChildren().add(backPane);
        endGamePane.getChildren().add(endGameImageView);
        endGamePane.getChildren().add(xIcone);
        endGamePane.getChildren().add(yIcone);
        endGamePane.getChildren().add(vsIcon);
        endGamePane.getChildren().add(playAgainEnd);
        endGamePane.getChildren().add(watchVideoEndGame);
        endGamePane.getChildren().add(playerNameLabel);
        endGamePane.getChildren().add(playerCharacter);
        endGamePane.getChildren().add(playerNameEndGameLabel);
        endGamePane.getChildren().add(characterEndGameLable);
        getChildren().add(endGamePane);

    }

//    public int evaluate(Button board[][]) {
//        // Checking for Rows for X or O victory. 
//        for (int row = 0; row < 3; row++) {
//            if (board[row][0].getText().equals(board[row][1].getText())
//                    && board[row][1].getText().equals(board[row][2].getText())) {
//                if (board[row][0].getText().equals(userChar)) {
//                    return +10;
//                } else if (board[row][0].getText().equals(computerChar)) {
//                    return -10;
//                }
//            }
//        }
//
//        // Checking for Columns for X or O victory. 
//        for (int col = 0; col < 3; col++) {
//            if (board[0][col].getText().equals(board[1][col].getText())
//                    && board[1][col].getText().equals(board[2][col].getText())) {
//                if (board[0][col].getText().equals(userChar)) {
//                    return +10;
//                } else if (board[0][col].getText().equals(computerChar)) {
//                    return -10;
//                }
//            }
//        }
//
//        // Checking for Diagonals for X or O victory. 
//        if (board[0][0].getText().equals(board[1][1].getText()) && board[1][1].getText().equals(board[2][2].getText())) {
//            if (board[0][0].getText().equals(userChar)) {
//                return +10;
//            } else if (board[0][0].getText().equals(computerChar)) {
//                return -10;
//            }
//        }
//
//        if (board[0][2].getText().equals(board[1][1].getText()) && board[1][1].getText().equals(board[2][0].getText())) {
//            if (board[0][2].getText().equals(userChar)) {
//                return +10;
//            } else if (board[0][2].getText().equals(computerChar)) {
//                return -10;
//            }
//        }
//        // Else if none of them have won then return 0 
//        return 0;
//    }
}
