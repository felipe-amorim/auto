package com.autoavaliar.products.aplicativo_android.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/products/",
        glue={"com.autoavaliar.products"},
        plugin = { "com.autoavaliar.intern.plugin.ListCucumber" }
        ,tags = {"@NovaSolicitacaoAndroid", "@ComCamposObrigatoriosAndroidOutLine", "@Carro"}

)

public class Run{
}
