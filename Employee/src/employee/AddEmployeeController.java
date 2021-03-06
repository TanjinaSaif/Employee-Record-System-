
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tanjina
 */
public class AddEmployeeController implements Initializable {

    @FXML
    private Button salariedEmployee;
    @FXML
    private Button hourlyEmployee;
    @FXML
    private Button commissionEmployee;
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
    private void goToSalaried(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SalariedEmployee.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
            
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToHourlyEmployee(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HourlyEmployee.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
            
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToCommission(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CommisionEmployee.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
            
        stage.setScene(scene);
        stage.show();
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
