package com.autoavaliar.products.apps.stepdefs.portal.tabela_autoavaliar;

import com.autoavaliar.support.CoreScreen;
import com.autoavaliar.support.tbi.JRobot;
import cucumber.api.java.en.Given;

import static com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarRandom.*;

public class SDTabelaAutoAvaliarRandomScreen extends CoreScreen {
    int getRandAmout(){
        return convert().getRandomNumber(450,1500);
    }

    void possibleMistake(){
        int chance = convert().getRandomNumber(1,4);
        if(chance==1) {
            JRobot.shiftTab();
            sleep().until(getRandAmout());
            JRobot.tab();
            sleep().until(getRandAmout());
        }
    }


    @Given("O usuario valida que a pagina carregou")
    public void oUsuarioValidaQueAPaginaCarregou() {
        find(TABELA_AUTO_AVALIAR_LOGIN).precision(0.5f).move();
    }

    @Given("O usuario clica em tabela auto avaliar via reconhecimento de tela")
    public void oUsuarioClicaEmTabelaAutoAvaliarViaReconhecimentoDeTela() {
        find(TABELA_AUTO_AVALIAR_LOGIN).click();
        //sleep().until(getRandAmout());
        for (int i = 19; i > 0; i --){
            //JRobot.shiftTab();
            send().tab();
            possibleMistake();
            System.out.println("oiIII "+i);
            sleep().until(getRandAmout());
        }
        find(TABELA_AUTO_AVALIAR_MARCA).click();
        sleep().until(getRandAmout());
        send().arrowDown();
        sleep().until(getRandAmout());
        send().arrowDown();
        sleep().until(getRandAmout());
        send().enter();
        sleep().until(getRandAmout());
        send().tab();
        sleep().until(getRandAmout());
        possibleMistake();
        send().arrowDown();
        sleep().until(getRandAmout());
        send().arrowDown();
        sleep().until(getRandAmout());
        send().enter();
        sleep().until(getRandAmout());
        send().tab();
        sleep().until(getRandAmout());
        possibleMistake();
        send().enter();
        sleep().until(getRandAmout());
        find(TABELA_AUTO_AVALIAR_ANO).click();
        sleep().until(getRandAmout());
        send().arrowDown();
        sleep().until(getRandAmout());
        send().arrowDown();
        sleep().until(getRandAmout());
        send().enter();
        sleep().until(getRandAmout());
        send().tab();
        sleep().until(getRandAmout());
        possibleMistake();
        send().arrowDown();
        sleep().until(getRandAmout());
        send().arrowDown();
        sleep().until(getRandAmout());
        send().enter();
        sleep().until(getRandAmout());
        sleep().until(getRandAmout());
        send().tab();
        possibleMistake();
        JRobot.space();
    }
}
