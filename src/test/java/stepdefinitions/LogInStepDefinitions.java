package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ProductQuestion;
import tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LogInStepDefinitions {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario ingresa username y password")
    public void el_usuario_ingresa_username_y_password() {
        theActorCalled("Jonathan").attemptsTo(
                new Login()
        );
    }

    @Entonces("le aparece la lista de productos")
    public void le_aparece_la_lista_de_productos() {
        String textoEsperado = "PRODUCTS";

        theActorInTheSpotlight().should(
                seeThat("valor", ProductQuestion.value(),
                        equalTo(textoEsperado))
        );
    }

}
