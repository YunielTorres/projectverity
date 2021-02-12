package br.com.verity.page;

import br.com.verity.utils.PageBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public void encontrarViaTextoPath(String titulo){
        Assert.assertTrue(elementoEnabledViaTextoByXpath(titulo));
    }

    public void encontrarViaTituloXpath(String titulo){
        WebElement element = elementoViaByXpath(".//*[@style='color:#E6427A']//*[contains(text(),'"+titulo+"')]");
        Assert.assertTrue(element.isEnabled());
    }

    public void encontrarViaXpath(String titulo) {
        String title = elementoViaByXpath(".//*[@style='font-size:24px']").getText();
        Assert.assertEquals(titulo,title);
    }
    public void clicarViaXpathTitulo(String titulo) {
        WebElement element = elementoViaByXpath("//*[@class='color_11']//*[contains(text(),'"+titulo+"')]");
        element.click();
    }

    public void preenchercampos(String campo, String valor){

        if(campo.equals("Nome completo")){
            elementoViaByXpath(".//*[@name='nome-completo']").sendKeys(valor);
        }else if(campo.equals("Empresa")){
            elementoViaByXpath(".//*[@name='empresa']").sendKeys(valor);
        }else if(campo.equals("E-mail")){
            elementoViaByXpath(".//*[@name='e-mail']").sendKeys(valor);
        }else if(campo.equals("Telefone")){
            elementoViaByXpath(".//*[@name='telefone']").sendKeys(valor);
        }
        System.out.println("System Error");
    }
    public void clicarCkeckBoxViaJsXpath(){
        clicarViaJSXpath(".//*[@type='checkbox']");
    }

    public void clicarBotaoViaJsXpath(){
        clicarViaJSXpath(".//*[@data-testid='buttonElement']");
    }
}
