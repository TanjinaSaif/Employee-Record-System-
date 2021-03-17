/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Tanjina
 */
public class HourlyEmployeeController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField id;
    @FXML
    private TextField designation;
    @FXML
    private TextField rate;
    @FXML
    private Button submit;
    @FXML
    private TextField hoursWorked;
    @FXML
    private Button home;

   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getInput(ActionEvent event) {
        String name = this.name.getText();
        String id = this.id.getText();
        String des = designation.getText();
        String hourlyRate = rate.getText();
        double hRate = Double.parseDouble(hourlyRate);
        String hours = hoursWorked.getText();
        int hWorked = Integer.parseInt(hours);
        UAP uap = new UAP();
        uap.hourly(name, id, des, hRate, hWorked);
    }

    @FXML
    private void goToHome(ActionEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
            
        stage.setScene(scene);
        stage.show();
    }
    
}
