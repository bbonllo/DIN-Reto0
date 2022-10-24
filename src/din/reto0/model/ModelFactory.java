package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
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
    public static Model getModel() throws ExceptionManager {
        
        switch (ResourceBundle.getBundle("din.reto0.main.config").getString("DATA")) {
            case "DB":
                model = new ModelImplementationDB();
                break;
            case "FILE":
                model = new ModelImplementationFile();
                break;
            default:
                throw new ExceptionManager("Not valid value");
        }

        return model;
    }
}
