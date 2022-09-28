/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din.reto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author lucas
 */
public class ModelFactory {

    private static Model model;
    private static ResourceBundle configFile;
    private static String dataBase;
    private static String file;

    public static Model getModel() {
        configFile = ResourceBundle.getBundle("din.reto0.config");
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