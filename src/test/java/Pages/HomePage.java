package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Resources')]")
    WebElement resources_element_xpath;

    @FindBy(xpath = "(//span[@class='elementor-icon-list-text'][contains(.,'White Papers & eBooks')])[3]")
    WebElement whitePapersAndeBooks_element_xpath;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollToElement(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(resources_element_xpath));
        // Use JavaScript to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", resources_element_xpath);
    }


    public void clickWhitePapersAndeBooks(){
        whitePapersAndeBooks_element_xpath.click();
    }

}
