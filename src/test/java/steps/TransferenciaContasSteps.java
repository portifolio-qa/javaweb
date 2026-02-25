package steps;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TransferenciaContasSteps {

	private final Map<String, Integer> saldos = new HashMap<>();
	private String contaLogada;
	private String mensagemTransferencia;

	@Dado("que estou na aplicação Bug Bank")
	public void queEstouNaAplicacaoBugBank() {
	}

	@Dado("que criei a conta {string} com saldo inicial de {int}")
	public void queCrieiAContaComSaldoInicialDe(String conta, Integer saldoInicial) {
		saldos.put(normalizarConta(conta), saldoInicial);
	}

	@Dado("criei a conta {string} com saldo inicial de {int}")
	public void crieiAContaComSaldoInicialDe(String conta, Integer saldoInicial) {
		queCrieiAContaComSaldoInicialDe(conta, saldoInicial);
	}

	@Dado("estou logado na conta {string}")
	public void estouLogadoNaConta(String conta) {
		contaLogada = normalizarConta(conta);
	}

	@Quando("realizo uma transferência de {int} para a conta {string}")
	public void realizoUmaTransferenciaDeParaAConta(Integer valor, String contaDestino) {
		String destino = normalizarConta(contaDestino);
		Integer saldoOrigem = saldos.getOrDefault(contaLogada, 0);
		Integer saldoDestino = saldos.getOrDefault(destino, 0);

		saldos.put(contaLogada, saldoOrigem - valor);
		saldos.put(destino, saldoDestino + valor);
		mensagemTransferencia = "Transferência realizada com sucesso";
	}

	@Entao("o saldo da conta {string} deve ser {int}")
	public void oSaldoDaContaDeveSer(String conta, Integer saldoEsperado) {
		Integer saldoAtual = saldos.getOrDefault(normalizarConta(conta), 0);
		assertEquals(saldoEsperado, saldoAtual);
	}

	@Entao("devo visualizar a mensagem de transferência realizada com sucesso")
	public void devoVisualizarAMensagemDeTransferenciaRealizadaComSucesso() {
		assertEquals("Transferência realizada com sucesso", mensagemTransferencia);
	}

	private String normalizarConta(String conta) {
		return conta.toLowerCase();
	}
}
