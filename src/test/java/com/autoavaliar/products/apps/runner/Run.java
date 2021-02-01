package com.autoavaliar.products.apps.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/products/",
        glue={"com.autoavaliar.products"},
        monochrome = true,
        plugin = { "com.autoavaliar.intern.plugin.ListCucumber" },
        //tags = {"@NovaSolicitacaoUsbiAndroid", "@ComCamposObrigatoriosAndroidOutLine", "@Carro"}
        //tags = {"@NovaSolicitacaoUsbiAndroid", "@ComCamposObrigatoriosAndroidOutLine", "@Carro, @Moto, @Caminhao"}
        //tags = {"@NovaSolicitacaoAndroid", "@ComCamposObrigatoriosAndroidOutLine", "@Carro, @Moto, @Caminhao"}
        tags = {"@NovaSolicitacaoUsbiAndroid", "@ComCamposObrigatoriosAndroidOutLine", "@Caminhao"}
)
public class Run {
}
