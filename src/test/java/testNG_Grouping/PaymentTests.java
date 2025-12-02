package testNG_Grouping;
import org.testng.annotations.Test;

public class PaymentTests {

    @Test(groups = {"smoke"})
    public void paymentWithCreditCard() {
        System.out.println("Payment with Credit Card - Smoke Test");
    }

    @Test(groups = {"regression"})
    public void paymentWithUPI() {
        System.out.println("Payment with UPI - Regression Test");
    }
}
