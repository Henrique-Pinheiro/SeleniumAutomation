package pages;

import support.DriverQA;

public class LoginSiga {
    private DriverQA driver;

    public LoginSiga(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickContinuar(){
        driver.click("BTCONFIRMA","name");
    }
}
