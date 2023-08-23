package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlar entrada de pessoal");
	}
	private void controlarSaida() {
		System.out.println("Controlar saída de pessoal");
	}	
	void entregarIngrediente() {
		System.out.println("Entregando ingredientes");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("Almoxarife trocando o gás");
	}




}
