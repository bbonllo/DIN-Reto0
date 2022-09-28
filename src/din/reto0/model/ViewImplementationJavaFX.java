/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
import din.reto0.ui.JavaFXView;
import javafx.application.Application;

/**
 *
 * @author lucas
 */
public class ViewImplementationJavaFX implements View {

    //private Parent root;

    @Override
    public void showGreeting(String greet) {
        Application.launch(JavaFXView.class, greet);
    }
}
