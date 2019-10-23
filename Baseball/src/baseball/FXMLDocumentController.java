/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.cell.PropertyValueFactory;
import xmlFile.Player;
import xmlFile.StaXParser;

/**
 *
 * @author cerigoff
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private ComboBox combo;
    @FXML private TableView<Player> table;
    @FXML private TableColumn<Player, String> playerCol;
    @FXML private TableColumn<Player, String> batAvgCol;
    
    private DecimalFormat df = new DecimalFormat("#.###");
    
    private List<String> playerNames = new ArrayList<String>();
    private ObservableList<String> playerNamesObs = FXCollections.observableList(playerNames);
    
    private List<String> teams = new ArrayList<String>();
    private ObservableList<String> teamsObs = FXCollections.observableList(teams);
    
    private List<String> batAvgs = new ArrayList<String>();
    private ObservableList<String> batAvgsObs = FXCollections.observableList(batAvgs);
    
    private List<Player> player = new ArrayList<Player>();
    private ObservableList<Player> playerObs = FXCollections.observableList(player);
    
    
    private StaXParser read = new StaXParser();
    private List<Player> readXML = read.readXML("/Users/cerigoff/NetBeansProjects/Baseball/src/xmlFile/baseball.xml");
        
    
    @Override
    @FXML public void initialize(URL url, ResourceBundle rb) { 
        playerBatAvgList();
        playerList();
        combo.setItems(teamsObs);
        
        
        playerCol.setCellValueFactory(new PropertyValueFactory<Player, String>("name"));
        batAvgCol.setCellValueFactory(new PropertyValueFactory<Player, String>("batAvg"));
        System.out.println("putting on table"); 
        table.setItems(playerObs);
        
        // TODO
    }
    
    private void playerList(){
        
        for (Player person : readXML) {
            player.add(person);
        }
    }
    
    /*private void playerNameList(){
        
        for (Player player : readXML) {
            playerNames.add(player.getName());
        }
    }*/
    
    private void playerBatAvgList(){
        
        for (Player player : readXML) {
            batAvgs.add(player.getBattingAvg());
        }
    }
    
    @FXML
    private void populateTable(){
        
    }
    
    @FXML
    private void populatePlayer(){
        
    }
    
    @FXML
    private void populateBattingAvg(){
        
    }
    
    
    
    private void teamList(){
        System.out.println("teams coming");
        for (Player player : readXML) {
            if (!teams.contains(player.getTeam())){
                teams.add(player.getTeam());
            }
        }
    }
    
    /*@FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
}
