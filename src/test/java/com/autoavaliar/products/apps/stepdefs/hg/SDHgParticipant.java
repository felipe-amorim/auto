package com.autoavaliar.products.apps.stepdefs.hg;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import com.autoavaliar.products.apps.objetos.hg.HgAuthLogin;
import com.autoavaliar.support.CoreREST;

import static com.autoavaliar.products.apps.objetos.hg.HgParticipant.*;

public class SDHgParticipant extends CoreREST {

    private SDHgAuthLogin sdHgAuthLogin = new SDHgAuthLogin();
    private SDHgPartnerLogin sdHgPartnerLogin = new SDHgPartnerLogin();


    @When("O usuario envia uma requisicao para o participant cpfexists {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantCpfexistsComUmCpfJaCadastradoURIEndpointCpf(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        body().put(new JSONObject(hgParticipantCpfExistsPost.replace("arg0", arg2)));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo de resposta exibe cpf ja cadastrado {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeCpfJaCadastrado(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("isRegistered", "true");
        response().body().mustHaveKeyAndValue("error_message", "CPF já cadastrado");
    }

    @Then("O usuario valida que o corpo de resposta exibe cpf nao cadastrado {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeCpfNaoCadastrado(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("isRegistered", "false");
    }

    @When("O usuario envia uma requisicao para o participant emailexists {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantEmailexistsURIEndpointEmail(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        if(arg2.equals("true")) {
            body().put(new JSONObject(hgParticipantEmailExists.replace("arg0", "\""+arg2+"\"")));
        }else {
            body().put(new JSONObject(hgParticipantEmailExists.replace("arg0", arg2)));
        }
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo de resposta exibe que o status do email e verdadeiro {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeQueOStatusDoEmailEVerdadeiro(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustNotHaveKeyAndValue("user", "[]");
        response().body().mustNotHaveKeyAndValue("entity", "[]");
        response().body().mustNotHaveKeyAndValue("instance", "[]");
    }

    @Then("O usuario valida que o corpo de resposta exibe que o status do email e falso {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeQueOStatusDoEmailEFalso(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("user", "[]");
        response().body().mustHaveKeyAndValue("entity", "[]");
        response().body().mustHaveKeyAndValue("instance", "[]");
    }

    @When("O usuario envia uma requisicao para o participant cnpjexists {string} {string} {string} {int}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantCnpjexistsURIEndpointCnpj(String arg0, String arg1, String arg2, int arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        body().put(new JSONObject(hgParticipantCnpjExists.replace("arg0", arg2).replace("arg1", String.valueOf(arg3))));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo de resposta exibe cnpj nao cadastrado {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeCnpjNaoCadastrado(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("entity", "null");
        response().body().mustHaveKeyAndValue("cnpjIsValid", "true");
    }

    @Then("O usuario valida que o corpo de resposta exibe cnpj e invalido {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeCnpjEInvalido(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "Número de CNPJ inválido.");
    }

    @Then("O usuario valida que o corpo de resposta exibe cpf e invalido {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaExibeCpfEInvalido(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("entity", "null");
        response().body().mustHaveKeyAndValue("error_message", "Número de CPF inválido.");
    }


    @When("O usuario envia uma requisicao para o participant cpfexists com token partner {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantCpfexistsComTokenPartnerURIEndpointCpf(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        body().put(new JSONObject(hgParticipantCpfExistsPost.replace("arg0", arg2)));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o participant cpfexists sem token {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantCpfexistsSemTokenURIEndpointCpf(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        body().put(new JSONObject(hgParticipantCpfExistsPost.replace("arg0", arg2)));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o participant emailexists com token partner {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantEmailexistsComTokenPartnerURIEndpointEmailpost(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        body().put(new JSONObject(hgParticipantEmailExists.replace("arg0", arg2)));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o participant emailexists sem token {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOParticipantEmailexistsSemTokenURIEndpointEmailpost(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        body().put(new JSONObject(hgParticipantEmailExists.replace("arg0", arg2)));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida a mensagem de erro de Email nao pode ser vazio {int}")
    public void oUsuarioValidaAMensagemDeErroDeEmailNaoPodeSerVazio(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "O valor e-mail do participante não pode ser vazio.");
    }
}
