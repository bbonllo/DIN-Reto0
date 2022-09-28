package din.reto0.model;

import din.reto0.ui.JavaFXView;
import javafx.application.Application;

/**
 *
 * @author JanamUnai;
 */
public class ViewImplementationJavaFX implements View {

    /**
     * Shows the greet by JavaFX
     *
     * @param greet
     */
    @Override
    public void showGreeting(String greet) {
        Application.launch(JavaFXView.class, greet);
    }
}
