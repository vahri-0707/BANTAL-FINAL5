/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PendaftaranController implements Initializable {

  
    
//   TextField
    @FXML
    private TextField tfNama;
    
    @FXML
    private TextField tfEmail;
    
    @FXML
    private TextField tfPekerjaan;
    
    @FXML
    private TextField tfRiwayat;
    
    @FXML
    private TextField tKota;
    
    @FXML
    private TextField tfpassword;
    
    @FXML
    private TextField tfTanggalLahir;
    
    @FXML
    private TextField tfNoHP;
   
//   RadioButton
    @FXML
    private RadioButton rbPria;
    
    @FXML
    private RadioButton rbWanita;
    
//  ChoiceBox
   
    public String getTfNama() {
        return tfNama.getText();
    }

    public String  getTfEmail() {
        return tfEmail.getText();
    }

    public String getTfPekerjaan() {
        return tfPekerjaan.getText();
    }

    public String  getTfRiwayat() {
        return tfRiwayat.getText();
    }

    public String gettKota() {
        return tKota.getText();
    }

    public String  getTfProv() {
        return tfpassword.getText();
    }

    public String  getTfTanggalLahir() {
        return tfTanggalLahir.getText();
    }

    public String getTfNoHP() {
        return tfNoHP.getText();
    }

    public Boolean getRbPria() {
        return rbPria.isSelected();
    }

    public Boolean getRbWanita() {
        return rbWanita.isSelected();
    }
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);    
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.show();
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
