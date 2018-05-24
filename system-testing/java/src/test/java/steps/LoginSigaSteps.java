package steps;

import cucumber.api.java.en.Given;
import pages.LoginSiga;
import support.BaseSteps;

public class LoginSigaSteps extends BaseSteps {

    private static LoginSiga login = new LoginSiga(driver);


    @Given("^user would like to log in Siga application$")
    public void userwouldliketologinSigaapplication() {
        }
    }