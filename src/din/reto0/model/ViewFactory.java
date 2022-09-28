package din.reto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author Janam & Unai
 */
public class ViewFactory {

    private static View view;
    private static ResourceBundle configFile;
    private static String terminal;
    private static String swing;
    private static String javaFX;

    /**
     *
     * @return view
     */
    public static View getView() {
        configFile = ResourceBundle.getBundle("din.reto0.main.config");
        terminal = configFile.getString("TERMINAL");
        swing = configFile.getString("SWING");
        javaFX = configFile.getString("JFX");

        if (swing.equalsIgnoreCase("true")) {
            view = new ViewImplementationSwing();

        } else if (terminal.equalsIgnoreCase("true")) {
            view = new ViewImplementationTerminal();

        } else if (javaFX.equalsIgnoreCase("true")) {
            view = new ViewImplementationJavaFX();

        }

        return view;
    }
}
