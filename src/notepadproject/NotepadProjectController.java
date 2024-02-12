                              

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class NotepadProjectController implements Initializable {
    @FXML
    private TableView<String> registeredtable;
    
    @FXML
    public void nextTableButton(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TableView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Registered Members");
            stage.setWidth(850);
            stage.setHeight(450);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void backToHome(ActionEvent event) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Loginpage.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Sign-up");
            stage.setWidth(600);
            stage.setHeight(470);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
    public void gotoNotepad(ActionEvent event) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NotepadDesign.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setWidth(1300);
            stage.setHeight(700);
            stage.setResizable(true);
            stage.setScene(scene);
            stage.setTitle("Notepad 2.0");
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    @FXML
    public void goToSignupPage(ActionEvent event) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Sign Up page.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Sign-up");
            stage.setWidth(600);
            stage.setHeight(550);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableView<String> registeredtable;
        registeredtable = new TableView<>();
        TableColumn<String, String> firstname = new TableColumn<>("FIRSTNAME");
        TableColumn<String, String> lastname = new TableColumn<>("LASTNAME");
        TableColumn<String, String> email = new TableColumn<>("EMAIL");
        TableColumn<String, String> password = new TableColumn<>("PASSWORD");
        registeredtable.getColumns().addAll(firstname, lastname, email, password);
        registeredtable.getColumns().addAll(firstname, lastname, email, password);

        
    }
    
    @FXML
    public void pushTable(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/notepad/TableView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Registered Members");
            stage.setWidth(600);
            stage.setHeight(430);
            stage.setResizable(false);
            
            TableView<String> registeredtable = new TableView<>();
            TableColumn<String, String> firstname = new TableColumn<>("FIRSTNAME");
            TableColumn<String, String> lastname = new TableColumn<>("LASTNAME");
            TableColumn<String, String> email = new TableColumn<>("EMAIL");
            TableColumn<String, String> password = new TableColumn<>("PASSWORD");
            registeredtable.getColumns().addAll(firstname, lastname, email, password);
            stage.setScene(scene);
            
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
