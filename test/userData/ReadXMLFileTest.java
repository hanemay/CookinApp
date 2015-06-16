/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanemay
 */
public class ReadXMLFileTest {
    
    /**
     *
     */
    public ReadXMLFileTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of ValidateLogin method, of class ReadXMLFile.
     */
    @Test
    public void testValidateLogin() {
        System.out.println("ValidateLogin");
        String username = "kim";
        String password = "123123";
        ReadXMLFile instance = new ReadXMLFile();
        boolean expResult = true;
        boolean result = instance.ValidateLogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
