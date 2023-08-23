package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
			System.out.println("Adicionar Lanche natural ");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionar suco natural ");
}	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao(); 
}
	public void prepararLanche() {
		System.out.println("Preparar lanche tipo 01");
}
	
	public void prepararVitamina() {
		System.out.println("Preparar Vitamina");		
}

	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
}
	private void selecionarIngredientesLanch() {
		System.out.println("Selecionar o pão, salada especial");
}	
	public void selecionarIngredientesVitamina() {
		System.out.println("Selecionar frutas");
}
	private void lavarIngrediente() {
		System.out.println("Lavando ingrediente");
}
	private void baterVitamina() {
		System.out.println("Batendo vitamina");
}
	private void fritarIngredienteLanche() {
		System.out.println("Fritando ingrediente");
}
	/*public void pedirParaTrocarGas(Atendente meuAmigo) {	
		meuAmigo.trocarGas();
}*/
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {	
		meuAmigo.trocarGas();
}
	private void pedirIngredientes(Almoxarife almoxarife) {	
		almoxarife.entregarIngrediente();
}




}
