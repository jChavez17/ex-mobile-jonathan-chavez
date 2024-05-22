package questions;

import userinterfaces.ProductsView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return ProductsView.obtenerTexto.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new ProductQuestion();
    }
}
