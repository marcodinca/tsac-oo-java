import java.util.ArrayList;

public class Azienda {
    public String ragioneSociale;
    public Dipendente[] dipendenti;
    
    public long calcoloStipendi() {
        long totStipendiCent = 0;
        for(Dipendente d: dipendenti) {
            totStipendiCent += d.getPaga();
        }
        return totStipendiCent/100; //converte la somma da centesimi di euro a euro
    }
    public Dipendente[] getMaxStipendio() {
        double maxStipendio = 0;
        for(Dipendente d: dipendenti) {
            double pagaDipentente = d.getPaga();
            if(pagaDipentente > maxStipendio) {
                maxStipendio = pagaDipentente;
            }
        }
        
        ArrayList dipendentiPagaMassima = new ArrayList();
        for(Dipendente d: dipendenti) {
            if(d.getPaga() == maxStipendio) {
                dipendentiPagaMassima.add(d);
            }
        }
        
        return (Dipendente[])dipendentiPagaMassima.toArray();
    }
}
