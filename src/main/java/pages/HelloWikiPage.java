package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class HelloWikiPage {
    private WebDriver browser;

    public HelloWikiPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getHeaderResult() {
        WebElement textAboutJava = browser.findElement(Locators.HelloWikiPage.TITLE_WIKI_PAGE);
        return textAboutJava.getText();
    }

    public String getEarlyUsesResult() {
        WebElement textAboutJava = browser.findElement(Locators.HelloWikiPage.HEADER_WIKI_PAGE);
        return textAboutJava.getText();
    }

    public String getImageResult() {
        WebElement textAboutJava = browser.findElement(Locators.HelloWikiPage.IMAGE_WIKI_PAGE);
        return textAboutJava.getAttribute("href");
    }

}