package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompras {
	private List<Item> itemList;

	public CarinhoDeCompras() {		
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemList.add(item);
		}	
	public void removerItem(String nome) {
		List<Item>itensParaRemover = new ArrayList<>();
		if(!itemList.isEmpty()) {
			for(Item i : itemList) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);			
				}
			}
			itemList.removeAll(itensParaRemover);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		if(!itemList.isEmpty()) {
			for (Item item : itemList) {
				double valorItem = item.getPreco() + item.getQuantidade();
				valorTotal += valorItem;				
			}
			return valorTotal;
			
		} else {
			throw new RuntimeException("A lista está vazia");
			
		}
	}
	
	public void exibirItens() {
		if (!itemList.isEmpty()) {
			System.out.println(this.itemList);
		} else {
			System.out.println("A lista está vazia");
		}
	}
	
	public int obterNumeroItens() {
		return itemList.size();
	}
	
	public void obterDescricaoCarinho() {
		System.out.println(itemList);
	}
	
	public static void main(String[] args) {
		CarinhoDeCompras carinho = new CarinhoDeCompras();
		
		carinho.adicionarItem("Banana", 200, 3);
		carinho.adicionarItem("Café", 3.45, 1);
		carinho.adicionarItem("Sopa", 1200, 9);
		carinho.adicionarItem("Pão", 2200, 71);
		carinho.removerItem("teste");
		
		
		System.out.println("----------------------");
		System.out.println("O número total de tarefas é de: " + carinho.obterNumeroItens());		 
		System.out.println("----------------------");
		carinho.exibirItens();
		System.out.println("O valor total do carinho é de R$ "+ carinho.calcularValorTotal() + "reais");
		
	
	}
}
