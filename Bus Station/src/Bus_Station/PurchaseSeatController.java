/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Station;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PurchaseSeatController implements Initializable {

    public ToggleGroup TripTypeGroup;
    RadioButton button;
     public String TripType()               //one way or 2 way
    {        
       if (TripTypeGroup.getSelectedToggle() != null)
       {
            button = (RadioButton) TripTypeGroup.getSelectedToggle();
            System.out.println("Button: " + button.getText());
            return button.getText();
       }
       else
       { 
           AlertBox.display("Warning", "ENTER TRIP TYPE");
           return "";
       }
                   
               
               //else alert box
    }
     public void Cancel()
     {
         PurchaseSeatGUI.closeWindow();
     }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
}
