package com.autoavaliar.products.apps.stepdefs.hg;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import com.autoavaliar.products.apps.objetos.hg.HgAuthLogin;
import com.autoavaliar.support.CoreREST;

import static com.autoavaliar.products.apps.objetos.hg.HGGeo.*;

public class SDHgGeo extends CoreREST {
    public static int stateID = 0;
    public static String zipID = "";
    private SDHgAuthLogin sdHgAuthLogin = new SDHgAuthLogin();
    private SDHgPartnerLogin sdHgPartnerLogin = new SDHgPartnerLogin();

    @Given("O usuario esta autenticado {string} {string} {int} {int} {string} {string} {string} {int}")
    public void oUsuarioEstaAutenticadoURIAuthCountryidURIAuthEmailPassword(String arg0, String arg1, int arg2, int arg3, String arg4, String arg5, String arg6, int arg7) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioInsereOBodyComCountryIdCountryid(arg2);
        sdHgAuthLogin.oUsuarioDisparaARequest();
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg3);
        sdHgAuthLogin.oUsuarioVerificarSeExisteAChaveToken();
        sdHgPartnerLogin.oUsuarioArmazenaOTokenPartnerDeResposta();
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg4);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        sdHgAuthLogin.oUsuarioInsereOBodyComOEmailEmailEPasswordPassword(arg5, arg6);
        sdHgAuthLogin.oUsuarioDisparaARequest();
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg7);
        sdHgAuthLogin.oUsuarioVerificarSeExisteAChaveToken();
        sdHgAuthLogin.oUsuarioArmazenaOTokenDeResposta();
    }


    @When("O usuario envia uma requisicao para o geo getcountries {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetcountriesURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        body().put(new JSONObject(hgGeoGetCountriesPost));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo de resposta possui argentina brasil e chile {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaPossuiArgentinaBrasilEChile(int arg0) {
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg0);
        response().body().mustHaveString(hgGeoGetCountriesPostResponse);
        response().body().mustHaveKey("payload");
        response().body().mustHaveKey("id");
        response().body().mustHaveKey("name");
        response().body().mustHaveKey("lang");
        response().body().mustHaveKey("status");
        response().body().mustHaveKey("messages");
        response().body().mustHaveKey("messagesLite");
        response().body().mustHaveKey("meta");
        response().body().mustHaveKey("requestTime");
        response().body().mustHaveKey("memoryPeak");
        response().body().mustHaveKey("memoryUsage");
    }

    @When("O usuario envia uma requisicao para o geo getstates {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetstatesURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo de resposta possui todos os estados {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaPossuiTodosOsEstados(int arg0) {
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg0);
        response().body().mustHaveString(hgGeoGetStatesPostResponse);
        response().body().mustHaveKey("payload");
        response().body().mustHaveKey("id");
        response().body().mustHaveKey("name");
        response().body().mustHaveKey("initials");
        response().body().mustHaveKey("status");
        response().body().mustHaveKey("messages");
        response().body().mustHaveKey("messagesLite");
        response().body().mustHaveKey("meta");
        response().body().mustHaveKey("requestTime");
        response().body().mustHaveKey("memoryPeak");
        response().body().mustHaveKey("memoryUsage");
    }


    @When("O usuario envia uma requisicao para o geo getcities {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetcitiesURIEndpointStateid(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);

        try {
            stateID = Integer.parseInt(arg2);
            body().put(new JSONObject(hgGeoGetCitiesPost.replace("arg0", arg2)));
        }catch (NumberFormatException e){
            if(arg2.equals("a")){
                body().put(new JSONObject(hgGeoGetCitiesPost.replace("arg0", "\""+arg2+"\"")));
            }else if (arg2.length()==0){
                body().put(new JSONObject(hgGeoGetCitiesPost.replace("arg0", "\"\"")));
            }else {
                body().put(new JSONObject(hgGeoGetCitiesPost.replace("arg0", arg2)));
            }
        }

        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o corpo de resposta possui todos as cidades {int}")
    public void oUsuarioValidaQueOCorpoDeRespostaPossuiTodosAsCidades(int arg0) {
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg0);
        String resp = "";
        switch (stateID) {
            case 1:
                resp = hgGeoGetCitiesPostResponseAcre;
                break;
        }
        response().body().mustHaveString(resp);
        response().body().mustHaveKey("payload");
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

    @When("O usuario envia uma requisicao para o geo getbyzip {string} {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetbyzipURIEndpointCountryidZipCode(String arg0, String arg1, String arg2, String arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        zipID = arg3;
        String jsonString = hgGeoGetByZipPost;
        if(arg2.equals("true")) {
            jsonString = jsonString.replace("arg0", arg2).replace("arg1", arg3);
        }else if(arg2.length()==0){
            jsonString = jsonString.replace("arg0", "\"\"").replace("arg1", arg3);
        }else{
            jsonString = jsonString.replace("\"arg0\"", arg2).replace("arg1", arg3);
        }
        JSONObject json = new JSONObject(jsonString);
        body().put(json);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getbyzip {string} {string} {int} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetbyzipURIEndpointCountryidZipCode(String arg0, String arg1, int arg2, String arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        headers().put("token",HgAuthLogin.tokenAuth);
        zipID = arg3;
        String jsonString = hgGeoGetByZipPost;
        if(!arg3.equals("true")) {
            jsonString = jsonString.replace("arg0", String.valueOf(arg2)).replace("arg1", arg3);
        }else {
            jsonString = jsonString.replace("arg0", String.valueOf(arg2)).replace("\"arg1\"", arg3);
        }
        JSONObject json = new JSONObject(jsonString);
        body().put(json);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida o corpo de resposta {int}")
    public void oUsuarioValidaOCorpoDeResposta(int arg0) {
        sdHgAuthLogin.oUsuarioValidaQueOStatusRecebidoE(arg0);
        switch (zipID){
            case "13.184-140":
                response().body().mustHaveString(hgGeoGetByZipPostResponse13184140);
                break;
        }
        response().body().mustHaveKey("payload");
        response().body().mustHaveKey("id");
        response().body().mustHaveKey("zip");
        response().body().mustHaveKey("address");
        response().body().mustHaveKey("town");
        response().body().mustHaveKey("city");
        response().body().mustHaveKey("name");
        response().body().mustHaveKey("status");
        response().body().mustHaveKey("messages");
        response().body().mustHaveKey("messagesLite");
        response().body().mustHaveKey("meta");
        response().body().mustHaveKey("requestTime");
        response().body().mustHaveKey("memoryPeak");
        response().body().mustHaveKey("memoryUsage");
    }

    @When("O usuario envia uma requisicao para o geo getcountries com o token de parter {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetcountriesComOTokenDeParterURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        body().put(new JSONObject(hgGeoGetCountriesPost));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getcountries sem token {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetcountriesSemTokenURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        body().put(new JSONObject(hgGeoGetCountriesPost));
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que a requisicao nao pode ser feita sem o token {int}")
    public void oUsuarioValidaQueATransacaoNaoPodeSerFeitaToken(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "O valor Token é obrigatório.");
    }

    @When("O usuario envia uma requisicao para o geo getstates com o token de parter {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetstatesComOTokenDeParterURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getstates sem token {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetstatesSemTokenURIEndpoint(String arg0, String arg1) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getcities com token partner {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetcitiesComTokenPartnerURIEndpointStateid(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        body().put(new JSONObject(hgGeoGetCitiesPost.replace("arg0", arg2)));
        stateID = Integer.parseInt(arg2);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getcities sem token {string} {string} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetcitiesSemTokenURIEndpointStateid(String arg0, String arg1, String arg2) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        body().put(new JSONObject(hgGeoGetCitiesPost.replace("arg0", arg2)));
        stateID = Integer.parseInt(arg2);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getbyzip com token partner {string} {string} {int} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetbyzipComTokenPartnerURIEndpointCountryidZipCode(String arg0, String arg1, int arg2, String arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        sdHgPartnerLogin.oUsuarioUtilizaOTokenJaCapturado();
        zipID = arg3;
        String jsonString = hgGeoGetByZipPost;
        jsonString = jsonString.replace("arg0", String.valueOf(arg2)).replace("arg1", arg3);
        JSONObject json = new JSONObject(jsonString);
        body().put(json);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @When("O usuario envia uma requisicao para o geo getbyzip sem token {string} {string} {int} {string}")
    public void oUsuarioEnviaUmaRequisicaoParaOGeoGetbyzipSemTokenURIEndpointCountryidZipCode(String arg0, String arg1, int arg2, String arg3) {
        sdHgAuthLogin.oUsuarioConstroeRequisicaoParaAURIURI(arg0);
        sdHgAuthLogin.oEndpointAuthAuth(arg1);
        sdHgAuthLogin.oUsuarioDefineOTipoDeRequestComoPOST();
        zipID = arg3;
        String jsonString = hgGeoGetByZipPost;
        jsonString = jsonString.replace("arg0", String.valueOf(arg2)).replace("arg1", arg3);
        JSONObject json = new JSONObject(jsonString);
        body().put(json);
        sdHgAuthLogin.oUsuarioDisparaARequest();
    }

    @Then("O usuario valida que o endpoint retornou vazio {int}")
    public void oUsuarioValidaQueOEndpointRetornouVazio(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("payload", "[]");
    }

    @Then("O usuario valida a mensagem de erro de stateId nao pode ser vazio {int}")
    public void oUsuarioValidaAMensagemDeErroDeStateIdNaoPodeSerVazio(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "O valor stateId não pode ser vazio.");
    }

    @Then("O usuario valida que o cep nao foi encontrado {int}")
    public void oUsuarioValidaQueOCepNaoFoiEncontrado(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "Cep não encontrado.");
    }

    @Then("O usuario valida a mensagem de erro de Cep nao pode ser vazio {int}")
    public void oUsuarioValidaAMensagemDeErroDeCepNaoPodeSerVazio(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "O valor CEP não pode ser vazio.");
    }

    @Then("O usuario valida a mensagem de erro de countryId nao pode ser vazio {int}")
    public void oUsuarioValidaAMensagemDeErroDeCountryIdNaoPodeSerVazio(int arg0) {
        response().status().mustBe(arg0);
        response().body().mustHaveKeyAndValue("error_message", "O valor ID do País não pode ser vazio.");
    }
}
