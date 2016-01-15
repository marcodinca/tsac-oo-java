package Simulazione;
import java.util.ArrayList;

public class Simulazione {
    
    public static Cella[][] campo;
    public static ArrayList predatori;
    public static ArrayList preda;
    public static int turniPassati = 0;
    
    public static void generaCampo(int nPredatori, int nPrede) {
        campo = new Cella[20][20];

        while(nPredatori > 0) {
            int xPredatore = (int) (Math.random()*20);
            int yPredatore = (int) (Math.random()*20);
            if(campo[yPredatore][xPredatore].isEmpty()) {
                predatori.add(new Predatore(yPredatore, xPredatore));
                campo[yPredatore][xPredatore].occupante = Predatore.simbolo;
                nPredatori--;
            }
        }
        
        while(nPrede > 0) {
            int xPreda = (int) (Math.random()*21);
            int yPreda = (int) (Math.random()*21);
            if(campo[yPreda][xPreda].isEmpty()) {
                predatori.add(new Preda(yPreda, xPreda));
                campo[yPreda][xPreda].occupante = Preda.simbolo;
                nPredatori--;
            }
        }
    }
    
    public static void simulazione() {
        if(preda.isEmpty()||predatori.isEmpty()) {
            System.out.println("Simulazione Terminata");
        } else {
            turnoPredatori();
            turnoPrede();
            simulazione();
        }
    }
    public static void turnoPrede() {
        for(Object p: preda) {
            Preda currentPreda = (Preda)p;
            int movement = (int) Math.random()*4; //0=su 1=destra 2=giu 3=sinistra
            switch(movement) {
                case 0: 
                    if(campo[currentPreda.y-1][currentPreda.x].isEmpty()) {
                        campo[currentPreda.y][currentPreda.x].occupante = '.';
                        campo[currentPreda.y-1][currentPreda.x].occupante = Preda.simbolo;
                        currentPreda.y--;
                    }
                break;
                case 1:
                    if(campo[currentPreda.y][currentPreda.x+1].isEmpty()) {
                        campo[currentPreda.y][currentPreda.x].occupante = '.';
                        campo[currentPreda.y][currentPreda.x+1].occupante = Preda.simbolo;
                        currentPreda.x++;
                    }
                break;
                case 2:
                    if(campo[currentPreda.y+1][currentPreda.x].isEmpty()) {
                        campo[currentPreda.y][currentPreda.x].occupante = '.';
                        campo[currentPreda.y+1][currentPreda.x].occupante = Preda.simbolo;
                        currentPreda.y++;
                    }
                break;
                case 3:
                    if(campo[currentPreda.y][currentPreda.x-1].isEmpty()) {
                        campo[currentPreda.y][currentPreda.x].occupante = '.';
                        campo[currentPreda.y][currentPreda.x-1].occupante = Preda.simbolo;
                        currentPreda.x--;
                    }
                break;
                default:
                    System.out.print("red dick, we fucked up alredy");
            }
            currentPreda.sopravvissutoPer++;
            
            if(currentPreda.sopravvissutoPer == 3) {
                
            }
        }
    }
    public static void turnoPredatori() {
        
    }
    
    public static void main(String[] args) {
        generaCampo(5, 100);
        simulazione();
    }
}
