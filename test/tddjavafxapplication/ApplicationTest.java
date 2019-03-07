/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddjavafxapplication;

import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.api.FxToolkit;
import static org.testfx.matcher.base.NodeMatchers.isVisible;

/**
 * Test class for JavaFX TDD example application.
 * @author javi
 */
public class ApplicationTest{
    /**
     * JavaFX Application instance to be tested.  
     */
    private static Application app;
    /**
     * Set up Java FX fixture for tests. This is a general approach for using a 
     * unique instance of the application in the test.
     * @throws java.util.concurrent.TimeoutException
     */
    @BeforeClass
    public static void setUpClass() throws TimeoutException {
        FxToolkit.registerPrimaryStage();
        app=(Application)FxToolkit.setupApplication(Application.class);
    }
    /**
     * Test that the application is a JavaFX application. Note the use of 
     * Class.isAssignableFrom method.
     */
    @Test
    public void testIsJavaFXApplication() throws TimeoutException {
        assertTrue("The app is not a JavaFX application!!!",
            javafx.application.Application.class.isAssignableFrom(app.getClass()));
    }
    /**
     * Test that the main pane in the Scene loaded on the primary stage is 
     * visible when launching the application.
     */
    @Test
    public void testMainPaneIsVisible(){
        verifyThat("#AnchorPane",isVisible());
    }
}
