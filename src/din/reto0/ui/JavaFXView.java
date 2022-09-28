/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din.reto0.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author unaib
 */
public class JavaFXView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String parameter = getParameters().getRaw().get(0);
        Text greeting = new Text(parameter);
        
        StackPane root = new StackPane();
        root.getChildren().add(greeting);

        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("Hola");
        stage.setScene(scene);
        stage.show();
    }

}
