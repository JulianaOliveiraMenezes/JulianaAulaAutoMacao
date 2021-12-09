package io.exemplo.automacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QuintoDesafioReserva {

    private WebDriver webDriver;

    public QuintoDesafioReserva(WebDriver webDriver){
    this.webDriver = webDriver;
        }
        public QuintoDesafioReserva acessarAulaquatro(){
            webDriver.get("https://www.lojareversa.com.br/bermuda-de-sarja-masculina-slim-preta-puidos/");
                    return this;
        }
     public QuintoDesafioReserva selecionarTamanho(){
         webDriver.findElement((By.cssSelector("#swatch42 > svg"))).click();
        return this;
     }

    public QuintoDesafioReserva informarCEP(){

        webDriver.findElement(By.cssSelector("#simuladorCase")).click();
        webDriver.findElement(By.cssSelector("#estimate_postcode")).sendKeys("04069-000");
        new Actions(webDriver).pause(Duration.ofSeconds(4)).perform();
        webDriver.findElement(By.cssSelector("div.frete__actions")).click();
        return this;
    }

    public QuintoDesafioReserva validarVFrete(){

        String ValorFrete =  webDriver.findElement(By.cssSelector("#frete__results > dl > dd > ul > li.akhilleus_MDE_RAP > span.price")).getText();
        assertEquals("R$8,70", ValorFrete);
        new Actions(webDriver).pause(Duration.ofSeconds(5)).perform();
        return this;
    }
}
