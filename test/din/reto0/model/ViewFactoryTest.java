package din.reto0.model;

import din.reto0.exceptionManager.ExceptionManager;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unaib
 */
public class ViewFactoryTest {
    
    public ViewFactoryTest() {
    }
    
    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() throws ExceptionManager{
        View v = ViewFactory.getView();
        
        assertNotNull(v);
    }
    
}
