package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProductoPage {
    public static final Target ADDPRODUCT = Target.the("add prodcut ")
            .locatedForAndroid(By.xpath("(//androidx.recyclerview.widget.RecyclerView//android.widget.FrameLayout[@resource-id='com.exito.appcompania:id/cardView_main']//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraitLayout_add_item'])[1]")).locatedForIOS(By.id(""));

    public static final Target TITTLEPRDUCT = Target.the("tittle prodcut ")
            .locatedForAndroid(By.xpath("(//androidx.recyclerview.widget.RecyclerView//android.widget.FrameLayout[@resource-id='com.exito.appcompania:id/cardView_main']//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraintLayout_item_info']//android.widget.TextView[@resource-id='com.exito.appcompania:id/appCompatTextView_product_title'])[1]")).locatedForIOS(By.id(""));

    public static final Target SHOPCAR = Target.the("shop car")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart")).locatedForIOS(By.id(""));

}
