package com.vrb.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import java.net.MalformedURLException;

public class FeatureCadastro {

    @Test
    public void nao_pode_cadastrar_usuario_com_senhas_que_nao_conferem() throws MalformedURLException {

        // driver com todas as configurações necessárias
        AppiumDriverConfig driver = new AppiumDriverConfig();

        // Procurando o botão cadastro
        MobileElement botaoCadastro = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/login_botao_cadastrar_usuario");

        botaoCadastro.click(); //clicando no botão

        // Procurando os campos nome, senha e confirmar senha na tela
        MobileElement campoNome = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/input_nome");
        MobileElement campoSenha = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/input_confirmar_senha");

        // Fazendo o set dos valores nos campos
        campoNome.setValue("Bugan");
        campoSenha.setValue("123");
        campoConfirmarSenha.setValue("456");

        // Procurando o botão confirmar cadastro
        MobileElement botaoConfirmarCadastro = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/cadastrao_usuario");
        botaoConfirmarCadastro.click(); // clicando no botão

        // Procurando o elemento que deve conter a mensagem de erro
        MobileElement erro = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/erro_cadastrao");

        // Fazendo a assertion
        Assert.assertEquals("Senhas não conferem", erro.getText());

    }

    @Test
    public void cadastrar_usuario_com_senhas_que_conferem() throws NoSuchElementException, MalformedURLException {

        AppiumDriverConfig driver = new AppiumDriverConfig();
        MobileElement botaoCadastro = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        MobileElement campoNome = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/input_nome");
        MobileElement campoSenha = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/input_confirmar_senha");
        campoNome.setValue("Teste");
        campoSenha.setValue("582");
        campoConfirmarSenha.setValue("582");
        MobileElement botaoConfirmarCadastro = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/cadastrao_usuario");
        botaoConfirmarCadastro.click();

        // Procurando o botão cadastro
        MobileElement botaoLogar = (MobileElement)driver.driver.findElementById("br.com.vrb.aluraesporte:id/login_botao_logar");

    }
}