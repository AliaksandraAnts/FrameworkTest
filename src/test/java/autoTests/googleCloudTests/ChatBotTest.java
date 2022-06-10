package autoTests.googleCloudTests;

import autoTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.gogleCloudPages.GoogleCloudContactPage;
import pages.gogleCloudPages.GoogleCloudMainPage;

public class ChatBotTest extends BaseTest {


    @Test()
    public void checkAppearingChatBot(){
        GoogleCloudMainPage googleCloudMainPage = new GoogleCloudMainPage(webDriver);
        GoogleCloudContactPage googleCloudContactPage = new GoogleCloudContactPage(webDriver);
        webDriver.get("https://cloud.google.com/");
        googleCloudMainPage
                .talkToUsBtnClick()
                .chooseChatWitsUsBtn();
        Assert.assertTrue(googleCloudContactPage.chatBotIsOpen().isDisplayed(),"ChetBot is not displayed! ");
    }
}