package din.reto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author JanamUnai;
 */
public class ModelFactory {

    private static Model model;
    private static ResourceBundle configFile;
    private static String data;

    /**
     *
     * It initializes the model and interpretes either you are in the database
     * or in the File
     *
     * @return model
     */
    public static Model getModel() {
        configFile = ResourceBundle.getBundle("din.reto0.main.config");
        data = configFile.getString("DATA");

        if (data.equalsIgnoreCase("DB")) {
            model = new ModelImplementationDB();

        } else if (data.equalsIgnoreCase("FILE")) {
            model = new ModelImplementationFile();

        }

        return model;
    }
}
