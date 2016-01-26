package commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import commercialista.Commercialista;
import commercialista.Dipendente;
import commercialista.Imprenditore;
import commercialista.LiberoProfessionista;

public class TestCommercialista {

	@Test
	public void test() {
		Commercialista c = new Commercialista(new Dipendente[] {
				new Dipendente("Marco", "D'Inc�", "complicato"),
				new Imprenditore("Francesco", "Celato", "tante cose", "iva", "Francesco Celato", 50),
				new LiberoProfessionista("Tim", "chy", "robe", "iva", 130)
		});
		
		assertEquals(665, c.calcolaIncasso(), 0);
	}

}
