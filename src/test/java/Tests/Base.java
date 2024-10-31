package Tests;

import Pages.EURuleChangePage;
import Pages.HomePage;
import Pages.WhitePapersPage;
import Utils.BrowserFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.kurtosys.com/");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    WhitePapersPage whitePapersPage = PageFactory.initElements(driver, WhitePapersPage.class);
    EURuleChangePage euRuleChangePage = PageFactory.initElements(driver, EURuleChangePage.class);

    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Wait for the cookie consent button to be visible and clickable
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]")));
            acceptCookiesButton.click();
            System.out.println("Cookie acceptance button found.");

            // Optionally wait for a specific condition after clicking
            wait.until(ExpectedConditions.invisibilityOf(acceptCookiesButton)); // Wait for the button to disappear if it does
        } catch (NoSuchElementException e) {
            System.out.println("Cookie acceptance button not found.");
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for cookie acceptance button.");
        }
    }

}
