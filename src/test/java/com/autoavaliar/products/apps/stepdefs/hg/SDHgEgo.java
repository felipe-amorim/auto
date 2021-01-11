package com.autoavaliar.products.apps.stepdefs.hg;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.autoavaliar.products.apps.objetos.hg.HgAuthLogin;
import com.autoavaliar.support.CoreREST;

public class SDHgEgo extends CoreREST {
    private SDHgAuthLogin sdHgAuthLogin = new SDHgAuthLogin();
    private SDHgPartnerLogin sdHgPartnerLogin = new SDHgPartnerLogin();

    @When("O usuario envia uma requisicao para o ego sellers list {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOEgoSellerslistURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        parameters().put("cache", "delete");
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo possui algum vendedor {int}")
    public void oUsuarioValidaQueOCorpoPossuiAlgumVendedor(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustNotHaveKeyAndValue("payload", "[]");
        response().body().mustHaveKey("id");
        response().body().mustHaveKey("name");
        response().body().mustHaveKey("status");
        response().body().mustHaveKey("messages");
        response().body().mustHaveKey("messagesLite");
        response().body().mustHaveKey("meta");
        response().body().mustHaveKey("requestTime");
        response().body().mustHaveKey("memoryPeak");
        response().body().mustHaveKey("memoryUsage");
    }

    @When("O usuario envia uma requisicao para o ego entities list {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOEgoEntitieslistURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token", HgAuthLogin.tokenAuth);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo possui alguma entidade {int}")
    public void oUsuarioValidaQueOCorpoPossuiAlgumaEntidade(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustNotHaveKeyAndValue("payload", "[]");
        response().body().mustHaveKey("id");
        response().body().mustHaveKey("name");
        response().body().mustHaveKey("cnpj");
        response().body().mustHaveKey("status");
        response().body().mustHaveKey("messages");
        response().body().mustHaveKey("messagesLite");
        response().body().mustHaveKey("meta");
        response().body().mustHaveKey("requestTime");
        response().body().mustHaveKey("memoryPeak");
        response().body().mustHaveKey("memoryUsage");
    }

    @When("O usuario envia uma requisicao para o ego sellers list com o token de parter {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOEgoSellerslistComOTokenDeParterURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        parameters().put("cache", "delete");
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que a requisicao nao pode ser feita sem o token correto {int}")
    public void oUsuarioValidaATransacaoNaoPodeSerFeitaSemOTokenCorreto(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "Token inválido para esta transação.");
    }

    @When("O usuario envia uma requisicao para o ego entities list com o token de parter {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOEgoEntitieslistComOTokenDeParterURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o ego sellers list sem token {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOEgoSellerslistSemTokenURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        parameters().put("cache", "delete");
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o ego entities list sem token {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOEgoEntitieslistSemTokenURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida a mensagem de erro de Cpf nao pode ser vazio {int}")
    public void oUsuarioValidaAMensagemDeErroDeCpfNaoPodeSerVazio(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "O valor CPF não pode ser vazio.");
    }


}
