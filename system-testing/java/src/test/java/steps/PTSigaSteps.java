package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.junit.Assert;
import pages.HomeSiga;
import pages.LoginSiga;
import support.BaseSteps;
import java.util.Map;


/**
 * @author Henrique Pinheiro
 */
public class PTSigaSteps extends BaseSteps{

    private static LoginSiga login = new LoginSiga(driver);
    private static HomeSiga home = new HomeSiga(driver);

    @Dado("^que eu como usuário gostaria de acessar o SIGA$")
    public void queEuComoUsuárioGostariaDeAcessarOSIGA() throws Throwable {
        login.openSiga();
    }

    @Dado("^que eu preencha o campo Usuário com o valor \"([^\"]*)\"$")
    public void queEuPreenchaOCampoUsuárioComOValor(String strUser) throws Throwable {
        login.fillUsuario(strUser);
    }

    @E("^eu preencha o campo Senha com o valor \"([^\"]*)\"$")
    public void euPreenchaOCampoSenhaComOValor(String strPass) throws Throwable {
        login.fillSenha(strPass);
    }

    @Quando("^eu clicar no botão Confirmar$")
    public void euClicarNoBotãoConfirmar() throws Throwable {
        login.clickContinuar();
    }

    @Então("^a mensagem \"([^\"]*)\" deve ser exibida$")
    public void aMensagemDeveSerExibida(String strMsg) throws Throwable {
        Assert.assertEquals(strMsg, login.checkMessage());
    }

    @Então("^a Home do SIGA deve ser exibida$")
    public void aHomeDoSIGADeveSerExibida() throws Throwable {
        driver.waitElement("span_MPW0039vPRO_PESSOALNOME");
        Assert.assertEquals("https://siga.cps.sp.gov.br/aluno/home.aspx", home.homeAcess());
    }

    @E("^os seguintes dados devem ser exibidas:$")
    public void asSeguintesInformaçõesDevemSerExiidas(Map<String, String> infoTable) throws Throwable {
        for (String info : infoTable.keySet()) {
            switch (info){
                case "Nome":
                    Assert.assertEquals(infoTable.get(info), home.checkName());
                    break;
                case "E-mail":
                    Assert.assertEquals(infoTable.get(info), home.checkEmail());
                    break;
                case "CPF":
                    Assert.assertEquals(infoTable.get(info), home.checkCPF());
                    break;
                case "Data de nascimento":
                    Assert.assertEquals(infoTable.get(info), home.checkBirth());
                    break;
            }
        }
    }
}
