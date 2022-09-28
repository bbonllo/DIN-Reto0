package din.controller;

import din.exceptionManager.ExceptionManager;
import din.reto0.model.Model;
import din.reto0.model.View;

/**
 *
 * @author Janam & Unai
 */
public class Controller {

    private static String greet;

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
        greet = model.getGreeting();
        view.showGreeting(greet);
    }

}