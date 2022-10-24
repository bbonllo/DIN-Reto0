package din.reto0.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author JanamUnai;
 */
public class JavaFXView extends Application {

    /**
     * Start method to get the JavaFX view components started
     *
     * @param stage
     * @throws Exception
     */
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
