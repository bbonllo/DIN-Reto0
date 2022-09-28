package din.reto0.main;

import din.reto0.controller.Controller;
import din.reto0.exceptionManager.ExceptionManager;
import din.reto0.model.ModelFactory;
import din.reto0.model.ViewFactory;

/**
 *
 * @author JanamUnai;
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
