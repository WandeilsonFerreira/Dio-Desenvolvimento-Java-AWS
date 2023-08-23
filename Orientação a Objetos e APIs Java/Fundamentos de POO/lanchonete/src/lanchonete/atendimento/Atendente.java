package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheNaCozinha();
		System.out.println("Servindo mesa");
	}
	private void pegarLancheNaCozinha() {
		System.out.println("Pegando o lanche na cozinha");
	}
	public void receberPagamento() {
		System.out.println("Recebendo pagamento");
	}
	void trocarGas() {
		System.out.println("Atendente trocando o gás");
	}
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcao");
	}

}
