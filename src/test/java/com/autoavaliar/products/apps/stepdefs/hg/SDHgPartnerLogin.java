package com.autoavaliar.products.apps.stepdefs.hg;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import com.autoavaliar.support.CoreREST;

import static com.autoavaliar.products.apps.objetos.hg.HgPartnerLogin.hgPartnerLoginBodyAuthPost;


public class SDHgPartnerLogin extends CoreREST {

    public static String tokenPartner = "";
    private SDHgAuthLogin sdHgAuthLogin = new SDHgAuthLogin();


    @Given("O usuario insere o body com country id {int}")
    public void oUsuarioInsereOBodyComCountryIdCountryid(int arg0) {
        evidence("Armazenando body");
        String jsonString = hgPartnerLoginBodyAuthPost;
        jsonString = jsonString.replace("arg0", String.valueOf(arg0));
        JSONObject json = new JSONObject(jsonString);
        body().put(json);
    }


    @And("O usuario armazena o token partner de resposta")
    public void oUsuarioArmazenaOTokenPartnerDeResposta() {
        JSONObject response = response().body().get();
        JSONObject responsePayLoad = response.getJSONObject("payload");
        String token = responsePayLoad.getString("token");
        System.out.println("TOKEN: "+token);
        tokenPartner = token;
    }

    @And("O usuario utiliza o token ja capturado")
    public void oUsuarioUtilizaOTokenJaCapturado() {
        headers().put("token", tokenPartner );
    }

    @Given("O usuario pega o token partner {string} {string} {int} {int}")
    public void oUsuarioPegaOTokenPartnerURIAuthCountryid(String arg0, String arg1, int arg2, int arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        oUsuarioInsereOBodyComCountryIdCountryid(arg2);
        sdHgAuthLogin.oUsuarioDisparaARequest();
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg3);
        sdHgAuthLogin.oUsuarioVerificarSeExisteAChaveToken();
        oUsuarioArmazenaOTokenPartnerDeResposta();
    }

    @When("O usuario envia requisicao de autenticacao para hg {string} {string} {string} {string}")
    public void oUsuarioEnviaRequisicaoDeAutenticacaoParaHgURIAuthEmailPassword(String arg0, String arg1, String arg2, String arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        oUsuarioUtilizaOTokenJaCapturado();
        sdHgAuthLogin.oUsuarioInsereOBodyComOEmailEmailEPasswordPassword(arg2, arg3);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }


    @Then("O usuario faz as validações de autenticacao {int}")
    public void oUsuarioFazAsValidaçõesDeAutenticacao(int arg0) {
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg0);
        sdHgAuthLogin.oUsuarioVerificarSeExisteAChaveToken();
        sdHgAuthLogin.oUsuarioArmazenaOTokenDeResposta();
    }
}
