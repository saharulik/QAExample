package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

import java.io.File;

public class SearchByImagePage {

    private WebDriver browser;

    public SearchByImagePage(WebDriver browser) {
        this.browser = browser;
    }

    public void insertImage(String pathToImage) {
        File uploadFile = new File(pathToImage);
        WebElement fileInput = browser.findElement(Locators.SearchByImagePage.SEARCH_BAR_IMAGE);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
    }
    public String getTextUnderTitle() {
        WebElement textAboutJava = browser.findElement(Locators.SearchByImagePage.SEARCH_HEADER_YANDEX_IMAGE);
        return textAboutJava.getText();
    }
}
