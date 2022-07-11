package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.Page_ItemDetails;
import pages.Page_Main;

public class BaseTest {
    public Page_Main page_main;
    public Page_ItemDetails page_itemDetails;

    WebDriver driver;

    @BeforeTest
    public void prestart() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        page_main = PageFactory.initElements(driver, Page_Main.class);
        page_itemDetails = PageFactory.initElements(driver, Page_ItemDetails.class);
        page_main.goTO();
        page_main.agreeWithCookie();
    }
    @AfterMethod
    public void finish() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
