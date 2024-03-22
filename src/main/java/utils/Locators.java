package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage{

        By SEARCH_BAR = By.xpath("//textarea[@id='APjFqb']");
        By ACCEPT_COOKIE_BUTTON = By.xpath("//button[@id='L2AGLb']");
    }

    public interface SearchPage{
        By  GOOGLE_PICTURE_SEARCH_PAGE_BUTTON = By.xpath("//*[@id='hdtb-sc']/div/div/div[1]/div[2]/a/div");
        By HELLO_LINK_WIKI = By.xpath("//a[@href='https://en.wikipedia.org/wiki/Hello']");
        By YANDEX_LINK_IMAGE = By.xpath("//a[@href='https://yandex.com/images/']");
    }

    public interface PicturesPage{
        By TITLE_ABOUT_PICTURE_SEARCH = By.xpath("//*[@alt='Hello! — Википедия']");
    }

    public interface HelloWikiPage{
        By  TITLE_WIKI_PAGE = By.xpath("//*[@id='firstHeading']/i");

        By  HEADER_WIKI_PAGE = By.xpath(" //*[@id='Early_uses']");

        By  IMAGE_WIKI_PAGE = By.xpath(" //a[@href='/wiki/File:TelephoneHelloNellie.jpg']");

    }

    public interface SearchByImagePage {
        By SEARCH_BAR_IMAGE = By.cssSelector("input[type=file]");
        By SEARCH_HEADER_YANDEX_IMAGE = By.xpath("//div[@class=\"CbirObjectResponse-Subtitle\" and text()='Картина Леонардо да Винчи']");

    }
}
