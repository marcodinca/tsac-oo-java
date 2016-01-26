package harbour.game;

public class PortoNavale {
	private String nome;
	private int mq;
	private int nImbarcazioni;
	
	public PortoNavale(String n, int m, int imbarcazioni) {
		this.nome = n;
		this.mq = m;
		this.nImbarcazioni = imbarcazioni;
	}
	
	public boolean isAlive() {
		return mq > 0;
	}
	
	public void setDanno(double d) {
		this.mq -= d;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMq() {
		return mq;
	}
	public void setMq(int mq) {
		this.mq = mq;
	}
	public int getnImbarcazioni() {
		return nImbarcazioni;
	}
	public void setnImbarcazioni(int nImbarcazioni) {
		this.nImbarcazioni = nImbarcazioni;
	}
	
	
}
