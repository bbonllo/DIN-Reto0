package din.reto0;

import din.controller.Controller;
import din.exceptionManager.ExceptionManager;
import din.reto0.model.ModelFactory;
import din.reto0.model.ViewFactory;

/**
 *
 * @author Janam & Unai
 */
public class DINReto0 {

    /**
     *
     * @param args
     * @throws ExceptionManager
     *
     * Launches the application by getting the view from the ViewFactory and
     * shows it as the ModelFactory states
     */
    public static void main(String[] args) throws ExceptionManager {
        
        new Controller().run(ViewFactory.getView(), ModelFactory.getModel());
    }

}
