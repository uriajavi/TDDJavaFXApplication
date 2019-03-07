/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddjavafxapplication.ui;

import java.util.concurrent.TimeoutException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.isEnabled;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import tddjavafxapplication.Application;

/**
 * Very simple test class for FXML UI Controller.
 * @author javi
 */
public class SimpleFXMLDocumentControllerTest extends ApplicationTest {
    /**
     * Register and set up Java FX application.
     * @throws TimeoutException 
     */
    @BeforeClass
    public static void setUpClass() throws TimeoutException {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(Application.class);
    }
    @Test
    public void testGreetingIsShownWhenClickOnButton(){
        verifyThat("#button",isVisible());
        verifyThat("#button",isEnabled());
        clickOn("#button");
        verifyThat("Hello JavaFX TDD World!!!",isVisible());
    }
    
}
