package listener;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReportListener implements ITestListener {

    WebDriver driver;

    public  TestNGReportListener( WebDriver driver){

        this.driver= driver;

    }

    @Override
    public void onStart (ITestContext iTestContext) {

        System.out.println("====");
        System.out.println(iTestContext.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("====");
        System.out.println(result.getName());
    }




    @Override
    public void onTestFailure(ITestResult result) {

    System.out.println("====");

    System.out.println(result.getName());


    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);

        System.out.println("====");

        System.out.println(result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        System.out.println("====");

        System.out.println(result.getName());

    }

    }

