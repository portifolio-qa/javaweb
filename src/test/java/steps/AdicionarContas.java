package steps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
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

@Quando("clico em {string}")
public void clicoEm(String acao) {
	adicionarContasPage = new AdicionarContasPage(navegador);
}

@Quando("preenche dados")
public void dadosConta() {

}

@Quando("preencho <email> & {word} & {word} & {word}")
public void preenchoDadosCadastro(String nome, String senha, String confirmaSenha) {
}

@Quando("Toggle Habilitado")
public void idToggle() {

}

@Quando("a opção de conta com saldo está habilitada")
public void toggleHabilitado() {
}

@Quando("clica no botão Cadastrar")
public void botaoCadastrar() {

}

@Quando("clica no botão {string}")
public void clicaNoBotao(String botao) {
}

@Entao("Msg A conta foi criada com sucesso")
public void msgSucesso() {
	
	}

@Entao("deve visualizar a mensagem {string}")
public void deveVisualizarMensagem(String mensagem) {
	
}

}