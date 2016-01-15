package Azienda;

public class Dipendente {
    public String nome;
    public String cognome;
    public int anzianita;
    Contratto contratto;
    
    public Dipendente(String nome, String cognome, int anzianita, Contratto contratto) {
        this.nome = nome;
        this.cognome = cognome;
        this.anzianita = anzianita;
        this.contratto = contratto;
    }
    public double getPaga() {
        return contratto.paga+((contratto.paga/100)*(0.5*anzianita));
    }
}
