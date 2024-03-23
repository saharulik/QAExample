import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HelloWikiPage;
import pages.PicturesPage;
import pages.MainPage;
import pages.SearchByImagePage;

import java.util.concurrent.TimeUnit;

public class SmokeTest {

    private WebDriver browser;
    public static MainPage mainPage;

    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.google.com/");
    }

    @Test
    public void checkDescriptionJavaEE() {

        mainPage = new MainPage(browser);

        mainPage.clickAcceptCookieButton();

        mainPage.inputSearchString("Hello");

        PicturesPage picturesPage = mainPage
                .clickSearchButton()
                .clickPictureButton();

        String titleSearchPictureResult = picturesPage.getTitleImageResult();

        Assert.assertEquals("Hello! — Википедия",titleSearchPictureResult);

    }

    @Test
    public void checkHeaderWikiPageHello() {

        mainPage = new MainPage(browser);

        mainPage.clickAcceptCookieButton();

        mainPage.inputSearchString("Hello wiki");

        HelloWikiPage helloWikiPage = mainPage
                .clickSearchButton()
                .clickLinkWikiHelloButton();

        String titleSearchPictureResult = helloWikiPage.getHeaderResult();

        Assert.assertEquals("Hello",titleSearchPictureResult);

    }

    @Test
    public void checkEarlyUsesWikiPageHello() {

        mainPage = new MainPage(browser);

        mainPage.clickAcceptCookieButton();

        mainPage.inputSearchString("Hello wiki");

        HelloWikiPage helloWikiPage = mainPage
                .clickSearchButton()
                .clickLinkWikiHelloButton();

        String titleSearchPictureResult = helloWikiPage.getEarlyUsesResult();

        Assert.assertEquals("Early uses",titleSearchPictureResult);

    }

    @Test
    public void checkImageWikiPageHello() {

        mainPage = new MainPage(browser);

        mainPage.clickAcceptCookieButton();

        mainPage.inputSearchString("Hello wiki");

        HelloWikiPage helloWikiPage = mainPage
                .clickSearchButton()
                .clickLinkWikiHelloButton();

        String titleSearchPictureResult = helloWikiPage.getImageResult();

        Assert.assertEquals("https://en.wikipedia.org/wiki/File:TelephoneHelloNellie.jpg",titleSearchPictureResult);

    }

    @Test
    public void checkImageSearch() {

        mainPage = new MainPage(browser);

        mainPage.clickAcceptCookieButton();

        mainPage.inputSearchString("Image search");

        SearchByImagePage searchByImagePage = mainPage
                .clickSearchButton()
                .clickLinkYandexSearchImageButton();

        searchByImagePage.insertImage("src/main/resources/IMG_5265.jpeg");

        browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String titleSearchPictureResult = searchByImagePage.getTextUnderTitle();

        Assert.assertEquals("Картина Леонардо да Винчи",titleSearchPictureResult);

    }

    
    @After
    public void closeBrowser() {
       browser.quit();
    }





}
