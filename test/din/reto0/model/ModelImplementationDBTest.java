package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JanamUnai;
 */
public class ModelImplementationDBTest {
    
    public ModelImplementationDBTest() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementationDB.
     */
    @Test
    public void testGetGreeting() throws ExceptionManager {
        String greet = "Hola DB";
        ModelImplementationDB m = new ModelImplementationDB();
        assertEquals(greet, m.getGreeting());
    }
    
}
