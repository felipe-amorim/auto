package com.autoavaliar.products.apps.stepdefs.hg;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import com.autoavaliar.products.apps.objetos.hg.HgAuthLogin;
import com.autoavaliar.support.CoreREST;

import static com.autoavaliar.products.apps.objetos.hg.HgAuthLogin.hgAuthLoginbodyAuthPost;


public class SDHgAuthLogin extends CoreREST {

    public static String uri = "";
    public static String endPoint = "";

    @Given("O usuario constroe requisicao para a URI {string}")
    public void oUsuarioConstroeRequisicaoParaAURIURI(String arg0) {
        uri = arg0;
        evidence("Armazenando URI");
    }

    @And("O endpoint auth {string}")
    public void oEndpointAuthAuth(String arg0) {
        evidence("Armazenando Endpoint");
        endPoint = arg0;
    }

    @And("O usuario define o tipo de request como POST")
    public void oUsuarioDefineOTipoDeRequestComoPOST() {
        evidence("Criando a GenericUrl");
        createRequest(uri).endpoint(endPoint).post();
    }

    @And("O usuario insere o token {string}")
    public void oUsuarioInsereOToken(String arg0) {
        evidence("Armazenando Token");
        headers().put("token",arg0);
    }

    @And("O usuario insere o body com o email {string} e password {string}")
    public void oUsuarioInsereOBodyComOEmailEmailEPasswordPassword(String arg0, String arg1) {
        evidence("Armazenando body");
        String jsonString = hgAuthLoginbodyAuthPost;
        jsonString = jsonString.replace("arg0", arg0).replace("arg1", arg1);
        JSONObject json = new JSONObject(jsonString);
        body().put(json);
    }

    @When("O usuario dispara a request")
    public void oUsuarioDisparaARequest() {
        send();
    }

    @Then("O usuario valida que o status recebido e {int}")
    public void oUsuarioValidaQueOStatusRecebidoE(int arg0) {
        response().status().mustBe(arg0);
    }

    @And("O usuario verificar se existe a chave token")
    public void oUsuarioVerificarSeExisteAChaveToken() {
        response().body().mustHaveKey("token");
    }

    @Given("O usuarii controi a requisicao para a uri {string} com o endpoint {string} do tipo POST")
    public void oUsuariiControiARequisicaoParaAUriURIComOEndpointAuthDoTipoPOST(String arg0, String arg1) {

        createRequest(arg0).endpoint(arg1).post();
    }

    @And("O usuario armazena o token de resposta")
    public void oUsuarioArmazenaOTokenDeResposta() {
        JSONObject response = response().body().get();
        JSONObject responsePayLoad = response.getJSONObject("payload");
        JSONObject responseAuth = responsePayLoad.getJSONObject("auth");
        HgAuthLogin.tokenAuth = responseAuth.getString("token");
        System.out.println("TOKEN: "+HgAuthLogin.tokenAuth);
    }

    @When("O usuario controi a requisicao para a uri {string} com o endpoint {string} do tipo POST")
    public void oUsuarioControiARequisicaoParaAUriURIComOEndpointAuthDoTipoPOST(String arg0, String arg1) {
        createRequest(arg0).endpoint(arg1).post();
    }
}
