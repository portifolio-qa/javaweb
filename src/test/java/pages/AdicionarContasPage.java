package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarContasPage extends BasePage {



public AdicionarContasPage(WebDriver navegador) {
		super(navegador);
		
	}


public AdicionarContasPage dadosConta (String conta) {
	navegador.findElement(By.id("email")).sendKeys("conta1@gmail.com");
	navegador.findElement(By.id("name")).sendKeys("conta1");
	navegador.findElement(By.id("password")).sendKeys("teste123");
	navegador.findElement(By.id("passwordConfirmation")).sendKeys("teste123");
	navegador.findElement(By.id("toggleBalance")).click();
	navegador.findElement(By.xpath("//div[@id='__next']/div/div[3]/div/div[2], 'Cadastrar')]")).click();
	navegador.findElement(By.id("tnCloseModal")).click();
	return this;
	}
}