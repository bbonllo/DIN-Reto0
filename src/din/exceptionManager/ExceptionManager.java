package din.exceptionManager;

/**
 *
 * @author Janam & Unai
 */
public class ExceptionManager extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * Constructor for the exceptions
     */
    public ExceptionManager() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor for the exceptions with a message parameter
     * @param message 
     */
    public ExceptionManager(String message) {
        super(message);

    }

    /**
     * 
     * @param string 
     */
    public void printStackTrace(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
