package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;

/**
 *
 * @author Janam & Unai
 */
public interface Model {

    /**
     * 
     * Interface method to get the greeting
     * 
     * @return String
     * @throws ExceptionManager 
     * 
     */
    public String getGreeting() throws ExceptionManager;

}
