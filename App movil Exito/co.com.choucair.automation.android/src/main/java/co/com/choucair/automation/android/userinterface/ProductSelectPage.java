package co.com.choucair.automation.android.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductSelectPage {

    public static final Target SEARCHER = Target.the("prodcut searcher")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatEditText_search_bar")).locatedForIOS(By.id(""));

    public static final Target BTNSEARCHER = Target.the(" btnprodcut searcher")
            .locatedForAndroid(By.id("com.exito.appcompania:id/text_input_start_icon")).locatedForIOS(By.id(""));

    public static final Target DELIVERY = Target.the("delivery prodcut")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatTextView_item_title")).locatedForIOS(By.id(""));

    public static final Target EDITDIRECTION = Target.the("btn edit direction")
            .locatedForAndroid(By.id("com.exito.appcompania:id/MaterialButton_icon_action_edit")).locatedForIOS(By.id(""));

    public static final Target DPTO = Target.the("dpto direction")
            .locatedForAndroid(By.id("com.exito.appcompania:id/MaterialButton_icon_action_edit")).locatedForIOS(By.id(""));

    public static final Target DELIVERYCITY = Target.the("delivery prodcut city")
            .locatedForAndroid(By.id("com.exito.appcompania:id/filled_exposed_dropdown_city")).locatedForIOS(By.id(""));

    public static final Target DELIVERYSTREET = Target.the("delivery prodcut city")
            .locatedForAndroid(By.id("//android.widget.LinearLayout[@resource-id='com.exito.appcompania:id/CustomEditText_address']//android.widget.EditText")).locatedForIOS(By.id(""));


    public static final Target DELIVERYSTORE = Target.the("delivery prodcut store")
            .locatedForAndroid(By.id("com.exito.appcompania:id/filled_exposed_dropdown_store")).locatedForIOS(By.id(""));

    public static final Target BTNCONTINUEDELIVERY = Target.the("btn delivery prodcut ")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatButton_continue")).locatedForIOS(By.id(""));

    public static final Target BTNCONTINUE = Target.the("btn continue")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatButton_continue")).locatedForIOS(By.id(""));

    public static final Target SEARCHERII = Target.the("prodcut searcher")
            .locatedForAndroid(By.id("com.exito.appcompania:id/appCompatEditText_search_data_edit")).locatedForIOS(By.id(""));



}
