/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddjavafxapplication;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Test class for JavaFX TDD example application.
 * @author javi
 */
public class ApplicationTest extends org.testfx.framework.junit.ApplicationTest {
    
    public ApplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsJavaFXApplication() {
        Application app=new Application();
        assertTrue("The app is not a JavaFX application!!!",
            javafx.application.Application.class.isAssignableFrom(app.getClass()));
    }
}
