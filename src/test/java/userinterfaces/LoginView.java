package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.AppiumBy;

public class LoginView {
    public static Target Username = Target.the("Username")
            .located(AppiumBy.accessibilityId("test-Username"));

    public static Target password = Target.the("password")
            .located(AppiumBy.accessibilityId("test-Password"));
    public static Target btnSubmit = Target.the("login")
            .located(AppiumBy.accessibilityId("test-LOGIN"));



}
