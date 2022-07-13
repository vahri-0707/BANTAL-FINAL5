/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLprofilController implements Initializable {
  @FXML
    private TextField  tfNama;

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
    
     @FXML
    private TextField Jenkelamin;
    

    ArrayList< Daftar > listpendaftaranpsn = new ArrayList <Daftar> ();
   
    XStream xstream = new XStream(new StaxDriver());

    void OpenData() {

        FileInputStream berkasMasuk;

        try {
            berkasMasuk = new FileInputStream("Listpendaftaranpasien.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != -1) {

                c = (char) isi;
                s = s + c;

            }
            listpendaftaranpsn = (ArrayList<Daftar>) xstream.fromXML(s);
        } catch (Exception e) {
            System.out.println("terjadi kkesallahn");
        }
    }
        
          void simpanData() {
        String xml = xstream.toXML(listpendaftaranpsn);
        FileOutputStream outDoc;
        try {
            byte[] data = xml.getBytes("UTF-8");
            outDoc = new FileOutputStream("Listpendaftaranpasien.xml");
            outDoc.write(data);
            outDoc.close();
        } catch (Exception io) {
            System.err.println("An error occurs: " + io.getMessage());
        }
        System.out.println("Data sudah disimpan");
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
       OpenData();
      simpanData();
      File f = new File("Listpendaftaranpasien.xml");
      if (f.exists() && !f.isDirectory()){
          OpenData();
      }
      
      for (int i = 0 ;i<listpendaftaranpsn.size();i++){
          System.out.println(listpendaftaranpsn.toString());
      }
      
      Daftar p = listpendaftaranpsn.get(0);
      tfNama.setText(p.getNama());
      tfEmail.setText(p.getEmail());
      tfpassword.setText(p.getPassword());
      tfTanggalLahir.setText(p.getTanggallahir());
      tfRiwayat.setText(p.getRiwayatKesehatan());
      tfPekerjaan.setText(p.getPekerjaan());
      tfNoHP.setText(p.getNomorhp());
      tKota.setText(p.getKabdankota());
      Jenkelamin.setText(p.getJenisKelamin());
      
      
    }

}

