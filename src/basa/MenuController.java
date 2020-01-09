/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Виктория
 */
public class MenuController implements Initializable {

    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        //кнопки перехода по таблицам
        if (event.getSource() == one) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Plane.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (event.getSource() == two) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Type.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (event.getSource() == three) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Airline.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (event.getSource() == four) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Airport.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (event.getSource() == five) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Schedule.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (event.getSource() == six) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Customer.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (event.getSource() == seven) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Reservation.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //Кнопка выходи из окна Menu
        if (event.getSource() == eight) {
            Platform.exit();

        }
    }

}

