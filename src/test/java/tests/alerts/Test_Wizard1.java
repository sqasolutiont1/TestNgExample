package tests.alerts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.Wizard;

public class Test_Wizard1 {
    Wizard wizard = new Wizard();

    @Test(dataProvider="testDataProvider")
    public void test1(String FirstName,String LastName,String Address, String City, String State, int ZIP){
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
        wizard.setZIP(Integer.toString(ZIP));
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
                        { "first name1","lastnam1e","street1","City1","State1",345341},
                        { "first name2","lastname2","street2","City2","State2",345342},
                        { "first name3","lastname3","street3","City3","State3",345343},
                        { "first name4","lastname4","street4","City4","State4",345344},
                        { "first name5","lastname5","street5","City5","State5",345345},
                        { "first name6","lastname6","street6","City6","State6",345346},
                };
    }

}
