package operacoesBasicas;
 
public class Item {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", quantidada=" + quantidade + "]";
	}
	
	

	

}
