package testNG_Grouping;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(groups = {"smoke"})
    public void loginWithValidUser() {
        System.out.println("Login with valid user - Smoke Test");
    }

    @Test(groups = {"regression"})
    public void loginWithInvalidUser() {
        System.out.println("Login with invalid user - Regression Test");
    }
}
