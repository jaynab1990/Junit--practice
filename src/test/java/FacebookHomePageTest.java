import facebook.FacebookHomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FacebookHomePageTest extends Base {

    @ParameterizedTest

    @ValueSource(strings = { "ram", "sam","dam"})

    public void facebookHomePageTest1(){

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        FacebookHomePage facebookHomePage = new FacebookHomePage(driver,wait);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    @Test

    public void test2(){


    }

    @Test

    public void test3(){

    }







}
