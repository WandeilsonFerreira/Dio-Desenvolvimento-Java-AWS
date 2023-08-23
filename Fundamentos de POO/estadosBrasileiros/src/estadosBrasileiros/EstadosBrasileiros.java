package estadosBrasileiros;

public enum EstadosBrasileiros {
	SAO_PAULO("SP", "São Paulo", 1),
	RIO_JANEIRO("RJ","Rio de Janeiro", 2),
	PIAUI("PI","Piaui", 3 ),
	MARANHAO("MA","Maranhão", 4),
	CEARA("CE", "Ceará", 5);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadosBrasileiros(String nome, String sigla, int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	public int getIbge() {
		return ibge;
	}

	public String getNome() {
		return nome;
	}	 

	public String getSigla() {
		return sigla;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	

}
