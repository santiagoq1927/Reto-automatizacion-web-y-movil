package co.com.choucair.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("title product car");
    }

    public static ValidateProduct validateProd(){
        return  new ValidateProduct();
    }
}
