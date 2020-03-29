package com.example.heitorcolangelo.espressotests.EspressoVersao2;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import com.example.heitorcolangelo.espressotests.EspressoVersao2.robot.RobotVersao2;
import com.example.heitorcolangelo.espressotests.mocks.Mocks;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;
import com.example.heitorcolangelo.espressotests.util.MockJava;
import org.junit.Rule;
import org.junit.Test;
import okhttp3.mockwebserver.MockResponse;

public class CasoDeTesteVersao2 extends MockJava {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void TesteNumero1(){
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .verificarTituloDaTela()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarBotaoLogin()
                .verificarImagem();
    }

    @Test
    public void TesteNumero2(){
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .clicarNoLogin()
                .verificarPopup();
    }

    @Test
    public void TesteNumero3(){
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .EscreverEmail()
                .clicarNoLogin()
                .verificarPopup();
    }

    @Test
    public void TesteNumero4(){
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .EscreverSenha()
                .clicarNoLogin()
                .verificarPopup();
    }

    @Test
    public void TesteNumero5(){
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoLogin()
                .clicarEmVoltar()
                .verificarTituloDaTela();
    }

    @Test
    public void TesteNumero6(){
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoLogin()
                .clicarEmVoltar()
                .verificarTituloDaTela()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarBotaoLogin()
                .verificarImagem();
    }

    @Test
    public void TesteNumero7() throws InterruptedException{
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoLogin()
                .sleep(5)
                .ScrolarParaBaixo()
                .sleep(5);
    }

    @Test
    public void TesteNumero8() throws InterruptedException{
        server.enqueue(new MockResponse().setResponseCode(200).setBody(Mocks.SUCESSO));
        mActivityRule.launchActivity(new Intent());
        new RobotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoLogin()
                .ClicarCard2()
                .sleep(5);
    }
}
