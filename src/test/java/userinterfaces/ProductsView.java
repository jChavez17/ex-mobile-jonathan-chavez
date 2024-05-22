package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.AppiumBy;

public class ProductsView {
    public static Target obtenerTexto = Target.the("titulo")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='PRODUCTS']"));
}
