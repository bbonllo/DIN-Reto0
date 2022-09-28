/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
import java.util.ResourceBundle;

/**
 *
 * @author lucas
 */
public class ModelImplementationFile implements Model {

    protected ResourceBundle configFile;
    protected String greeting;

    @Override
    public String getGreeting() throws ExceptionManager{
        configFile = ResourceBundle.getBundle("din.reto0.main.config");
        greeting = configFile.getString("GREET");
        return greeting;
    }
}
