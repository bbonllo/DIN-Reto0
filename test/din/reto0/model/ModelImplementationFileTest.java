package din.reto0.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janam & Unai
 */
public class ModelImplementationFileTest {

    public ModelImplementationFileTest() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementationFile.
     */
    @Test
    public void testGetGreeting() throws Exception {
        String greet = "Hola Archivo";
        ModelImplementationFile m = new ModelImplementationFile();
        assertEquals(greet, m.getGreeting());
    }

}
