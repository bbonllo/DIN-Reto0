package din.reto0.model;

import din.exceptionManager.ExceptionManager;

/**
 *
 * @author Janam & Unai
 */
public interface Model {

    /**
     * 
     * Me
     * 
     * @return String
     * @throws ExceptionManager 
     */
    public String getGreeting() throws ExceptionManager;

}