package testng;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class macysHomePage extends Base {

    @DataProvider(name = "macys")

    public Object[][]createMacysTestData() {

        return new Object[][]{{"rsonia_islam@yahoo.com", "password2"}, {"jaynab", "password7"}};
    }

    @Test(dataProvider = "googleData")

    public void testMacysHomePage(String [] data){

        WebDriver driver = null;
        driver.get("https://www.macys.com");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='sign-in']")).click();
        driver.findElement(By.id("email")).sendKeys(data[0]);
        driver.findElement(By.id("password")).sendKeys(data[1]);


    }

    @Test(priority = 2,groups = "sanity")

    public void testMacysLinks(){
        System.out.println("testMacysLinks");

    }

    @Test(dependsOnMethods = " testMacysHomePage", dependsOnGroups = "maycs",priority = 3)


    public void testMacysSignin(){

    }
     @Test(groups = "sanity")
     public void test4(){

        System.out.println("test4");

        }






}
