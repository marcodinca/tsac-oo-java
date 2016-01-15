package Salute;
public class Salute {
    
    private static double incrementoPercentuale(double valore, int percentuale) {
        return valore + ((valore/100)*percentuale);
    }
    
    public static double baseMetabolicRate(int altezza, int peso, int eta, String livelloAttivita, char sesso) {
        double mb = 0;
        if(sesso == 'm') {
            mb = 665 + (9.6 * peso) + (1.8 * altezza) + (4.7 * eta);
        } else {
            mb = 665 + (13.8 * peso) + (1.8 * altezza) + (4.7 * eta);
        }
        
        switch(livelloAttivita) {
            case "sedentario": mb = incrementoPercentuale(mb,20);
                break;
            case "moderatamente attivo": mb = incrementoPercentuale(mb,30);
                break;
            case "attivo": mb = incrementoPercentuale(mb,40);
                break;
            case "molto attivo": mb = incrementoPercentuale(mb,50);
                break;
        }
        
        return mb;
    }
    
    public static double imc(double massa, double altezza) {
        return massa / Math.pow(altezza,2);
    }
}
