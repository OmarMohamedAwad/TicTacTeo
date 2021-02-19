package tictacteo;

import java.util.ArrayList;
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
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.database.History;
import model.database.HistoryModels;

public class PlayerHistoryPage extends AnchorPane {

    protected final ImageView progressImageView;
    protected final ImageView maxScoreView;
    protected final DropShadow dropShadow;
    protected final Label titleLabel;
    protected final ImageView winningTimesImageView;
    protected final DropShadow dropShadow0;
    protected final Button backToDashboardButton;
    protected final InnerShadow backInnerShadow;
    protected final Label winningTimesLableView;
    protected final InnerShadow innerShadow;
    protected final Label looseTimeLabelView;
    protected final InnerShadow innerShadow0;
    protected final Label maxScoreLabelView;
    protected final InnerShadow innerShadow1;
    protected final ScrollPane scrollPane;
    protected final TableView myHisoryTabelView;
    protected final DropShadow tableDropShadow;
    protected final TableColumn gamesColumn;
    protected final TableColumn dateColumn;
    protected final TableColumn vsPlayerColumn;
    protected final TableColumn statusolumn;
    protected final ImageView looserImageView;
    protected final DropShadow dropShadow2;
    protected final Rectangle separatorRectangle;
    protected final ImageView logoImage;
    protected final DropShadow dropShadow3;
    protected final Label userNameLabel;

    @SuppressWarnings("empty-statement")
    public PlayerHistoryPage(Stage primary , int PlayerId) {
        int playerid = 2;
PlayerId = playerid;
        progressImageView = new ImageView();
        maxScoreView = new ImageView();
        dropShadow = new DropShadow();
        titleLabel = new Label();
        winningTimesImageView = new ImageView();
        dropShadow0 = new DropShadow();
        ///////////////////////////BACK TO DASHBOARD PAGE AGAIN\\\\\\\\\\
        backToDashboardButton = new Button();
        backToDashboardButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                primary.setScene(new Scene(new MyDashboardPage(primary,1)));
            }
        });
        backInnerShadow = new InnerShadow();
        winningTimesLableView = new Label();
        innerShadow = new InnerShadow();
        looseTimeLabelView = new Label();
        innerShadow0 = new InnerShadow();
        maxScoreLabelView = new Label();
        innerShadow1 = new InnerShadow();
        scrollPane = new ScrollPane();
        myHisoryTabelView = new TableView();
        gamesColumn = new TableColumn();
        dateColumn = new TableColumn();
        vsPlayerColumn = new TableColumn();
        statusolumn = new TableColumn();
        looserImageView = new ImageView();
        dropShadow2 = new DropShadow();
        separatorRectangle = new Rectangle();
        logoImage = new ImageView();
        dropShadow3 = new DropShadow();
        tableDropShadow = new DropShadow();
        userNameLabel = new Label();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(503.0);
        setStyle("-fx-background-color: #343F4B;");

        progressImageView.setFitHeight(30.0);
        progressImageView.setFitWidth(45.0);
        progressImageView.setLayoutX(128.0);
        progressImageView.setLayoutY(69.0);
        progressImageView.setPickOnBounds(true);
        progressImageView.setPreserveRatio(true);
        progressImageView.setImage(new Image(getClass().getResource("../view/images/myHistory/progress.PNG").toExternalForm()));

        maxScoreView.setFitHeight(60.0);
        maxScoreView.setFitWidth(60.0);
        maxScoreView.setLayoutX(379.0);
        maxScoreView.setLayoutY(112.0);
        maxScoreView.setPickOnBounds(true);
        maxScoreView.setPreserveRatio(true);
        maxScoreView.setImage(new Image(getClass().getResource("../view/images/myHistory/big-win.jpg").toExternalForm()));

        maxScoreView.setEffect(dropShadow);

        titleLabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        titleLabel.setLayoutX(176.0);
        titleLabel.setLayoutY(67.0);
        titleLabel.setPrefHeight(32.0);
        titleLabel.setPrefWidth(167.0);
        titleLabel.setStyle("-fx-background-color: #343F4B; -fx-alignment: center;");
        titleLabel.setText("See Your Progress");
        titleLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        titleLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        titleLabel.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS);
        titleLabel.setFont(new Font("System Bold", 18.0));

        winningTimesImageView.setFitHeight(60.0);
        winningTimesImageView.setFitWidth(60.0);
        winningTimesImageView.setLayoutX(64.0);
        winningTimesImageView.setLayoutY(112.0);
        winningTimesImageView.setPickOnBounds(true);
        winningTimesImageView.setPreserveRatio(true);
        winningTimesImageView.setImage(new Image(getClass().getResource("../view/images/myHistory/max-score.jpg").toExternalForm()));

        winningTimesImageView.setEffect(dropShadow0);

        backToDashboardButton.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        backToDashboardButton.setLayoutX(197.0);
        backToDashboardButton.setLayoutY(375.0);
        backToDashboardButton.setMnemonicParsing(false);
        backToDashboardButton.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        backToDashboardButton.setPrefHeight(26.0);
        backToDashboardButton.setPrefWidth(114.0);
        backToDashboardButton.setStyle("-fx-background-radius: 15; -fx-background-color: #3065b5;");
        backToDashboardButton.setText("Back");
        backToDashboardButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcf9f9"));
        backToDashboardButton.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS);

        backInnerShadow.setHeight(10.04);
        backInnerShadow.setRadius(4.8774999999999995);
        backInnerShadow.setWidth(11.47);
        backToDashboardButton.setEffect(backInnerShadow);

        winningTimesLableView.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        winningTimesLableView.setLayoutX(47.0);
        winningTimesLableView.setLayoutY(181.0);
        winningTimesLableView.setPrefHeight(32.0);
        winningTimesLableView.setPrefWidth(101.0);
        winningTimesLableView.setStyle("-fx-background-color: white; -fx-border-radius: 5px; -fx-alignment: center;");
        winningTimesLableView.setText("You Win # Times");
        winningTimesLableView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        winningTimesLableView.setTextFill(javafx.scene.paint.Color.valueOf("#5555d2"));
        winningTimesLableView.setFont(new Font("System Bold Italic", 10.0));

        innerShadow.setColor(javafx.scene.paint.Color.valueOf("#512304"));
        innerShadow.setHeight(25.77);
        innerShadow.setRadius(11.192499999999999);
        winningTimesLableView.setEffect(innerShadow);

        looseTimeLabelView.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        looseTimeLabelView.setLayoutX(206.0);
        looseTimeLabelView.setLayoutY(181.0);
        looseTimeLabelView.setPrefHeight(32.0);
        looseTimeLabelView.setPrefWidth(101.0);
        looseTimeLabelView.setStyle("-fx-background-color: white; -fx-border-radius: 5px; -fx-alignment: center;");
        looseTimeLabelView.setText("You Lose # Times");
        looseTimeLabelView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        looseTimeLabelView.setTextFill(javafx.scene.paint.Color.valueOf("#5555d2"));
        looseTimeLabelView.setFont(new Font("System Bold Italic", 10.0));

        innerShadow0.setColor(javafx.scene.paint.Color.valueOf("#512304"));
        innerShadow0.setHeight(25.77);
        innerShadow0.setRadius(11.192499999999999);
        looseTimeLabelView.setEffect(innerShadow0);

        maxScoreLabelView.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        maxScoreLabelView.setLayoutX(365.0);
        maxScoreLabelView.setLayoutY(179.0);
        maxScoreLabelView.setPrefHeight(32.0);
        maxScoreLabelView.setPrefWidth(88.0);
        maxScoreLabelView.setStyle("-fx-alignment: center; -fx-background-color: white; -fx-border-radius: 5px;");
        maxScoreLabelView.setText("The MaxScore #");
        maxScoreLabelView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        maxScoreLabelView.setTextFill(javafx.scene.paint.Color.valueOf("#5555d2"));
        maxScoreLabelView.setFont(new Font("System Bold Italic", 10.0));

        innerShadow1.setColor(javafx.scene.paint.Color.valueOf("#512304"));
        innerShadow1.setHeight(25.77);
        innerShadow1.setRadius(11.192499999999999);
        maxScoreLabelView.setEffect(innerShadow1);

        scrollPane.setLayoutX(47.0);
        scrollPane.setLayoutY(227.0);
        scrollPane.setPrefHeight(131.0);
        scrollPane.setPrefWidth(415.0);

        myHisoryTabelView.setPrefHeight(136.0);
        myHisoryTabelView.setPrefWidth(400.0);

        gamesColumn.setPrefWidth(86.0);
        gamesColumn.setText("Games");

        dateColumn.setPrefWidth(104.0);
        dateColumn.setText("Date");

        vsPlayerColumn.setMinWidth(0.0);
        vsPlayerColumn.setPrefWidth(106.0);
        vsPlayerColumn.setText("Vs-Player");

        statusolumn.setMinWidth(0.0);
        statusolumn.setPrefWidth(103.0);
        statusolumn.setText("Status");
        

        looserImageView.setFitHeight(59.0);
        looserImageView.setFitWidth(60.0);
        looserImageView.setLayoutX(226.0);
        looserImageView.setLayoutY(111.0);
        looserImageView.setImage(new Image(getClass().getResource("../view/images/myHistory/losing.jpg").toExternalForm()));

        looserImageView.setEffect(dropShadow2);

        separatorRectangle.setArcHeight(5.0);
        separatorRectangle.setArcWidth(5.0);
        separatorRectangle.setFill(javafx.scene.paint.Color.valueOf("#e4e4e4"));
        separatorRectangle.setHeight(6.0);
        separatorRectangle.setLayoutY(58.0);
        separatorRectangle.setStroke(javafx.scene.paint.Color.valueOf("#c6c6c6"));
        separatorRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        separatorRectangle.setWidth(503.0);

        logoImage.setFitHeight(45.0);
        logoImage.setFitWidth(45.0);
        logoImage.setLayoutX(9.0);
        logoImage.setLayoutY(6.0);
        logoImage.setPickOnBounds(true);
        logoImage.setPreserveRatio(true);
        logoImage.setImage(new Image(getClass().getResource("../view/images/myHistory/tic-tac-toe-game.jpg").toExternalForm()));

        logoImage.setEffect(dropShadow3);

        userNameLabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        userNameLabel.setLayoutX(58.0);
        userNameLabel.setLayoutY(14.0);
        userNameLabel.setPrefHeight(32.0);
        userNameLabel.setPrefWidth(110.0);
        userNameLabel.setStyle("-fx-background-color: #343F4B; -fx-alignment: center;");
        userNameLabel.setText("User Name");
        userNameLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        userNameLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        userNameLabel.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS);
        userNameLabel.setFont(new Font("System Bold", 15.0));

                myHisoryTabelView.setEditable(true);
        myHisoryTabelView.getColumns().add(gamesColumn);
        myHisoryTabelView.getColumns().add(dateColumn);
        myHisoryTabelView.getColumns().add(vsPlayerColumn);
        myHisoryTabelView.getColumns().add(statusolumn);
         Vector<History> tmp = new Vector<History>(); 
     
         tmp=HistoryModels.userHistory(PlayerId);
            
        ObservableList<History> data = FXCollections.observableArrayList();
    int index=1;
    for(History history : tmp){
        data.add(new History(index+"", history.getDate(),history.getVsPlayer(),history.getStatus(),history.getPlayerId()+""));
        index++;
        
        
    }
   
    gamesColumn.setCellValueFactory( new PropertyValueFactory<History,String>("id") );
    dateColumn.setCellValueFactory( new PropertyValueFactory<History,String>("tableDate") );
    vsPlayerColumn.setCellValueFactory( new PropertyValueFactory<History,String>("tableVsPlayer") );
    statusolumn.setCellValueFactory( new PropertyValueFactory<History,String>("tableStatus") );
    
     myHisoryTabelView.setItems(data);    
  
        scrollPane.setContent(myHisoryTabelView);
        
        getChildren().add(progressImageView);
        getChildren().add(maxScoreView);
        getChildren().add(titleLabel);
        getChildren().add(winningTimesImageView);
        getChildren().add(backToDashboardButton);
        getChildren().add(winningTimesLableView);
        getChildren().add(looseTimeLabelView);
        getChildren().add(maxScoreLabelView);

      //  myHisoryTabelView.getColumns().add(gamesColumn);
      //  myHisoryTabelView.getColumns().add(dateColumn);
        //myHisoryTabelView.getColumns().add(vsPlayerColumn);
        //myHisoryTabelView.getColumns().add(statusolumn);
        getChildren().add(scrollPane);
        getChildren().add(looserImageView);
        getChildren().add(separatorRectangle);
        getChildren().add(logoImage);
        getChildren().add(userNameLabel);
         
      //  AnchorPane.getChildren().add(myHisoryTabelView);
       
        
        
    }
}
