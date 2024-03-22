package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class PicturesPage {

    private WebDriver browser;

    public PicturesPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getTitleImageResult() {
        WebElement textAboutJava = browser.findElement(Locators.PicturesPage.TITLE_ABOUT_PICTURE_SEARCH);
        return textAboutJava.getAttribute("alt");
    }

}
