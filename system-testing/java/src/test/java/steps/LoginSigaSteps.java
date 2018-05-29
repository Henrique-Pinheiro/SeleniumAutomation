package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginSiga;
import support.BaseSteps;

public class LoginSigaSteps extends BaseSteps {

    private static LoginSiga login = new LoginSiga(driver);


    @Given("^user would like to log in Siga application$")
    public void userwouldliketologinSigaapplication() {
        login.openSiga();
    }

    @Given("^user informs Usuário with value equal \"([^\"]*)\"$")
    public void userInformsUsuárioWithValueEqual(String value) throws Throwable {
        login.fillUsuario(value);
    }


    @And("^user informs Senha with value equal \"([^\"]*)\"$")
    public void userInformsSenhaWithValueEqual(String value) throws Throwable {
        login.fillSenha(value);
    }

    @When("^User clicks on Confirmar button$")
    public void userClicksOnConfirmarButton() throws Throwable {
        login.clickContinuar();
    }

    @Then("^user should see fail message with \"([^\"]*)\"$")
    public void userShouldSeeFailMessageWith(String value) throws Throwable {
        Assert.assertEquals(value, login.checkMessage());
    }
}
