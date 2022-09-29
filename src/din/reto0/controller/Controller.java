package din.reto0.controller;

import din.reto0.exceptionManager.ExceptionManager;
import din.reto0.model.Model;
import din.reto0.model.View;

/**
 *
 * @author JanamUnai;
 */
public class Controller {

    /**
     *
     * @param view
     * @param model
     * @throws ExceptionManager
     *
     * Run the application receiving a view implementation and a model
     * implementation. Saves the getGreeting return in a greet variable and
     * sends it to the view.
     */
    public void run(View view, Model model) throws ExceptionManager {
        view.showGreeting(model.getGreeting());
    }

}
