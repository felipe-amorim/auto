package com.autoavaliar.products.aplicativo_android.stepdefs;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidLogin;
import com.autoavaliar.products.apps.stepdefs.SDAppsLogin;
import com.autoavaliar.support.CoreAndroid;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Test;

import static com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidSolicitacao.*;
import static com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidSolicitacao.aplicativoAndroidMenuPrincipal;


public class SDAplicativoAndroidLogin extends CoreAndroid {

    @Given("O usuario abre o aplicativo com o dispositivo {string} e versao do OS {string}")
    public void oUsuarioAbreOAplicativoComODispositivoEVersaoDoOS(String arg0, String arg1) {
        //Instances.commandExMac("adb -s RQ8N805B8YB uninstall io.appium.settings");
        //Instances.commandExMac("adb -s RQ8N805B8YB uninstall io.appium.unlock");
        //Instances.commandExMac("adb -s RQ8N805B8YB uninstall io.appium.uiautomator2");
        //Instances.commandExMac("adb -s RQ8N805B8YB uninstall io.appium.uiautomator2.server.test");
        androidDriver().capabilities().set()
                .appActivity("br.com.autoavaliar.presentation.splash.view.SplashActivity")
                .appPackage("com.autoaction.app")
                .deviceName(arg0)
                .platformName("android")
                .platformVersion(arg1)
                .skipUnlock("true")

                .udid("RQ8N805B8YB").load();
        evidence("Abrindo o device: '"+arg0+"' com o android '"+arg1+"'");
    }

    @When("O usuario acessa o menu brasil")
    public void oUsuarioAcessaOMenuBrasil() {
        sleep().setMaxTime(20000);
        log().setLocator(AplicativoAndroidLogin.aplicativoAndroidLogin);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginBrasilButton).click();
    }

    @And("O usuario preenche o campo email como timeqa")
    public void oUsuarioPreencheOCampoEmailComoTimeqa() {
        log().setLocator(AplicativoAndroidLogin.aplicativoAndroidLogin);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginEmailInput).send().text(AplicativoAndroidLogin.aplicativoAndroidEmailPadrao);
        //find(AplicativoAndroidLogin.aplicativoAndroidLoginEmailInput).send().text("arnaldo.wiziack2@autoavaliar.com.br");
    }

    @And("O usuario preenche o campo senha com a senha padrao")
    public void oUsuarioPreencheOCampoSenhaComASenhaPadrao() {
        log().setLocator(AplicativoAndroidLogin.aplicativoAndroidLogin);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginSenhaInput).send().text(AplicativoAndroidLogin.aplicativoAndroidSenhaPadrao);
        //find(AplicativoAndroidLogin.aplicativoAndroidLoginSenhaInput).send().text("aw203040");
    }

    @And("O usuario clica em entrar")
    public void oUsuarioClicaEmEntrar() {
        log().setLocator(AplicativoAndroidLogin.aplicativoAndroidLogin);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginEntrar).click();
    }

    @And("O usuario preenche o campo email como {string} do grupo {string}")
    public void oUsuarioPreencheOCampoEmailComoTipoLoginDoGrupoGrupo(String arg0, String arg1) {
        String email = SDAppsLogin.getUsuario(arg0, arg1);
        log().setLocator(AplicativoAndroidLogin.aplicativoAndroidLogin);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginEmailInput).send().text(email);
    }

    @Given("O usuario abre o aplicativo como {string} {string}")
    public void oUsuarioAbreOAplicativoComo(String arg0, String arg1) {
        oUsuarioAbreOAplicativoComODispositivoEVersaoDoOS("device ", "10");
        oUsuarioAcessaOMenuBrasil();
        find(AplicativoAndroidLogin.aplicativoAndroidLoginEmailInput).send().text(arg0);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginSenhaInput).send().text(arg1);
        oUsuarioClicaEmEntrar();
        find(aplicativoAndroidMenuPrincipal).click();
        find(aplicativoAndroidMenuPrincipalConfiguracoes).click();
        find(aplicativoAndroidSwitchCameraCustomizada).click();
        find(aplicativoAndroidMenuPrincipal).click();
        find(aplicativoAndroidMenuPrincipalAvaliacoes).click();
    }
}
