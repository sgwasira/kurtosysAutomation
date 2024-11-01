package Tests;

import org.testng.annotations.Test;

@Test
public class downloadForm extends Base {


    public void scrollDownToElement() {
        acceptCookies();
        homePage.scrollToElement();
    }

    @Test(dependsOnMethods = "scrollDownToElement")
    public void clickWhitePaperAndeBooksLink_Test() {
        homePage.clickWhitePapersAndeBooks();
    }

    @Test(dependsOnMethods = "clickWhitePaperAndeBooksLink_Test")
    public void verifyWhitePaperHeader_Test() {
        whitePapersPage.verifyWhitePaperText();
    }

    @Test(dependsOnMethods = "verifyWhitePaperHeader_Test")
    public void clickWhitePaperLink_Test() {
        whitePapersPage.clickWhitePaper();
    }

    @Test(dependsOnMethods = "clickWhitePaperLink_Test")
    public void verifyPageTitle() {
        euRuleChangePage.verifyMainHeader();
    }

    @Test(dependsOnMethods = "verifyPageTitle")
    public void switchToiFrame() {
        euRuleChangePage.switchToFrame();
    }

    @Test(dependsOnMethods = "switchToiFrame")
    public void enterFirstName_Test() {
        euRuleChangePage.enterFirstName();
    }

    @Test(dependsOnMethods = "enterFirstName_Test")
    public void enterLastName_Test() {
        euRuleChangePage.enterLastName();
    }

    @Test(dependsOnMethods = "enterLastName_Test")
    public void enterCompany_Test(){
        euRuleChangePage.enterCompany();
    }

    @Test(dependsOnMethods = "enterCompany_Test")
    public  void enterIndustry_Test(){
        euRuleChangePage.enterIndustry();
    }

    @Test(dependsOnMethods = "enterIndustry_Test")
    public void selectNewsletter_Test(){
        euRuleChangePage.selectNewsletter();
    }

    @Test(dependsOnMethods = "selectNewsletter_Test")
    public void clickSendMeACopy(){
        euRuleChangePage.clickSendMeACopy();
    }

    @Test(dependsOnMethods = "clickSendMeACopy")
    public  void verifyEmailErrorText(){
        euRuleChangePage.verifyEmailErrorText();
    }



}
