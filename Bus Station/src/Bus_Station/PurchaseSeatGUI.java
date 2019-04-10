/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Station;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class PurchaseSeatGUI {
    static Stage Window=new Stage();
    int IndexInTripsArrayList;
    String Triptype;//internal or external
   public PurchaseSeatGUI(int indexInTripsArrayList,String triptype)
   {
       
       IndexInTripsArrayList=indexInTripsArrayList;
       Triptype=triptype;
   }
    
   
    public void displayWindow() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("PurchaseSeat.fxml"));
        
        Window.setScene(new Scene(root,600,600));
        Window.show();
       
    }
    public static void closeWindow()
    {
        Window.close();
    }
}
