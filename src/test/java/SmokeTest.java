import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.JavaEEPage;
import pages.MainPage;

public class SmokeTest {

    private WebDriver browser;



    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://metanit.com/");
    }

    //-----


    @Test
    public void checkDescriptionJavaEE() {

        MainPage mainPage = new MainPage(browser);

        JavaEEPage javaEEPage = mainPage
                .clickJavaButton()
                .clickJavaEEButton()
                .clickAboutJavaEEButton();

        String descriptionJavaEE = javaEEPage.getDescriptionJavaEE();

        Assert.assertEquals(descriptionJavaEE,"Java EE или Java Enterprise Edition представляет платформу для создания корпоративных приложений на языке Java. Прежде всего это сфера веб-приложений и веб-сервисов.");

    }

    @Test
    public void checkDescriptionJavaServlets() {

        MainPage mainPage = new MainPage(browser);

        JavaEEPage javaEEPage = mainPage
                .clickJavaButton()
                .clickJavaEEButton()
                .clickAboutJavaEEButton();

        String descriptionJavaEE = javaEEPage.getDescriptionJavaServlets();

        Assert.assertEquals(descriptionJavaEE,"Java Servlets. Сервлеты представляют специальные модули, которые обрабатывают запросы от пользователей и отправляют результат обработки.");

    }




    //-----





    @After
    public void closeBrowser() {
        browser.quit();
    }





}
