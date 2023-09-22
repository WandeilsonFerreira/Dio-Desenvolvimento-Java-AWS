package aparelho.telefone;

public class Telefone implements Aparelho{

	@Override
	public void ligar() {
		System.out.println("Ligar");
		
	}

	@Override
	public void atender() {
		System.out.println("Atender telefone");
		
	}

	@Override
	public void chamada() {
		System.out.println("Realizar chamada");
		
	}

}
