package Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EURuleChangePage {

    WebDriver driver;

    @FindBy(id = "18882_231669pi_18882_231669")
    WebElement firstName_element_xpath;

    @FindBy(xpath = "//input[contains(@id,'18882_231671pi_18882_231671')]")
    WebElement lastName_element_xpath;

    @FindBy(xpath = "//input[contains(@id,'18882_231673pi_18882_231673')]")
    WebElement email_element_xpath;

    @FindBy(xpath = "//input[contains(@id,'18882_231673pi_18882_231673')]")
    WebElement company_element_xpath;

    @FindBy(xpath = "//input[contains(@id,'18882_231677pi_18882_231677')]")
    WebElement industry_element_xpath;

    @FindBy(xpath = "//label[@class='inline'][contains(.,'Subscribe to our newsletter')]")
    WebElement newsletter_element_xpath;

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    WebElement copy_element_xpath;

    @FindBy(xpath = "//h2[@class='elementor-heading-title elementor-size-default'][contains(.,'EU Rule Change Bolsters Need for Fast Localized Fund Website Platforms')]")
    WebElement mainHeader_xpath;


    public EURuleChangePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyMainHeader(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(mainHeader_xpath));
        System.out.println(mainHeader_xpath.getText());
    }

    public void enterFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            // Wait for the link to be visible and clickable
            WebElement firstName_element = wait.until(ExpectedConditions.visibilityOf(firstName_element_xpath));
            firstName_element.sendKeys("shepherd");
            System.out.println("firstName_element link clicked.");
        } catch (TimeoutException e) {
            System.out.println("firstName_element link not found or not clickable.");
        }
    }

    public void enterLastName(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(firstName_element_xpath));
        lastName_element_xpath.sendKeys("Shepherd");
    }

    public void clickSendMeACopy(){
        copy_element_xpath.click();
    }
}
