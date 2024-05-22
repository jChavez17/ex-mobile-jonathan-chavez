package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterfaces.LoginView;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                SendKeys.of("standard_user").into(LoginView.Username),
                SendKeys.of("secret_sauce").into(LoginView.password),
                Click.on(LoginView.btnSubmit)
        );
    }
}
