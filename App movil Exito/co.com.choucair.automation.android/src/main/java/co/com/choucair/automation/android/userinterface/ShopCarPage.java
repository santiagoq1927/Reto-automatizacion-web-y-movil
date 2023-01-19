package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopCarPage {

    public static final Target TITLEPRODUCTCAR = Target.the("title product car")
            .locatedForAndroid(By.xpath("//android.view.View[@resource-id='product-name102315418']//android.widget.TextView")).locatedForIOS(By.id(""));

}
