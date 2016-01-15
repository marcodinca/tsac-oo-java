package Alieni;

public class Gioco {
    
    public static Giocatore player;
    
    public static void faiDanno(Alieno[] attaccanti) {
        for(Alieno a: attaccanti) {
            player.salute -= a.danno;
        }
    }
    public static boolean checkGiocatoreVivo() {
        return player.salute > 0;
    }
    
    public static void main(String[] args) {
        player = new Giocatore("Marco");
        Alieno[] nemici = {new Alieno("Mr.X",20), new Alieno("I compiti",50)};
        faiDanno(nemici);
        System.out.println( checkGiocatoreVivo() );
        faiDanno(nemici);
        System.out.println( checkGiocatoreVivo() );
    } 
}
