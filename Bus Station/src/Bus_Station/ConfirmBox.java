/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Station;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;

/**
 *
 * @author Lenovo
 */
public class ConfirmBox {
    static boolean answer;
    
    public static boolean display(String title,String message){
      Stage window=new Stage(); 
      window.initModality(Modality.APPLICATION_MODAL);  //doesn't allow you to do anything else but work with this allert box
      window.setTitle(title);
      window.setMinWidth(250);
      
      Label label=new Label();
      label.setText(message);
      
      Button Yes =new Button("Yes");
      Yes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                answer =true;
                window.close();
            }
        });
      Button No =new Button("No");
      No.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                answer =false;
                window.close();
            }
        });
      VBox layout=new VBox(10);
      layout.getChildren().addAll(label, Yes, No);
      layout.setAlignment(Pos.CENTER);
      Scene scene=new Scene(layout);
      window.setScene(scene);
      window.showAndWait();   
      return answer;
    }
    
    
    
}
