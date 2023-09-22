package aparelho.musica;

public class Play implements TocarMusica{

	@Override
	public void reproduzir() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void tocar() {
		System.out.println("Parar música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar música");
		
	}

}
