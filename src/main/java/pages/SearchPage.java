package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class SearchPage {

    private WebDriver browser;

    public SearchPage(WebDriver browser) {
        this.browser = browser;
    }

    public PicturesPage clickPictureButton() {
        WebElement googlePictureButton = browser.findElement(Locators.SearchPage.GOOGLE_PICTURE_SEARCH_PAGE_BUTTON);
        googlePictureButton.click();
        return new PicturesPage(browser);
    }

    public HelloWikiPage clickLinkWikiHelloButton() {
        WebElement linkButton = browser.findElement(Locators.SearchPage.HELLO_LINK_WIKI);
        linkButton.click();
        return new HelloWikiPage(browser);
    }

    public SearchByImagePage clickLinkYandexSearchImageButton() {
        WebElement linkButton = browser.findElement(Locators.SearchPage.YANDEX_LINK_IMAGE);
        linkButton.click();
        return new SearchByImagePage(browser);
    }

}
