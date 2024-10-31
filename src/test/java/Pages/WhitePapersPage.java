package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WhitePapersPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(.,'ESG reporting fears push need for better communication tools')]")
    WebElement ESGReporting_element_xpath;

    @FindBy(xpath = "//a[@href='https://www.kurtosys.com/white-papers/eu-rule-change-bolsters-need-for-fast-localized-fund-website-platforms-2/'][contains(.,'UCITS White Paper')]")
    WebElement whitePaper_element_xpath;

    @FindBy(xpath = "//h2[@class='elementor-heading-title elementor-size-default'][contains(.,'White Papers')]")
    WebElement whitePaperHeader_element_xpath;

    public WhitePapersPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void clickWhitePaper(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(whitePaper_element_xpath));
        whitePaper_element_xpath.click();
    }

    public void verifyWhitePaperText(){
        Assert.assertEquals(whitePaperHeader_element_xpath.getText(), "White Papers");
    }


}
