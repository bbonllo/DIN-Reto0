package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
import java.util.ResourceBundle;

/**
 *
 * @author JanamUnai;
 */
public class ViewFactory {

    private static View view;
    private static ResourceBundle configFile;
    private static String viewSelect;

    /**
     * It initializes the view and interpretes either you are in the Terminal
     * view, Swing view or JavaFx view
     *
     * @return view
     */
    public static View getView() throws ExceptionManager {

        switch (ResourceBundle.getBundle("din.reto0.main.config").getString("VIEW")) {
            case "SWING":
                view = new ViewImplementationSwing();
                break;
            case "TERMINAL":
                view = new ViewImplementationTerminal();
                break;
            case "JFX":
                view = new ViewImplementationJavaFX();
                break;
            default:
                throw new ExceptionManager("Not valid value");
        }

        return view;
    }
}
