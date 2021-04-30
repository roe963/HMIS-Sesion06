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
import org.openqa.selenium.remote.BrowserType;
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

public class SailsEditUserTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    // Browser selector
    int browser = 0; // 0: firefox, 1: chrome,...

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
    public void editusercorrect() {
        // Test name: Edit user correct
        // Step # | name | target | value
        // 1 | executeScript | return "ual-"+Math.floor(Math.random()*1500000)+"@ual.es"
        // | emailrandom
        vars.put("emailrandom", js.executeScript("return \"ual-\"+Math.floor(Math.random()*1500000)+\"@ual.es\""));
        // 2 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 3 | waitForElementPresent | linkText=Log in | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 4 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 5 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 6 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 7 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 8 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 9 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 10 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 11 | type | css=.form-group:nth-child(2) > .form-control | 123456
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 12 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 13 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 14 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 15 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 16 | click | linkText=Settings |
        driver.findElement(By.linkText("Settings")).click();
        // 17 | waitForElementPresent | linkText=Edit profile | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit profile")));
        }
        // 18 | click | linkText=Edit profile |
        driver.findElement(By.linkText("Edit profile")).click();
        // 19 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 20 | waitForElementPresent | id=full-name | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("full-name")));
        }
        // 21 | click | id=full-name |
        driver.findElement(By.id("full-name")).click();
        // Sustituye a clear()
        driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("full-name")).sendKeys(Keys.DELETE);
        // 22 | type | id=full-name | Usuario de prueba2
        driver.findElement(By.id("full-name")).sendKeys("Usuario de prueba2");
        // 23 | waitForElementPresent | id=email-address | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("email-address")));
        }
        // 25 | click | id=email-address |
        driver.findElement(By.id("email-address")).click();
        // Sustituye a clear()
        driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("email-address")).sendKeys(Keys.DELETE);
        // 26 | type | id=email-address | ${emailrandom}
        driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
        // 27 | waitForElementPresent | css=.button-text | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-text")));
        }
        // 28 | click | css=.button-text |
        driver.findElement(By.cssSelector(".button-text")).click();
        // 29 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 30 | waitForElementPresent | linkText=Edit profile | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit profile")));
        }
        // 31 | click | linkText=Edit profile |
        driver.findElement(By.linkText("Edit profile")).click();
        // 32 | waitForElementPresent | id=full-name | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("full-name")));
        }
        // 33 | click | id=full-name |
        driver.findElement(By.id("full-name")).click();// Sustituye a clear()
        driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("full-name")).sendKeys(Keys.DELETE);
        // 34 | type | id=full-name | Usuario de prueba
        driver.findElement(By.id("full-name")).sendKeys("Usuario de prueba");
        // 35 | waitForElementPresent | id=email-address | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("email-address")));
        }
        // 36 | click | id=email-address |
        driver.findElement(By.id("email-address")).click();
        // Sustituye a clear()
        driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("email-address")).sendKeys(Keys.DELETE);
        // 37 | type | id=email-address | usuariodeprueba@mail.es
        driver.findElement(By.id("email-address")).sendKeys("usuariodeprueba@mail.es");
        // 38 | waitForElementPresent | css=.button-text | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-text")));
        }
        // 39 | click | css=.button-text |
        driver.findElement(By.cssSelector(".button-text")).click();
        // 40 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 41 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 42 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 43 | waitForElementPresent | linkText=Sign out | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 44 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 45 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 46 | close | |
        driver.close();
    }

    @Test
    public void edituserincorrectbademailformat() {
        // Test name: Edit user incorrect bad email format
        // Step # | name | target | value
        // 1 | executeScript | return "ual-"+Math.floor(Math.random()*1500000)+"@ual.es"
        // | emailrandom
        vars.put("emailrandom", js.executeScript("return \"ual-\"+Math.floor(Math.random()*1500000)+\"@ual.es\""));
        // 2 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 3 | waitForElementPresent | linkText=Log in | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 4 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 5 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 6 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 7 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 8 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).clear();
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 9 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 10 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 11 | type | css=.form-group:nth-child(2) > .form-control | 123456

        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 12 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 13 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 14 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 15 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 16 | click | linkText=Settings |
        driver.findElement(By.linkText("Settings")).click();
        // 17 | waitForElementPresent | linkText=Edit profile | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit profile")));
        }
        // 18 | click | linkText=Edit profile |
        driver.findElement(By.linkText("Edit profile")).click();
        // 19 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 20 | waitForElementPresent | id=full-name | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("full-name")));
        }
        // 21 | click | id=full-name |
        driver.findElement(By.id("full-name")).click();
        // Sustituye a clear()
        driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("full-name")).sendKeys(Keys.DELETE);
        // 22 | type | id=full-name | Usuario de prueba
        driver.findElement(By.id("full-name")).sendKeys("Usuario de prueba");
        // 23 | waitForElementPresent | id=email-address | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("email-address")));
        }
        // 24 | click | id=email-address |
        driver.findElement(By.id("email-address")).click();
        // Sustituye a clear()
        driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("email-address")).sendKeys(Keys.DELETE);
        // 25 | type | id=email-address | usuariodeprueba
        driver.findElement(By.id("email-address")).sendKeys("usuariodeprueba");
        // 26 | waitForElementPresent | css=.button-text | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-text")));
        }
        // 27 | click | css=.button-text |
        driver.findElement(By.cssSelector(".button-text")).click();
        // 28 | executeScript | return
        // document.getElementById("email-address").validationMessage | message
        vars.put("message", js.executeScript("return document.getElementById(\"email-address\").validationMessage"));
        // 29 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 30 | assert | message | Incluye un signo "@" en la dirección de correo
        // electrónico. La dirección "usuariodeprueba" no incluye el signo "@".
        if (browser == 1) {
            assertEquals(vars.get("message").toString(),
                    "Incluye un signo \"@\" en la dirección de correo electrónico. La dirección \"usuariodeprueba\" no incluye el signo \"@\".");

        } else {
            assertEquals(vars.get("message").toString(), "Introduzca una dirección de correo.");
        }
        // 31 | waitForElementPresent | linkText=Cancel | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cancel")));
        }
        // 32 | click | linkText=Cancel |
        driver.findElement(By.linkText("Cancel")).click();
        // 33 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 34 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 35 | waitForElementPresent | linkText=Sign out | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 36 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 37 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 38 | close | |
        driver.close();
    }

    @Test
    public void edituserincorrectemailalreadyinuse() {
        // Test name: Edit user incorrect email already in use
        // Step # | name | target | value
        // 1 | executeScript | return "ual-"+Math.floor(Math.random()*1500000)+"@ual.es"
        // | emailrandom
        vars.put("emailrandom", js.executeScript("return \"ual-\"+Math.floor(Math.random()*1500000)+\"@ual.es\""));
        // 2 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 3 | waitForElementPresent | linkText=Log in | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 4 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 5 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 6 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 7 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 8 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 9 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 10 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 11 | type | css=.form-group:nth-child(2) > .form-control | 123456
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 12 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 13 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 14 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 15 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 16 | click | linkText=Settings |
        driver.findElement(By.linkText("Settings")).click();
        // 17 | waitForElementPresent | linkText=Edit profile | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit profile")));
        }
        // 18 | click | linkText=Edit profile |
        driver.findElement(By.linkText("Edit profile")).click();
        // 19 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 20 | waitForElementPresent | id=full-name | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("full-name")));
        }
        // 21 | click | id=full-name |
        driver.findElement(By.id("full-name")).click();
        // Sustituye a clear()
        driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("full-name")).sendKeys(Keys.DELETE);
        // 22 | type | id=full-name | Usuario de prueba
        driver.findElement(By.id("full-name")).sendKeys("Usuario de prueba");
        // 23 | waitForElementPresent | id=email-address | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("email-address")));
        }
        // 24 | click | id=email-address |
        driver.findElement(By.id("email-address")).click();
        // Sustituye a clear()
        driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("email-address")).sendKeys(Keys.DELETE);
        // 25 | type | id=email-address | usuariodeprueba2@mail.es
        driver.findElement(By.id("email-address")).sendKeys("usuariodeprueba2@mail.es");
        // 26 | waitForElementPresent | css=.button-text | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-text")));
        }
        // 27 | click | css=.button-text |
        driver.findElement(By.cssSelector(".button-text")).click();
        // 28 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 29 | assertText | css=div:nth-child(1) > .text-danger | There is already an
        // account using that email address.
        assertThat(driver.findElement(By.cssSelector("div:nth-child(1) > .text-danger")).getText(),
                is("There is already an account using that email address."));
        // 30 | waitForElementPresent | linkText=Cancel | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cancel")));
        }
        // 31 | click | linkText=Cancel |
        driver.findElement(By.linkText("Cancel")).click();
        // 32 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 33 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 34 | waitForElementPresent | linkText=Sign out | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 35 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 36 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 37 | close | |
        driver.close();
    }

    @Test
    public void edituserincorrectemptyname() {
        // Test name: Edit user incorrect empty name
        // Step # | name | target | value
        // 1 | executeScript | return "ual-"+Math.floor(Math.random()*1500000)+"@ual.es"
        // | emailrandom
        vars.put("emailrandom", js.executeScript("return \"ual-\"+Math.floor(Math.random()*1500000)+\"@ual.es\""));
        // 2 | open | http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/ |
        driver.get("http://hmis06-sailsapp.eastus2.cloudapp.azure.com:1337/");
        // 3 | waitForElementPresent | linkText=Log in | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        }
        // 4 | click | linkText=Log in |
        driver.findElement(By.linkText("Log in")).click();
        // 5 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 6 | waitForElementPresent | css=.form-group:nth-child(1) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
        }
        // 7 | click | css=.form-group:nth-child(1) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
        // 8 | type | css=.form-group:nth-child(1) > .form-control |
        // usuariodeprueba@mail.es
        driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
                .sendKeys("usuariodeprueba@mail.es");
        // 9 | waitForElementPresent | css=.form-group:nth-child(2) > .form-control |
        // 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector(".form-group:nth-child(2) > .form-control")));
        }
        // 10 | click | css=.form-group:nth-child(2) > .form-control |
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
        // 11 | type | css=.form-group:nth-child(2) > .form-control | 123456
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("123456");
        // 12 | click | css=.ajax-button |
        driver.findElement(By.cssSelector(".ajax-button")).click();
        // 13 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 14 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 15 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 16 | click | linkText=Settings |
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings")));
        }
        driver.findElement(By.linkText("Settings")).click();
        // 17 | waitForElementPresent | linkText=Edit profile | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit profile")));
        }
        // 18 | click | linkText=Edit profile |
        driver.findElement(By.linkText("Edit profile")).click();
        // 19 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 20 | waitForElementPresent | id=full-name | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("full-name")));
        }
        // 21 | click | id=full-name |
        driver.findElement(By.id("full-name")).click();
        // Sustituye a clear()
        driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("full-name")).sendKeys(Keys.DELETE);
        // 22 | type | id=full-name |
//        driver.findElement(By.id("full-name")).sendKeys("");
        // 23 | waitForElementPresent | id=email-address | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("email-address")));
        }
        // 24 | click | id=email-address |
        driver.findElement(By.id("email-address")).click();
        // Sustituye a clear()
        driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElement(By.id("email-address")).sendKeys(Keys.DELETE);
        // 25 | type | id=email-address | usuariodeprueba@mail.es
        driver.findElement(By.id("email-address")).sendKeys("usuariodeprueba@mail.es");
        // 26 | waitForElementPresent | css=.button-text | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-text")));
        }
        // 27 | click | css=.button-text |
        driver.findElement(By.cssSelector(".button-text")).click();
        // 28 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 29 | assertText | css=.invalid-feedback | Please enter your full name.
        assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(),
                is("Please enter your full name."));
        // 30 | waitForElementPresent | linkText=Cancel | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cancel")));
        }
        // 31 | click | linkText=Cancel |
        driver.findElement(By.linkText("Cancel")).click();
        // 32 | waitForElementPresent | id=header-account-menu-link | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
        }
        // 33 | click | id=header-account-menu-link |
        driver.findElement(By.id("header-account-menu-link")).click();
        // 34 | waitForElementPresent | linkText=Sign out | 3000
        {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        }
        // 35 | click | linkText=Sign out |
        driver.findElement(By.linkText("Sign out")).click();
        // 36 | pause | 1000 |
        // Pausa extra, porque hay veces que el wait for element clickable no es
        // suficiente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 37 | close | |
        driver.close();
    }
}
