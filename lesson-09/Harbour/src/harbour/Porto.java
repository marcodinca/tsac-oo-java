package harbour;

public class Porto {

	private String nome;
	private int nImbarcazioni;
	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnImbarcazioni() {
		return nImbarcazioni;
	}

	public void setnImbarcazioni(int nImbarcazioni) {
		this.nImbarcazioni = nImbarcazioni;
	}

	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}

	public void setDimensioneSqMeters(double dimensione) {
		this.dimensioneSqMeters = dimensione;
		this.dimensioneSqMetersNonDistrutta = dimensione;
	}
	
	public void addMetriQuadriDistrutti(double dimensione) {
		dimensioneSqMetersNonDistrutta = 
				Math.max(dimensioneSqMetersNonDistrutta - dimensione, 0);
	}
	
	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}
	
}
