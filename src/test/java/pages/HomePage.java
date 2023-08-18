package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver navegador) {
		super(navegador);
	}
	
	public String mensagemHome() {
		String mensagemHome = navegador.findElement(By.xpath("//div#__next")).getText();
		
		return mensagemHome;
	}
	
	public AdicionarContasPage acessarHome() {
		navegador.findElement(By.linkText("Registrar")).click();
		navegador.findElement(By.linkText("Cadastrar")).click();
		
		return new AdicionarContasPage(navegador);
	}

}
