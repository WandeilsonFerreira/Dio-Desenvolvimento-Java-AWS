package pessoa;

public class SistemaCadastro {
	public static void main (String[] args) {
		Pessoa marcos = new Pessoa("Marcos","135");
		
		marcos.setEndereco("Rua dos Anzois");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}

}
