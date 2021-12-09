package io.exemplo.automacao.tests;
import io.exemplo.automacao.Pages.QuintoDesafioJadlog;
import io.exemplo.automacao.Pages.QuintoDesafioReserva;
import io.exemplo.automacao.extensions.WebDriverExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;


@ExtendWith(WebDriverExtension.class)

public class DesafioAula4 {

    @Test
    public void Desafio01(WebDriver webDriver){
        new QuintoDesafioReserva(webDriver)
                .acessarAulaquatro()
                .selecionarTamanho()
                .informarCEP()
                .validarVFrete();
    }

    @Test
    public void Desafio02(WebDriver webDriver){
        new QuintoDesafioJadlog(webDriver)
                .acessarAulaquatro()
                .informarCEP()
                .validarVFrete();

           }
}

