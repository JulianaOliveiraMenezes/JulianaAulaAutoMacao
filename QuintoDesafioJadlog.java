package io.exemplo.automacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuintoDesafioJadlog {
    private WebDriver webDriver;

    public void QuintoDesafioReserva(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public QuintoDesafioJadlog(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public QuintoDesafioJadlog acessarAulaquatro() {
        webDriver.get("https://jadlog.com.br/jadlog/simulacao");
        return this;
    }

    public QuintoDesafioJadlog informarCEP(){
        webDriver.findElement(By.cssSelector("#origem")).sendKeys("04069-000");
        webDriver.findElement(By.cssSelector("#destino")).sendKeys("05870-030");
        webDriver.findElement(By.cssSelector("div:nth-child(4) > div:nth-child(4) > div > input")).click();
        new Actions(webDriver).pause(Duration.ofSeconds(5)).perform();
        return this;
    }
    public QuintoDesafioJadlog validarVFrete(){
        String Frete = webDriver.findElement(By.cssSelector("#j_idt45_content > span")).getText();
        assertEquals("R$ 36,31", Frete, "Valor do frete");
        return this;
    }
}







