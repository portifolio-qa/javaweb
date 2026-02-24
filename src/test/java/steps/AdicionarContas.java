package steps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.AdicionarContasPage;
import pages.HomePage;
import runner.RunCucumberTest;

public class AdicionarContas extends RunCucumberTest {	
	
	private WebDriver navegador;	
	AdicionarContasPage adicionarContasPage;
	HomePage homePage;
		
@Test
@DisplayName("Home")
@Dado("que acesso o sistema")
public void Home() {
	
	adicionarContasPage = new AdicionarContasPage(navegador);
}	


@Quando("clico em Registrar")
public void botaoRegistrar() {
	
	adicionarContasPage = new AdicionarContasPage(navegador);

}

@Quando("preenche dados")
public void dadosConta() {

}

@Quando("Toggle Habilitado")
public void idToggle() {

}

@Quando("clica no botão Cadastrar")
public void botaoCadastrar() {

}

@Entao("Msg A conta foi criada com sucesso")
public void msgSucesso() {
	
	}

}