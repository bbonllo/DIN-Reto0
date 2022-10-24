package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JanamUnai;
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }
    
    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() throws ExceptionManager {
        Model m = ModelFactory.getModel();
        
        assertNotNull(m);
    }
}
