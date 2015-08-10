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
            LeadHome leadHomePage = topBarMenu.clickTabLead();
            //ProjectContainer newLead = topBarMenu.clickTabLead();
            //LeadHome newLead = topBarMenu.clickTabLead();
            leadHomePage.clickNew();

            //mainApp.goToSetupLead();
            CreateNewLead newLead = mainApp.goToCreateNewLead();

            newLead.setFirstNameLead("Nelson");
            newLead.setSecondNameLead("Tapia");
            newLead.setLeadSalutation("Mr.");
            newLead.setLeadCompany("CompanyTest");
            newLead.setLeadStatus("Closed - Converted");

            newLead.saveBtnClick();


            TopBarMenu topBarMenu1 = mainApp.goToBarMenu();
            topBarMenu1.clickTabLead();

        }

}
