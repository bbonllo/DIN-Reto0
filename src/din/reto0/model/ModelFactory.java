package din.reto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author JanamUnai;
 */
public class ModelFactory {

    private static Model model;
    private static ResourceBundle configFile;
    private static String dataBase;
    private static String file;

    /**
     *
     * It initializes the model and interpretes either you are in the database
     * or in the File
     *
     */
    public static Model getModel() {
        configFile = ResourceBundle.getBundle("din.reto0.main.config");
        dataBase = configFile.getString("DB");
        file = configFile.getString("FILE");

        if (dataBase.equalsIgnoreCase("true")) {
            model = new ModelImplementationDB();

        } else if (file.equalsIgnoreCase("true")) {
            model = new ModelImplementationFile();

        }

        return model;
    }
}
