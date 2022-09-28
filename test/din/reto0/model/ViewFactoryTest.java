/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din.reto0.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public void testGetView() {
        View v = ViewFactory.getView();
        
        assertNotNull(v);
    }
    
}
