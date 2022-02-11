import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach

    public void setup(String driverName) {

        if (driverName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\13473\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (driverName.equals("gecko")) {

            System.setProperty("wedriver.chrome.driver", "C:\\Users\\13473\\OneDrive\\Documents\\geckodriver-v0.30.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (driverName.equals("ie")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\13473\\OneDrive\\Documents\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();


        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }

    @AfterEach

    public void close(){
        driver.close();
    }
}
