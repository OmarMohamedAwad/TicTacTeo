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
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public abstract class OnLineGamePageBase extends AnchorPane {

    protected final DropShadow dropShadow;
    protected final Line line;
    protected final ImageView LogoImage;
    protected final DropShadow LogoImageShadow;
    protected final Label TicTacTeoLabel;
    protected final DropShadow TicTacTeoLabelShadow;
    protected final GridPane GridPane;
    protected final ColumnConstraints FirstcolumnConstraints;
    protected final ColumnConstraints SecondColumnConstraints;
    protected final ColumnConstraints ThirdColumnConstraints;
    protected final RowConstraints FirstRowConstraints;
    protected final RowConstraints SecondRowConstraints;
    protected final RowConstraints ThirdRowConstraints;
    protected final Button Button00;
    protected final Button Button01;
    protected final Button Button02;
    protected final Button Button10;
    protected final Button Button11;
    protected final Button Button12;
    protected final Button Button20;
    protected final Button Button21;
    protected final Button Button22;
    protected final ImageView VSImage;
    protected final ImageView XImage;
    protected final ImageView OImage;
    protected final Label XLabel;
    protected final DropShadow XLabelShadow;
    protected final Label OLabel;
    protected final DropShadow OLabelShadow;
    protected final Button ExitButton;
    protected final InnerShadow ExitButtonShadow;
    protected final Button PlayAgainButton;
    protected final InnerShadow PlayAgainButtonShadow;

    public OnLineGamePageBase() {

        dropShadow = new DropShadow();
        line = new Line();
        LogoImage = new ImageView();
        LogoImageShadow = new DropShadow();
        TicTacTeoLabel = new Label();
        TicTacTeoLabelShadow = new DropShadow();
        GridPane = new GridPane();
        FirstcolumnConstraints = new ColumnConstraints();
        SecondColumnConstraints = new ColumnConstraints();
        ThirdColumnConstraints = new ColumnConstraints();
        FirstRowConstraints = new RowConstraints();
        SecondRowConstraints = new RowConstraints();
        ThirdRowConstraints = new RowConstraints();
        Button00 = new Button();
        Button01 = new Button();
        Button02 = new Button();
        Button10 = new Button();
        Button11 = new Button();
        Button12 = new Button();
        Button20 = new Button();
        Button21 = new Button();
        Button22 = new Button();
        VSImage = new ImageView();
        XImage = new ImageView();
        OImage = new ImageView();
        XLabel = new Label();
        XLabelShadow = new DropShadow();
        OLabel = new Label();
        OLabelShadow = new DropShadow();
        ExitButton = new Button();
        ExitButtonShadow = new InnerShadow();
        PlayAgainButton = new Button();
        PlayAgainButtonShadow = new InnerShadow();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");

        setEffect(dropShadow);

        line.setEndX(400.0);
        line.setFill(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);

        LogoImage.setFitHeight(45.0);
        LogoImage.setFitWidth(45.0);
        LogoImage.setLayoutX(14.0);
        LogoImage.setLayoutY(11.0);
        LogoImage.setPickOnBounds(true);
        LogoImage.setPreserveRatio(true);
        LogoImage.setImage(new Image(getClass().getResource("../images/options/tic-tac-toe-game.jpg").toExternalForm()));

        LogoImage.setEffect(LogoImageShadow);

        TicTacTeoLabel.setLayoutX(85.0);
        TicTacTeoLabel.setLayoutY(23.0);
        TicTacTeoLabel.setPrefHeight(25.0);
        TicTacTeoLabel.setPrefWidth(84.0);
        TicTacTeoLabel.setText("Tic Tac Teo");
        TicTacTeoLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        TicTacTeoLabel.setFont(new Font("SansSerif Bold", 15.0));

        TicTacTeoLabel.setEffect(TicTacTeoLabelShadow);

        GridPane.setLayoutX(143.0);
        GridPane.setLayoutY(142.0);
        GridPane.setPrefHeight(178.0);
        GridPane.setPrefWidth(221.0);

        FirstcolumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        FirstcolumnConstraints.setMinWidth(10.0);
        FirstcolumnConstraints.setPrefWidth(100.0);

        SecondColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        SecondColumnConstraints.setMinWidth(10.0);
        SecondColumnConstraints.setPrefWidth(100.0);

        ThirdColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        ThirdColumnConstraints.setMinWidth(10.0);
        ThirdColumnConstraints.setPrefWidth(100.0);

        FirstRowConstraints.setMinHeight(10.0);
        FirstRowConstraints.setPrefHeight(30.0);
        FirstRowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        SecondRowConstraints.setMinHeight(10.0);
        SecondRowConstraints.setPrefHeight(30.0);
        SecondRowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        ThirdRowConstraints.setMinHeight(10.0);
        ThirdRowConstraints.setPrefHeight(30.0);
        ThirdRowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        Button00.setMnemonicParsing(false);
        Button00.setPrefHeight(48.0);
        Button00.setPrefWidth(60.0);

        GridPane.setRowIndex(Button01, 1);
        Button01.setLayoutX(10.0);
        Button01.setLayoutY(16.0);
        Button01.setMnemonicParsing(false);
        Button01.setPrefHeight(48.0);
        Button01.setPrefWidth(60.0);

        GridPane.setRowIndex(Button02, 2);
        Button02.setLayoutX(10.0);
        Button02.setLayoutY(16.0);
        Button02.setMnemonicParsing(false);
        Button02.setPrefHeight(48.0);
        Button02.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button10, 1);
        Button10.setLayoutX(10.0);
        Button10.setLayoutY(16.0);
        Button10.setMnemonicParsing(false);
        Button10.setPrefHeight(48.0);
        Button10.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button11, 1);
        GridPane.setRowIndex(Button11, 1);
        Button11.setLayoutX(10.0);
        Button11.setLayoutY(16.0);
        Button11.setMnemonicParsing(false);
        Button11.setPrefHeight(48.0);
        Button11.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button12, 1);
        GridPane.setRowIndex(Button12, 2);
        Button12.setLayoutX(10.0);
        Button12.setLayoutY(16.0);
        Button12.setMnemonicParsing(false);
        Button12.setPrefHeight(48.0);
        Button12.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button20, 2);
        Button20.setLayoutX(10.0);
        Button20.setLayoutY(16.0);
        Button20.setMnemonicParsing(false);
        Button20.setPrefHeight(48.0);
        Button20.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button21, 2);
        GridPane.setRowIndex(Button21, 1);
        Button21.setLayoutX(10.0);
        Button21.setLayoutY(16.0);
        Button21.setMnemonicParsing(false);
        Button21.setPrefHeight(48.0);
        Button21.setPrefWidth(60.0);

        GridPane.setColumnIndex(Button22, 2);
        GridPane.setRowIndex(Button22, 2);
        Button22.setLayoutX(10.0);
        Button22.setLayoutY(16.0);
        Button22.setMnemonicParsing(false);
        Button22.setPrefHeight(48.0);
        Button22.setPrefWidth(60.0);

        VSImage.setFitHeight(78.0);
        VSImage.setFitWidth(83.0);
        VSImage.setLayoutX(209.0);
        VSImage.setLayoutY(70.0);
        VSImage.setPickOnBounds(true);
        VSImage.setPreserveRatio(true);
        VSImage.setImage(new Image(getClass().getResource("../images/gameMessages/vs.png").toExternalForm()));

        XImage.setFitHeight(84.0);
        XImage.setFitWidth(88.0);
        XImage.setLayoutX(16.0);
        XImage.setLayoutY(160.0);
        XImage.setPickOnBounds(true);
        XImage.setPreserveRatio(true);
        XImage.setImage(new Image(getClass().getResource("../images/options/x.jpg").toExternalForm()));

        OImage.setFitHeight(86.0);
        OImage.setFitWidth(88.0);
        OImage.setLayoutX(392.0);
        OImage.setLayoutY(160.0);
        OImage.setPickOnBounds(true);
        OImage.setPreserveRatio(true);
        OImage.setImage(new Image(getClass().getResource("../images/options/o.jpg").toExternalForm()));

        XLabel.setLayoutX(22.0);
        XLabel.setLayoutY(254.0);
        XLabel.setPrefHeight(26.0);
        XLabel.setPrefWidth(72.0);
        XLabel.setText("Your Turn");
        XLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        XLabel.setFont(new Font("SansSerif Bold", 15.0));

        XLabel.setEffect(XLabelShadow);

        OLabel.setLayoutX(398.0);
        OLabel.setLayoutY(254.0);
        OLabel.setPrefHeight(26.0);
        OLabel.setPrefWidth(72.0);
        OLabel.setText("Your Turn");
        OLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        OLabel.setFont(new Font("SansSerif Bold", 15.0));

        OLabel.setEffect(OLabelShadow);

        ExitButton.setLayoutX(143.0);
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

        ExitButton.setEffect(ExitButtonShadow);

        PlayAgainButton.setLayoutX(257.0);
        PlayAgainButton.setLayoutY(353.0);
        PlayAgainButton.setMaxHeight(37.0);
        PlayAgainButton.setMaxWidth(129.0);
        PlayAgainButton.setMnemonicParsing(false);
        PlayAgainButton.setPrefHeight(25.0);
        PlayAgainButton.setPrefWidth(103.0);
        PlayAgainButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        PlayAgainButton.setText("Play again");
        PlayAgainButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        PlayAgainButton.setFont(new Font(16.0));

        PlayAgainButton.setEffect(PlayAgainButtonShadow);

        getChildren().add(line);
        getChildren().add(LogoImage);
        getChildren().add(TicTacTeoLabel);
        GridPane.getColumnConstraints().add(FirstcolumnConstraints);
        GridPane.getColumnConstraints().add(SecondColumnConstraints);
        GridPane.getColumnConstraints().add(ThirdColumnConstraints);
        GridPane.getRowConstraints().add(FirstRowConstraints);
        GridPane.getRowConstraints().add(SecondRowConstraints);
        GridPane.getRowConstraints().add(ThirdRowConstraints);
        GridPane.getChildren().add(Button00);
        GridPane.getChildren().add(Button01);
        GridPane.getChildren().add(Button02);
        GridPane.getChildren().add(Button10);
        GridPane.getChildren().add(Button11);
        GridPane.getChildren().add(Button12);
        GridPane.getChildren().add(Button20);
        GridPane.getChildren().add(Button21);
        GridPane.getChildren().add(Button22);
        getChildren().add(GridPane);
        getChildren().add(VSImage);
        getChildren().add(XImage);
        getChildren().add(OImage);
        getChildren().add(XLabel);
        getChildren().add(OLabel);
        getChildren().add(ExitButton);
        getChildren().add(PlayAgainButton);

    }
}
