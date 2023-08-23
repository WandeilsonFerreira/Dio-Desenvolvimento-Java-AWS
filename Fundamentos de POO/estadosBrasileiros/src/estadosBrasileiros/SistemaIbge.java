package estadosBrasileiros;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
				System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());			
		}
		
		EstadosBrasileiros eb = EstadosBrasileiros.CEARA;
		System.out.println(eb);
	}
}
