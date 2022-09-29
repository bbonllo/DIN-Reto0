package din.reto0.model;

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
    public static View getView() {
        configFile = ResourceBundle.getBundle("din.reto0.main.config");
        viewSelect = configFile.getString("VIEW");

        if (viewSelect.equalsIgnoreCase("SWING")) {
            view = new ViewImplementationSwing();

        } else if (viewSelect.equalsIgnoreCase("TERMINAL")) {
            view = new ViewImplementationTerminal();

        } else if (viewSelect.equalsIgnoreCase("JFX")) {
            view = new ViewImplementationJavaFX();

        }

        return view;
    }
}
