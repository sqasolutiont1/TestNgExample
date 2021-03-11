package tests.alerts;

import org.testng.annotations.*;
import pageObjects.Wizard;

public class Test_Suite {
    Wizard wizard = new Wizard();
    @BeforeSuite(groups ={"wzrd"})
    public void navigateTo(){
        wizard.navigateToWizardPage();
    }

    @AfterSuite(groups ={"wzrd"})
    public void closeDriver(){
        wizard.quit();
    }

}
