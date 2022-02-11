package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

public class FacebookHomePage {


    @FindBy(xpath = "//div[text()='Sign Up']")

    public WebElement signupPopHeader;

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement createAccountButton;



    @FindBy(name = "firstname")
    public
    WebElement firstname;

    @FindBy(name="lastname")
    public
    WebElement lastname;

    @FindBy(name = "email")
    public WebElement email;


    WebDriver driver;
    WebDriverWait wait;

    public FacebookHomePage(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);

    }

    public void createNewFacebookAccount(){

        createAccountButton.click();

        wait.until(ExpectedConditions.visibilityOf(firstname));

        firstname.sendKeys("Zayan");

        lastname.sendKeys("Islam");


    }


}
