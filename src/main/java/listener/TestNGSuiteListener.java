package listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNGSuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("====");
        System.out.println(suite.getName());
        System.out.println(suite.getSuiteState());

    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("====");
        System.out.println(suite.getName());
        System.out.println(suite.getResults());


    }
}
