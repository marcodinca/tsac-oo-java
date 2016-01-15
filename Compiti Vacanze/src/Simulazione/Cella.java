package Simulazione;
public class Cella {
    public char occupante;
    public Cella() {
        occupante = '.';
    }
    public boolean isEmpty() {
        return occupante == '.';
    }
}
