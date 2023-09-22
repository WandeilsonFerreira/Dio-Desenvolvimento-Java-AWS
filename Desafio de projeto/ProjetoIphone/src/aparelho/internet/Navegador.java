package aparelho.internet;

public class Navegador implements NavegarInternet {

	@Override
	public void pagina() {
		System.out.println("Abrir página");
		
	}

	@Override
	public void addNovaPagina() {
		System.out.println("Adicionar nova página");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página");
		
	}
	

}
