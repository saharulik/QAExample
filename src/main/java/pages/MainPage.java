package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

import java.io.File;

public class MainPage {

    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    /**
     * метод для ввода поискового запроса
     */
    public void inputSearchString(String login) {
        WebElement googleMainPageBar = browser.findElement(Locators.MainPage.SEARCH_BAR);
        googleMainPageBar.sendKeys(login); }

    public SearchPage clickSearchButton() {
        WebElement searchMainPageButton = browser.findElement(Locators.MainPage.SEARCH_BAR);
        searchMainPageButton.sendKeys(Keys.RETURN);
        return new SearchPage(browser);
    }

    public void clickAcceptCookieButton() {
        try {
        WebElement searchMainPageButton = browser.findElement(Locators.MainPage.ACCEPT_COOKIE_BUTTON);
        searchMainPageButton.click(); } catch (Exception e) {
            System.out.println("Cookies not found");
        };
    }
}
