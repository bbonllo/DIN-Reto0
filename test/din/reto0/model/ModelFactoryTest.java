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
     * Test the getModel method
     */
    @Test
    public void testGetModel() throws ExceptionManager {
        View v = ViewFactory.getView();
        Model m = ModelFactory.getModel();
        
        assertNotNull(v);
        assertNotNull(m);
    }
}
