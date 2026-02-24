package steps;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

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

	@Dado("a conta criada para o dono (.*) de numero (.*) com o saldo (.*)")
	public void aContaCriadaParaODono(String dono, String numero, Integer saldo) {
		saldos.put(dono.toLowerCase(), saldo);
	}

	@Quando("o Conta1 realiza a transfêrencia no valor de (.*) na Conta2")
	public void realizaTransferencia(Integer transferencia) {
		Integer saldoConta1 = saldos.getOrDefault("conta1", 0);
		Integer saldoConta2 = saldos.getOrDefault("conta2", 0);
		saldos.put("conta1", saldoConta1 - transferencia);
		saldos.put("conta2", saldoConta2 + transferencia);
	}

	@Entao("o Conta2 tem o saldo no valor de (.*) na conta")
	public void validaSaldo(Integer saldoEsperado) {
		Integer saldoConta1 = saldos.getOrDefault("conta1", 0);
		Integer saldoConta2 = saldos.getOrDefault("conta2", 0);
		saldoConta1.equals(saldoEsperado);
		saldoConta2.equals(saldoEsperado);
	}
}
