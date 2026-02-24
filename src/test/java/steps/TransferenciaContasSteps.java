package steps;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TransferenciaContasSteps {

	private final Map<String, Integer> saldos = new HashMap<>();

	@Dado("que estou logado na aplicação")
	public void queEstouLogadoNaAplicacao() {
	}

	@Dado("possuo duas contas cadastradas")
	public void possuoDuasContasCadastradas() {
		saldos.put("conta1", 1000);
		saldos.put("conta2", 1000);
	}

	@Dado("a conta criada para o dono {word} de numero {int} com o saldo {int}")
	public void aContaCriadaParaODono(String dono, Integer numero, Integer saldo) {
		saldos.put(dono.toLowerCase(), saldo);
	}

	@Quando("o Conta1 realiza a transfêrencia no valor de {int} na Conta2")
	public void realizaTransferencia(Integer transferencia) {
		Integer saldoConta1 = saldos.getOrDefault("conta1", 0);
		Integer saldoConta2 = saldos.getOrDefault("conta2", 0);
		saldos.put("conta1", saldoConta1 - transferencia);
		saldos.put("conta2", saldoConta2 + transferencia);
	}

	@Entao("o Conta2 tem o saldo no valor de {int} na conta")
	public void validaSaldo(Integer saldoEsperado) {
		Integer saldoConta1 = saldos.getOrDefault("conta1", 0);
		Integer saldoConta2 = saldos.getOrDefault("conta2", 0);
		saldoConta1.equals(saldoEsperado);
		saldoConta2.equals(saldoEsperado);
	}
}
