package org.ual.hmis.ortega2;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SailsEditPassTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    // Browser selector
    int browser = 1; // 0: firefox, 1: chrome,...

    @Before
    public void setUp() {
        Boolean headless = true;
        switch (browser) {
        case 0: // firefox
            // Firefox
            // Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
            // Descomprimir el archivo geckodriver.exe en la carpeta drivers

            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            if (headless)
                firefoxOptions.setHeadless(headless);
            driver = new FirefoxDriver(firefoxOptions);

            break;
        case 1: // chrome
            // Chrome
            // Descargar Chromedriver de https://chromedriver.chromium.org/downloads
            // Descomprimir el archivo chromedriver.exe en la carpeta drivers

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            if (headless)
                chromeOptions.setHeadless(headless);
            chromeOptions.addArguments("window-size=1920,1080");
            driver = new ChromeDriver(chromeOptions);

            break;

        default:
            fail("Please select a browser");
            break;
        }
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        if (browser == 1)
            driver.quit();
    }

    @Test
    public void editpasscorrect() {
        // Test name: Edit pass correct
        // Step # | name | target | value
        // 1 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 2 | waitForElementPresent | linkText=Log in | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 3 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 4 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 5 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 6 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 7 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 8 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 9 | type | css=.form-group:nth-child(2) > .form-control | 123456
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 10 | waitForElementPresent | css=.ajax-button | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ajax-button")));
        }
        // 11 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 12 | waitForElementPresent | id=header-account-menu-link | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 13 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 14 | waitForElementPresent | linkText=Settings | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings")));
        }
        // 15 | click | linkText=Settings |
        driver.findElement(By.linkText("Settings")).click();
        // 16 | waitForElementPresent | linkText=Change password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change password")));
        }
        // 17 | click | linkText=Change password |
        driver.findElement(By.linkText("Change password")).click();
        // 18 | waitForElementPresent | id=password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        }
        // 19 | type | id=password | 123456
        driver.findElement(By.id("password")).sendKeys("123456");
        // 20 | waitForElementPresent | id=confirm-password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-password")));
        }
        // 21 | type | id=confirm-password | 123456
        driver.findElement(By.id("confirm-password")).sendKeys("123456");
        // 22 | waitForElementPresent | css=.ajax-button | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ajax-button")));
        }
        // 23 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 24 | waitForElementPresent | id=header-account-menu-link | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 25 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 26 | waitForElementPresent | linkText=Sign out | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 27 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 28 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 29 | close | |
        driver.close();
    }

    @Test
    public void editpassincorrectconfirmpassdistinct() {
        // Test name: Edit pass incorrect confirm pass distinct
        // Step # | name | target | value
        // 1 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 2 | waitForElementPresent | linkText=Log in | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 3 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 4 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 5 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 6 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 7 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 8 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 9 | type | css=.form-group:nth-child(2) > .form-control | 123456
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 10 | waitForElementPresent | css=.ajax-button | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ajax-button")));
        }
        // 11 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 12 | waitForElementPresent | id=header-account-menu-link | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 13 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 14 | waitForElementPresent | linkText=Settings | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings")));
        }
        // 15 | click | linkText=Settings |
        driver.findElement(By.linkText("Settings")).click();
        // 16 | waitForElementPresent | linkText=Change password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change password")));
        }
        // 17 | click | linkText=Change password |
        driver.findElement(By.linkText("Change password")).click();
        // 18 | waitForElementPresent | id=password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        }
        // 19 | type | id=password | 123456
        driver.findElement(By.id("password")).sendKeys("123456");
        // 20 | waitForElementPresent | id=confirm-password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-password")));
        }
        // 21 | type | id=confirm-password | 1234567
        driver.findElement(By.id("confirm-password")).sendKeys("1234567");
        // 22 | waitForElementPresent | css=.ajax-button | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ajax-button")));
        }
        // 23 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 24 | waitForElementPresent | css=.invalid-feedback | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".invalid-feedback")));
        }
        // 25 | assertText | css=.invalid-feedback | Your new password and confirmation
        // do not match.
        assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(),
                is("Your new password and confirmation do not match."));
        // 26 | waitForElementPresent | id=header-account-menu-link | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 27 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 28 | waitForElementPresent | linkText=Sign out | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 29 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 30 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 31 | close | |
        driver.close();
    }

    @Test
    public void editpassincorrectempty() {
        // Test name: Edit pass incorrect empty
        // Step # | name | target | value
        // 1 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 2 | waitForElementPresent | linkText=Log in | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 3 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 4 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 5 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 6 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 7 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 8 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 9 | type | css=.form-group:nth-child(2) > .form-control | 123456
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 10 | waitForElementPresent | css=.ajax-button | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ajax-button")));
        }
        // 11 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 12 | waitForElementPresent | id=header-account-menu-link | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 13 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 14 | waitForElementPresent | linkText=Settings | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings")));
        }
        // 15 | click | linkText=Settings |
        driver.findElement(By.linkText("Settings")).click();
        // 16 | waitForElementPresent | linkText=Change password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change password")));
        }
        // 17 | click | linkText=Change password |
        driver.findElement(By.linkText("Change password")).click();
        // 18 | waitForElementPresent | id=password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        }
        // 19 | type | id=password |
        driver.findElement(By.id("password")).sendKeys(" ");
        // 20 | waitForElementPresent | id=confirm-password | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-password")));
        }
        // 21 | type | id=confirm-password | 123456
        driver.findElement(By.id("confirm-password")).sendKeys("123456");
        // 22 | waitForElementPresent | css=.ajax-button | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ajax-button")));
        }
        // 23 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 24 | waitForElementPresent | css=.col-sm-6:nth-child(1) .invalid-feedback |
        // 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".col-sm-6:nth-child(1) .invalid-feedback")));
        }
        // 25 | assertText | css=.col-sm-6:nth-child(1) .invalid-feedback | Please enter
        // a password or choose "Cancel".
        assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .invalid-feedback")).getText(),
                is("Please enter a password or choose \"Cancel\"."));
        // 26 | waitForElementPresent | id=header-account-menu-link | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 27 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 28 | waitForElementPresent | linkText=Sign out | 30000
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 29 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 30 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 31 | close | |
        driver.close();
    }
}
