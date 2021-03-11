package tests.alerts;

import org.testng.annotations.Test;
import pageObjects.Wizard;

public class Test_Wizard {
    Wizard wizard = new Wizard();

    @Test(groups ={"wzrd"})
    public void test1(){
/**
 * 1. Fill out First Name
 * 2. Fill out Last Name
 * 3. Press Next
 * 4. Fill out Street Address
 * 5. Fill out City
 * 6. Fill out State
 * 7. Fill out Zip
 * 8. Click Next
 * 9. Assert Data
 */

        wizard.setFirstName("FirstName");
        wizard.setLastName("LastName");
        wizard.pressNextButton();
        wizard.setAddress("Address");
        wizard.setCity("City");
        wizard.setState("State");
        wizard.setZIP("ZIP");
        wizard.pressNextButton();
//        wizard.checkFirstName();
//        wizard.checkLastName();
//        wizard.checkAddress();
        wizard.navigateToWizardPage();
    }
}
