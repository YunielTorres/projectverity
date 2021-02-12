package br.com.verity.step;

import br.com.verity.page.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

import static br.com.verity.utils.Driver.*;

public class PaginaHome {

    HomePage home = new HomePage();

    @Before
    public  void iniciarDriver(){
        getCurrentDriver();
    }
//    @After
//    public void killDriver(){
//        close();
//    }

    @Dado("que esteja acessando a pagina {string}")
    public void que_esteja_acessando_a_pagina(String page) {
    loadPage(page);
    }

    @E("realiza a validacao dos titulos {string}")
    public void realizaAValidacaoDosTitulos(String titulo) {
    home.encontrarViaTextoPath(titulo);
    }

    @E("realiza a validacao do titulo {string}")
    public void realizaAValidacaoDoTitulo(String titulo) {
    home.encontrarViaTituloXpath(titulo);
    }

    @E("verifica o titulo {string}")
    public void verificaOTitulo(String titulo) {
    home.encontrarViaXpath(titulo);
    }

    @E("clica no menu {string}")
    public void clicoNoClicoNoMenu(String titulo) {
    home.clicarViaXpathTitulo(titulo);
    }

    @E("preenche o campo {string} com {string}")
    public void preencheOCampoCom(String campo, String valor) {
    home.preenchercampos(campo, valor);
    }

    @E("clica no checkBox")
    public void clicaNoCheckBox() {
    home.clicarCkeckBoxViaJsXpath();
    }

    @E("clico no botao Participar")
    public void clicoNoBotaoParticipar() {
    home.clicarBotaoViaJsXpath();
    }
}
