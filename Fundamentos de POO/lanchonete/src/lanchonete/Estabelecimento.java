package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();		
		cozinheiro.prepararVitamina();
		
		// Ações que o cozinheiro precisa ter ciencia 
		cozinheiro.adicionarComboNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarSucoNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//Ações que nao precisam estar disponíveis	 
		//Ações apenas do pacote cozinha
		
		
		Atendente atendente = new Atendente();		 
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		//atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazendoPedido();
		cliente.pagarConta(); 
		
		
	}

}
