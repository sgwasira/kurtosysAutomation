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
    public void enterFirstName_Test() throws InterruptedException {
        euRuleChangePage.verifyMainHeader();
        euRuleChangePage.enterFirstName();
    }

    //@Test(dependsOnMethods = "clickWhitePaperLink_Test")
    // public void enterLastName_Test() throws InterruptedException {
    //     Thread.sleep(10);
    //     euRuleChangePage.enterLastName();
    //  }
}
