package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 08/08/2015.
 */
public class TopBarMenu {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(linkText = "Leads")
    @CacheLookup
    private WebElement leadTablink;

    @FindBy(id = "Account_Tab")
    @CacheLookup
    private WebElement accountTablink;

    @FindBy(id = "Order_Tab")
    @CacheLookup
    private WebElement orderTablink;

    public TopBarMenu(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public LeadHome clickTabLead(){
        leadTablink.click();
        return new LeadHome(driver);
    }
}
