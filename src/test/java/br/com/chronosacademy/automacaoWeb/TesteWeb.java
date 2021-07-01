package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //maximiza a tela do navegador

        driver.get("https://www.chronosacademy.com.br/");// colocou o endereço
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";// colocou o caminho
        WebElement h4titulo = driver.findElement(By.xpath(xpathTitulo));
        String Titulo = h4titulo.getText();

        assertEquals("Porque Tempo É Conhecimento", Titulo);
        driver.quit();

    }
}
