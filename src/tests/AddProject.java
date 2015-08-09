package tests;

import org.junit.Test;
import pages.*;


/**
 * Created by Carlos Gonzales on 7/27/2015.
 */
public class AddProject {

    private MainApp mainApp;
        @Test
        public void setUp() {
            LoginHomePage loginHomePage = new LoginHomePage();
            MainApp mainApp = loginHomePage.setUserNameTxt("nelsontb@gmail.com")
                    .setPasswordTxt("Hercules73")
                    .clickLoginBtn();
            //mainApp.goToBarMenu();
            TopBarMenu topBarMenu = mainApp.goToBarMenu();
            //ProjectContainer newLead = topBarMenu.clickTabLead();
            LeadHome newLead = topBarMenu.clickTabLead();

            newLead.clickNew();

        }

}
