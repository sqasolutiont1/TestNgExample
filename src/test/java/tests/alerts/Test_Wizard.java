package tests.alerts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.Alerts;
import pageObjects.Wizard;

public class Test_Wizard {
    Wizard wizard = new Wizard();
    @BeforeTest
    public void navigateTo(){
        wizard.navigateToWizardPage();
    }


    @Test(dataProvider="testDataProvider")
    public void test1(String FirstName,String LastName,String Address, String City, String State, String ZIP){
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

        wizard.setFirstName(FirstName);
        wizard.setLastName(LastName);
        wizard.pressNextButton();
        wizard.setAddress(Address);
        wizard.setCity(City);
        wizard.setState(State);
        wizard.setZIP(ZIP);
        wizard.pressNextButton();
//        wizard.checkFirstName();
//        wizard.checkLastName();
//        wizard.checkAddress();
        wizard.navigateToWizardPage();
    }

    @DataProvider(name="testDataProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "first name1","lastnam1e","street1","City1","State1","Zip1"},
                        { "first name2","lastname2","street2","City2","State2","Zip2"},
                        { "first name3","lastname3","street3","City3","State3","Zip3"},
                        { "first name4","lastname4","street4","City4","State4","Zip4"},
                        { "first name5","lastname5","street5","City5","State5","Zip5"},
                        { "first name6","lastname6","street6","City6","State6","Zip6"},
                };
    }


    @AfterTest
    public void closeDriver(){
        wizard.quit();
    }

}
