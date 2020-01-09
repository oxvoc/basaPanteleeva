/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basa;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Виктория
 */
public class ReservationController implements Initializable {

   @FXML
    private Button Add;
    @FXML
    private Button Delete;
    @FXML
    private Button Result;
    @FXML
    private Button Back;
    @FXML
    private Button Exit;
    @FXML
    private TextField Row;
    @FXML
    private TextField Place;
    @FXML
    private TextField Date;
    @FXML
    private TextArea Out;

    // подключение
    public void executeQuery(String query) {
        Connection conn = getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://mysql-162551.srv.hoster.ru/srv162551_db_viktoria", "srv162551_viktoria", "2010viktoria");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        //Кнопка Добавить(Активная) 
        if (event.getSource() == Add) {
            String query = "insert into Reservation values(" + Row.getText() + "," + Place.getText() + "," + Date.getText();

            executeQuery(query);
        }
        //Кнопка Вывести(Активная)
        if (event.getSource() == Result) {
            Out.setText(null);
            String query = "SELECT * From Reservation";
 
            try {
                
                Connection conn = DriverManager.getConnection("jdbc:mysql://mysql-162551.srv.hoster.ru/srv162551_db_viktoria", "srv162551_viktoria", "2010viktoria");
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);

                

                while (rs.next()) {

                    Out.appendText("Row=" + rs.getString(1) + " | Place= " + rs.getString(2) + " | Date= "  + "\n");
                    Out.setEditable(false);
                }

            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }

        //Кнопка Удалить (Активная)
        if (event.getSource() == Delete) {
            String query = "DELETE FROM Reservation WHERE Place='" + Date.getText() + "'";
            executeQuery(query);
        }

        //кнопка Back      
        if (event.getSource() == Back) {
            try {
                Stage stage = (Stage) Back.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                //     Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setTitle("ABC");
                stage.setScene(new Scene(root1));
                stage.show();

            } catch (IOException ex) {
                Logger.getLogger(AutorizationController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //Кнопка Exit
        if (event.getSource() == Exit) {

            Platform.exit();

        }
    }
}

